package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.p03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.Locale;
import java.util.Timer;

public class s04_search {
    p03_homePage homePage = new p03_homePage();

    @Given("User searched for {string} from the homepage")
    public void userSearchedForFromTheHomepage(String arg0) {
        homePage.searchField().sendKeys(arg0);
        homePage.searchButton().click();

    }
    @Then("the search results for {string} are relevant")
    public void theSearchResultsForAreRelevant(String arg0) throws InterruptedException {
        int productCount = homePage.searchResults().size();
        String currentUrl = Hooks.driver.getCurrentUrl();

        String expectedUrl = "https://demo.nopcommerce.com/search?q=";


        SoftAssert softAssert = new SoftAssert();
        Thread.sleep(2000);
        softAssert.assertTrue(currentUrl.contains(expectedUrl));
        softAssert.assertFalse(productCount == 0);
        for (int x = 0; x < productCount;x++){
                String item = homePage.searchResults().get(x).getText().toLowerCase(Locale.ROOT);
                softAssert.assertTrue(item.contains(arg0));
        }
        softAssert.assertAll();
    }

    @Given("User searched for items using {string} from the homepage")
    public void userSearchedForItemsUsingFromTheHomepage(String arg0) {
        homePage.searchField().sendKeys(arg0);
        homePage.searchButton().click();
    }

    @Then("the search result using {string} is relevant")
    public void theSearchResultUsingIsRelevant(String arg0) {
        int productCount = homePage.searchResults().size();
        Assert.assertTrue(productCount == 1);

        homePage.searchResults().get(0).click();
        String actualSk = homePage.getSku().getText();
        Assert.assertEquals(actualSk, arg0);
    }
}