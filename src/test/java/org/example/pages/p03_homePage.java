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
}
