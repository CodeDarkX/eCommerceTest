package org.example.pages;

import org.example.steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class p01_register {
    public WebElement registerLink(){
        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }

     public WebElement genderRadio(){
        WebElement gender = Hooks.driver.findElement(By.id("gender-male"));
        return gender;
     }

     public WebElement firstName(){
        WebElement firstName = Hooks.driver.findElement(By.name("FirstName"));
        return firstName;
     }

    public WebElement lastName(){
        WebElement lastName = Hooks.driver.findElement(By.name("LastName"));
        return lastName;
    }

    public WebElement email(){
        WebElement email = Hooks.driver.findElement(By.name("Email"));
        return email;
    }

    public WebElement password(){
        WebElement pass = Hooks.driver.findElement(By.name("Password"));
        return pass;
    }

    public WebElement secondPassword() {
        WebElement secondPass = Hooks.driver.findElement(By.name("ConfirmPassword"));
        return secondPass;
    }

    public WebElement registerButton() {
        WebElement regButton = Hooks.driver.findElement(By.name("register-button"));
        return regButton;
    }

    public WebElement successMessag() {
        WebElement successMsg = Hooks.driver.findElement(By.className("result"));
        return successMsg;
    }
}
