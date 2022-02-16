package com.example.demo.selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckOutInfoPopup extends BasePage {

    public CheckOutInfoPopup(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(how = How.ID, using = "name")
    private WebElement txtName;
    @FindBy(how = How.ID, using = "country")
    private WebElement txtCountry;
    @FindBy(how = How.ID, using = "city")
    private WebElement txtCity;
    @FindBy(how = How.ID, using = "card")
    private WebElement txtCreditCard;
    @FindBy(how = How.ID, using = "month")
    private WebElement txtMonth;
    @FindBy(how = How.ID, using = "year")
    private WebElement txtYear;
    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Purchase')]")
    private WebElement btnPurchase;

    public ConfirmationPopup placeOrder() throws InterruptedException {
        this.txtName.sendKeys("testing name");
        this.txtCountry.sendKeys("testing country");
        this.txtCity.sendKeys("testing city");
        this.txtCreditCard.sendKeys("testing credit card");
        this.txtMonth.sendKeys("12");
        this.txtYear.sendKeys("2021");
        this.btnPurchase.click();
        Thread.sleep(1000);
        return new ConfirmationPopup(this.driver);
    }
}
