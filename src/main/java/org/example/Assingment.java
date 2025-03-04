package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
public class Assingment {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       String errorMessage =  driver.findElement(By.cssSelector(".orangehrm-login-forgot>p")).getText();
        System.out.println(errorMessage);
        WebElement userName =  driver.findElement(By.xpath("//*[@placeholder='Username']"));
        WebElement password = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        userName.sendKeys("Admin");
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        String title = driver.getTitle();
        System.out.println(title);
        String text = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
        System.out.println(text);
        WebElement element = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
        File elementScreenshot = element.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("element_screenshot.png");
        FileUtils.copyFile(elementScreenshot, destinationFile);
        driver.close();


    }
}
