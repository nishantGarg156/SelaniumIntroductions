package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClaimPage {
    WebDriver driver;
    WebDriverWait wait;
    JavascriptExecutor js;
    private By SubmitClaim = By.xpath("//a[contains(text(), 'Submit Claim')]");
    private By selectEvent = By.xpath("(//div[@class='oxd-select-text--after']/i)[1]");
    private By selectEventOption = By.xpath("//div[contains(@class, 'oxd-select-dropdown') and contains(., 'Accommodation')]");
    private By selectCurrency = By.xpath("(//div[@class='oxd-select-text--after'])[2]");
    private By selectCurrencyOpt = By.xpath("//div[@class='oxd-select-option']//span[contains(text(), 'Indian')]");
    private By textBox = By.tagName("textarea");
    private By createButton = By.xpath("//button[@type='submit']");
    private By fetchReferenceIdBox = By.xpath("//input[@class='oxd-input oxd-input--active' and @disabled]");



    public ClaimPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor)driver;
    }

    public By getFetchReferenceIdBox() {
        return fetchReferenceIdBox;
    }

    public void submitClaim(){
        WebElement submitClaimElement = driver.findElement(SubmitClaim);
        submitClaimElement.click();
    }

    public void selectEvent(){
        WebElement selectEventElement =  driver.findElement(selectEvent);
        selectEventElement.click();
        WebElement eventopt = driver.findElement(selectEventOption);
        eventopt.click();

    }

    public void selectCurrenecy(){
        WebElement selectCurrency1 = driver.findElement(selectCurrency) ;
        selectCurrency1.click();

        WebElement selectCurrencyOPT = driver.findElement(selectCurrencyOpt);
        selectCurrencyOPT.click();
    }

    public void  enterRemark(String remark){
        WebElement remarkElement = driver.findElement(textBox);
        remarkElement.sendKeys(remark);
    }

    public void clickCreateButton(){
        WebElement  createButtonElement = driver.findElement(createButton);
        createButtonElement.click();

    }

    public String fetchRefernceId() {
        WebElement referencedIdElement = wait.until(ExpectedConditions.visibilityOfElementLocated(fetchReferenceIdBox));
        wait.until(d -> !((String) js.executeScript("return arguments[0].value", referencedIdElement)).isEmpty());
        String referenceID = referencedIdElement.getAttribute("value");
        return referenceID;



    }

    public boolean validClaim(String ReFID){
        driver.findElement(By.xpath("(//a[contains(@class, 'oxd-topbar-body-nav-tab-item')])[2]")).click();
        WebElement validClaimElement = driver.findElement(By.xpath("//div[contains(text(),'"+ ReFID+"')]"));
        return !(validClaimElement.isSelected());

    }














}
