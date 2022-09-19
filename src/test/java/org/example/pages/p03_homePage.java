package org.example.pages;

import org.example.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class p03_homePage {

    public WebElement currencyList(){
        WebElement currencyList = Hooks.driver.findElement(By.name("customerCurrency"));
        return currencyList;
    }
    public List<WebElement> Prices(){
        List<WebElement> prices = Hooks.driver.findElements(By.className("prices"));
        return prices;
    }
    public WebElement searchField(){
        WebElement searchField = Hooks.driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        return searchField;
    }
    public WebElement searchButton(){
        WebElement searchButton = Hooks.driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
        return searchButton;
    }
    public List<WebElement> searchResults(){
        List<WebElement> searchResults = Hooks.driver.findElements(By.className("product-title"));
        return searchResults;
    }
    public WebElement getSku(){
        WebElement sku = Hooks.driver.findElement(By.cssSelector("[class=\"sku\"] [class=\"value\"]"));
        return sku;
    }
    public List<WebElement> categoryList(){
        List<WebElement> categoryList = Hooks.driver.findElements(By.xpath("/html/body/div[6]/div[2]/ul[1]/li"));
        return categoryList;
    }
    public WebElement slider1(){
        WebElement slider1 = Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[1]"));
        return slider1;
    }
    public WebElement slider2(){
        WebElement slider2 = Hooks.driver.findElement(By.xpath("//*[@id=\"nivo-slider\"]/a[2]"));
        return slider2;
    }
    public WebElement facebookNetwork(){
        WebElement facebook = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
        return facebook;
    }
    public WebElement twitterNetwork(){
        WebElement twitter = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
        return twitter;
    }
    public WebElement newsNetwork(){
        WebElement news = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
        return news;
    }
    public WebElement youtubeNetwork(){
        WebElement youtube = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
        return youtube;
    }
    public WebElement htcWishlist(){
        WebElement htcWishlist = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        return htcWishlist;
    }
    public WebElement closeWishList(){
        WebElement closeWishList = Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/span"));
        return closeWishList;
    }
    public WebElement wishListMsg(){
        WebElement wishListMsg =Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        return wishListMsg;
    }
    public WebElement wishlistTab(){
        WebElement wishlistTab =Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]"));
        return wishlistTab;
    }
    public WebElement quantity(){
        WebElement quantity = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[6]/input"));

        return quantity;
    }
}
