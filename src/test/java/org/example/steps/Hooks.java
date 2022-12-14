package org.example.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;

    @Before
    public void openBrowser(){
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\resources_files\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();

        //configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigation
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
