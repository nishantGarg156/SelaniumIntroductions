package org.example;

import com.google.common.reflect.Reflection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumImplementationOne {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/web-table-element.php");
       String price = driver.findElement(By.xpath("//a[contains(text(), 'DCB Bank')]/ancestor::td/following-sibling::td[3]")).getText();
        System.out.println(price);




    }

}
