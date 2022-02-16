package com.example.demo.selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }
    
    // page elements
    @FindBy(how = How.CSS, using = ".btn-success")
    private WebElement btnPlaceOrder;

    //page actions
    public CheckOutInfoPopup placeOrder() throws InterruptedException{
        this.btnPlaceOrder.click();
        Thread.sleep(2000);
        return new CheckOutInfoPopup(this.driver);
    }
}
