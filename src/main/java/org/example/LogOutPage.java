package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogOutPage {
    WebDriver driver;
    private By clickerDropDown = By.xpath("//span[@class='oxd-userdropdown-tab']");
    private By logOutButton = By.xpath("//a[text()='Logout']");
    private By checker = By.xpath("//h5[text()='Login']");

    public LogOutPage(WebDriver driver){
        this.driver = driver;
    }

    public boolean logOut(){
        driver.findElement(clickerDropDown).click();
        driver.findElement(logOutButton).click();
        return driver.findElement(checker).isDisplayed();
    }

}
