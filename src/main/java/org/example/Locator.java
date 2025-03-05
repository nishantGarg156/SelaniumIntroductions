package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Objects;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class Locator {

   // public void register

    public static void main(String[] args ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(new By.ById("inputUsername")).sendKeys("Nishant");
        driver.findElement(By.name("inputPassword")).sendKeys("123456789");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("error")));
        String errorMessage =  driver.findElement(By.className("error")).getText();
        if(!errorMessage.isEmpty()){
            driver.findElement(By.id("visitUsTwo")).click();
            String userName = driver.findElement(By.id("inputUsername")).getText();
            String Password = driver.findElement(By.name("inputPassword")).getText();
        }

    }
}
