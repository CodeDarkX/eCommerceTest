package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jdk.jfr.Timespan;
import org.example.pages.p03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class s06_sliders {
    p03_homePage homePage = new p03_homePage();
    String expectedSlider1Link;
    String expectedSlider2Link;

    @Given("user clicks on 1st slider for Nokia")
    public void click1stSlider(){
        expectedSlider1Link = "https://demo.nopcommerce.com/nokia-lumia-1020";

            WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOf(homePage.slider1())).click();

    }

    @Then("the Nokia tab opens")
    public void theNokiaTabOpens() {
        String slider1Link = Hooks.driver.getTitle();
        Assert.assertTrue(slider1Link.contains(expectedSlider1Link));
    }


    @Given("user clicks on 2st slider for iphone")
    public void click2stSlider(){
        expectedSlider2Link = " https://demo.nopcommerce.com/iphone-6";

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(homePage.slider2())).click();

    }

    @Then("the iphone tab opens")
    public void theiphoneTabOpens() {
        String slider2Link = Hooks.driver.getTitle();
        Assert.assertTrue(slider2Link.contains(expectedSlider2Link));
    }
}
