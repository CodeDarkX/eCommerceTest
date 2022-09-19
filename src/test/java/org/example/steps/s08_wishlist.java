package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.p03_homePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class s08_wishlist {
    p03_homePage homePage = new p03_homePage();

    @Given("user goes to the homepage and added a phone to his wishlist")
    public void addToWishlist(){
        homePage.htcWishlist().click();
    }

    @Then("The phone is added to the wishlist")
    public void thePhoneIsAddedToTheWishlist() throws InterruptedException {
        Thread.sleep(1000);
       String wishlistColor = Color.fromString(homePage.wishListMsg().getCssValue("background-color")).asHex();
       String expectedColor = "#4bb07a";

        Thread.sleep(1000);
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(wishlistColor,expectedColor);
        soft.assertTrue(homePage.wishListMsg().isDisplayed());
        soft.assertAll();
    }


    @Then("User click on the wishlist tab and check quantity")
    public void userClickOnTheWishlistTabAndCheckQuantity() throws InterruptedException {
        Thread.sleep(500);
        homePage.closeWishList().click();
        Thread.sleep(500);
        homePage.wishlistTab().click();
        Thread.sleep(500);

        int quantity = Integer.parseInt( homePage.quantity().getAttribute("value"));

        Assert.assertTrue(quantity > 0);


    }
}
