package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;

    private By userRoleDropDown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    private By statusDropDown = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    private By EmployeeNameTag = By.xpath("//input[@placeholder='Type for hints...'");
    private By userNameTag = By.xpath("//label[contains(text(),'Username')]/../following-sibling::div/input");
    private By passwordTag = By.xpath("//label[text()='Password']/../following-sibling::div/input");
    private By confirmPassword = By.xpath("//label[contains(text(),'Confirm Password')]/../following-sibling::div/input");




    public  AdminPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor)driver;
    }

    /***
     * @author: nishant Garg
     * @param : username, password, confirmPassword
     */

    public void createUser(){
        WebElement userRoleDropDownElement = driver.findElement(userRoleDropDown);
        WebElement stausDropDownElement = driver.findElement(statusDropDown);
        WebElement EmployeeNameTagElement = driver.findElement(EmployeeNameTag);
        WebElement userNameTagElement = driver.findElement(userNameTag);
        WebElement passwordTagElement = driver.findElement(passwordTag);
        WebElement confirmPasswordElement = driver.findElement(confirmPassword);
    }






}
