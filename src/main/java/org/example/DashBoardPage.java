package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashBoardPage {


    WebDriver driver;
    private By claimButton = By.xpath("//a[@href='/web/index.php/claim/viewClaimModule']");

    public DashBoardPage(WebDriver driver){
        this.driver =   driver;
    }

    public void clickClaim(){
        WebElement claimButtonElement = driver.findElement(claimButton);
        String url = claimButtonElement.getAttribute("href");
        driver.navigate().to(url);

    }

}
