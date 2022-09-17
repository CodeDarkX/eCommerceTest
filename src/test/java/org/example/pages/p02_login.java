package org.example.pages;

import org.example.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class p02_login {
    public WebElement LoginPage(){
        WebElement loginPage = Hooks.driver.findElement(By.cssSelector("a[class=ico-login]"));
        return loginPage;
    }
    public WebElement loginPageEmail(){
        WebElement loginEmail = Hooks.driver.findElement(By.name("Email"));
        return loginEmail;
    }
    public WebElement loginPagePassword(){
        WebElement loginPass = Hooks.driver.findElement(By.name("Password"));
        return loginPass;
    }
    public WebElement loginPageLoginButton(){
        WebElement loginButton = Hooks.driver.findElement(By.cssSelector("form[method=\"post\"] button[type =\"submit\"]"));
        return loginButton;
    }
    //
    public WebElement loginPageMyAccount(){
        WebElement myAccount = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        return myAccount;
    }
    public WebElement loginPageErrorMsg(){
        WebElement errorMsg = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]"));
        return errorMsg;
    }
}
