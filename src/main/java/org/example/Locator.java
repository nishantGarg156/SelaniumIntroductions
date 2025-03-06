package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Objects;

import static com.google.common.util.concurrent.Futures.withTimeout;

public class Locator {

   // public void register

    public static void main(String[] args ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement link = driver.findElement(By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']"));
        String url = link.getAttribute("href"); // Get the href value
        driver.navigate().to(url);
        driver.findElement(By.xpath("//a[contains(text(), 'Submit Claim')]")).click();



        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text--after'])[1]")));
        element.click();

        WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'oxd-select-dropdown') and contains(., 'Accommodation')]")));
        element1.click();

        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='oxd-select-text--after'])[2]")));
        element2.click();

        WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='oxd-select-option']//span[contains(text(), 'Indian')]")));
        element3.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.tagName("textarea"))).sendKeys("Nishant");

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        By claimRefLocator = By.xpath("//input[@class='oxd-input oxd-input--active' and @disabled]");

        WebElement claimRefField = wait.until(ExpectedConditions.presenceOfElementLocated(claimRefLocator));

        String referenceID = claimRefField.getAttribute("value");
        System.out.println("Claim Reference ID: " + referenceID);











    }

    }

