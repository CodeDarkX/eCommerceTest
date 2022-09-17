package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p02_login;
import org.openqa.selenium.Keys;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

import java.security.Key;

public class s02_login {
    p02_login login = new p02_login();

    @Given("user go to login page")
    public void goToLoginPage(){
        login.LoginPage().click();
    }

    @When("user login with \"valid\" \"test1@gmail.com\" and \"P@ssw0rd\"")
    public void enterLoginData(){
        s01_register regData = new s01_register();
        login.loginPageEmail().sendKeys(regData.email);
        login.loginPagePassword().sendKeys(regData.password);
    }

        @And("user press on login button")
        public void pressLogin() {
            login.loginPageLoginButton().click();
        }

    @Then("user login to the system successfully")
    public void successfulLogin(){
        String expectedUrl = "https://demo.nopcommerce.com/";
        String currentUrl = Hooks.driver.getCurrentUrl();

        //Soft Assertion
        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(expectedUrl,currentUrl);
        softAssert.assertTrue(login.loginPageMyAccount().isDisplayed());
        softAssert.assertAll();
    }

    @When("user login with \"invalid\" \"wrong@example.com\" and \"P@ssw0rd\"")
    public void wrongLoginData(){
        login.loginPageEmail().sendKeys("wrong@example.com");
        login.loginPagePassword().sendKeys("P@ssw0rd");
    }
    @Then("user could not login to the system")
    public void wrongLogin(){

        String errMsg = login.loginPageErrorMsg().getText();
        String expectedMsg = "Login was unsuccessful";
        String msgColor = login.loginPageErrorMsg().getCssValue("color");
        String errMsgColor = Color.fromString(msgColor).asHex();
        String expectedErrMsgColor = "#e4434b";

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errMsg.contains(expectedMsg));
        softAssert.assertEquals(errMsgColor,expectedErrMsgColor);
        softAssert.assertAll();
    }

}
