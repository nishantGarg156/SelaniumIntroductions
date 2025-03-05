package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.nexaexperience.com/");
        String mainWindow = driver.getWindowHandle();
        WebElement facebook = driver.findElement(By.xpath(""));
        facebook.click();
        Set<String> windowHandler = driver.getWindowHandles();
        for (String window : windowHandler) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to new window");
                break;
            }
        }
        System.out.println("New Window Title: " + driver.getTitle());
        driver.close();
        driver.switchTo().window(mainWindow);

        System.out.println("Back to main window: " + driver.getTitle());

        driver.quit();


    }

}
