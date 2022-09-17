package org.example.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class s01_register {
    String email = "test1@gmail.com";
    String password = "P@ssw0rd";
    p01_register register = new p01_register();

    @Given("user go to register page")
    public void goRegisterPage(){
        register.registerLink().click();

    }

    @When("user select gender type")
    public void selectGender(){
        // select Male
        register.genderRadio().click();
    }

    @And("user enter first name \"automation\" and last name \"tester\"")
    public void enterNames(){
        register.firstName().sendKeys("automation");
        register.lastName().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void enterDateOfBirth(){
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay")));
        select.selectByIndex(13);

        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByIndex(4);

        select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1989");
    }

    @And("user enter email \"test1@gmail.com\" field")
    public void enterEmail(){

        register.email().sendKeys(email);

    }

    @And("user fills Password 1st field \"P@ssw0rd\" and 2nd field \"P@ssw0rd\"")
    public void enterPassword(){

        register.password().sendKeys(password);
        register.secondPassword().sendKeys(password);
    }

    @And("user clicks on register button")
    public void clickRegButton(){
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageDisplayed(){
        String expectedMsg = "Your registration completed";
        String actualMsg = register.successMessag().getText();

        Assert.assertTrue(actualMsg.contains(expectedMsg));
    }
}
