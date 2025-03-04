package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.Driver;
import java.time.Duration;

public class DropDown {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ZERO);
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement Ddown = driver.findElement(By.xpath("//select[@name='country']"));
        Select down = new Select(Ddown);
        down.selectByValue("INDIA");
        WebElement first_name = driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement last_name = driver.findElement(By.xpath("//input[@name='lastName']"));
        WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        WebElement button = driver.findElement(By.xpath("//input[@name='submit']"));

        first_name.sendKeys("Nishant");
        last_name.sendKeys("Garg");
        username.sendKeys("nishantGarg");
        password.sendKeys("nishant");
        confirmPassword.sendKeys("nishant");
        button.click();

        String actual = driver.findElement(By.xpath("//font[contains(text(), 'Thank you for registering')]")).getText();
        String expectedResult = "Thank you for registering. You may now sign-in using the user name and password you've just .";
        Assert.assertEquals(actual , expectedResult, "Test Case Failed");




    }
}
