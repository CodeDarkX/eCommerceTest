package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.implementation.ToStringMethod;
import org.example.pages.p03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;
import java.util.Random;

public class s05_hover {
    p03_homePage homePage = new p03_homePage();
    Random random = new Random();
    Actions action = new Actions(Hooks.driver);
    int rNum = random.nextInt(3);
    String subCatText = "";

    @Given("user hover on one of the first categories in the homepage")
    public void HoverMain() throws InterruptedException {
        action.moveToElement(homePage.categoryList().get(rNum)).perform();
        Thread.sleep(1000);
    }


    @Then("Hover on one of the sub categories and get its text then click on it")
    public void hoverOnOneOfTheSubCategoriesAndGetItsTextThenClickOnIt(){
        String subRNum = (rNum +1) + "";
       List<WebElement> subCat = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li["+ subRNum +"]/ul//a"));
        action.moveToElement(subCat.get(rNum)).perform();
        subCatText = subCat.get(rNum).getText().toLowerCase();
        action.moveToElement(subCat.get(rNum)).click().perform();

    }

    @Then("User gets the page title and compair it to the usb category text")
    public void userGetsThePageTitleAndCompairItToTheUsbCategoryText() {
        String pageTitle = Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1")).getText().toLowerCase();
        Assert.assertTrue(subCatText.contains(pageTitle));
    }

}
