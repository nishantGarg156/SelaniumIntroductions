package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginPage {
   WebDriver driver;
    private By usernameField = By.xpath("//input[@name='username']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By errorMessage = By.className(".oxd-alert-content-text");

    public LoginPage(WebDriver driver){
       this.driver = driver;
   }

   public void enterUserName(String username){
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
   }

   public void enterPassword(String password){
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
   }

    public String getErrorMessage() {
        WebElement errorElement = driver.findElement(errorMessage);
        return errorElement.getText();
    }

   public void clickLoginButton(){
       WebElement loginButtonElement = driver.findElement(loginButton);
       loginButtonElement.click();
   }

  // To perform login-------
   public void login(String username , String password){
        enterUserName(username);
        enterPassword(password);
        clickLoginButton();
   }


}
