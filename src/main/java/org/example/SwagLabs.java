package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class SwagLabs {
    public static void main(String[] args) throws InterruptedException {
      //  ChromeOptions opt = new ChromeOptions();
     //   opt.addArguments("--headless=new");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        String title = driver.getTitle();
        String pageSource = driver.getPageSource();
        System.out.println(title);
        System.out.println(pageSource);
        String fetchedTitle = driver.findElement(By.className("login_logo")).getText();
        System.out.println(fetchedTitle);

        WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        username.sendKeys("standard_user");
        password.sendKeys("secret_sauce");
        loginButton.click();
        Thread.sleep(1000);
        //driver.navigate().refresh();
        String value = driver.findElement(By.xpath("//*[text()='Products']")).getDomAttribute("data-test");
        System.out.println(value);
        Boolean flag = driver.findElement(By.xpath("//*[text()='Products']")).isDisplayed();
        System.out.println(flag);



    }
}
