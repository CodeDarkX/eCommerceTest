package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.p03_homePage;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class s07_follow {
    p03_homePage homePage = new p03_homePage();
    @Given("user opens facebook link")
    public void openFacebook(){
        homePage.facebookNetwork().click();
    }

    @Then("{string} is opened in new tab for facebook")
    public void isOpenedInNewTab(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), arg0);
    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        homePage.twitterNetwork().click();
    }

    @Then("{string} is opened in new tab for twitter")
    public void isOpenedInNewTabForTwitter(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), arg0);
    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        homePage.newsNetwork().click();
    }

    @Then("{string} is opened in new tab for neww")
    public void isOpenedInNewTabForNeww(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), arg0);
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        homePage.youtubeNetwork().click();
    }

    @Then("{string} is opened in new tab for youtube")
    public void isOpenedInNewTabForYoutube(String arg0) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Assert.assertEquals(Hooks.driver.getCurrentUrl(), arg0);
    }
}
