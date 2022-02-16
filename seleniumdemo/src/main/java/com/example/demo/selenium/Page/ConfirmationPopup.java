package com.example.demo.selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ConfirmationPopup extends BasePage {

    public ConfirmationPopup(WebDriver driver) {
        super(driver);
    }
    
    // page elements
    private WebElement lblThankYourPurchase = driver.findElement(By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]"));
    private WebElement logoSuccess = driver.findElement(By.cssSelector(".sa-placeholder"));

    // page actions

    // page validation
    public boolean isPlaceOrderSuccesfully(){
        if(this.lblThankYourPurchase.isDisplayed() && this.logoSuccess.isDisplayed()){
            return true;
        }
        return false;
    }

}
