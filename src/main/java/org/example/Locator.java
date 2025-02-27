package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(new By.ById("inputUsername")).sendKeys("Nishant");
        driver.findElement(By.name("inputPassword")).sendKeys("123456789");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.className("signInBtn")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        //to fetch error message we need to stop main thread.
        Thread.sleep(1000);
        //error message need time
        System.out.println(driver.findElement(By.className("error")).getText());

    }
}
