package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashBoardPage {


    WebDriver driver;
    private By claimButton = By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']");
    private By AdminButton = By.xpath("//span[text()='Admin']/parent::a");
    private By addUserButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");

    public DashBoardPage(WebDriver driver){
        this.driver =   driver;
    }

    public void clickClaim(){
        WebElement claimButtonElement = driver.findElement(claimButton);
        String url = claimButtonElement.getAttribute("href");
        driver.navigate().to(url);

    }
    public void navigateToAdminPannel(){
        WebElement adminPannelElement = driver.findElement(AdminButton);
        adminPannelElement.click();
    }
    public void clickOnAddUserButton(){
        WebElement addUserButtonElement = driver.findElement(addUserButton);
        addUserButtonElement.click();
    }

}
