package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.p03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class s03_currency {
    p03_homePage homePage = new p03_homePage();

    @Given("User go to homepage and select Euro from the currency list")
    public void changeCurrency() {
        Select select = new Select(homePage.currencyList());
        select.selectByVisibleText("Euro");
    }

    @Then("The items' prices in home page turn into Euro")
    public void theItemsPricesInHomePageTurnIntoEuro() {
        for(int x =0;x < 4;x++){
            String value = homePage.Prices().get(x).getText();
            System.out.println(value);
            Assert.assertTrue(value.contains("€"));

        }
    }
}
