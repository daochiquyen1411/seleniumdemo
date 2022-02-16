package com.example.demo.selenium.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PhonePage extends BasePage {

    public PhonePage(WebDriver driver) {
        super(driver);
    }

    // page elements
    @FindBy(how = How.XPATH, using = "//a[@href = 'prod.html?idp_=1' and contains(@class, 'hrefch')]")
    private WebElement lnkFirstProduct;

    // page actions
    public ProductDetailPage selectFristProduct() throws InterruptedException{
        this.lnkFirstProduct.click();
        Thread.sleep(2000);
        return new ProductDetailPage(this.driver);
    }
}
