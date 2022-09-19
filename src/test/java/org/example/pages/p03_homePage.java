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
}
