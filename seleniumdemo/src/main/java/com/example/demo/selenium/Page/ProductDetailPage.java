package com.example.demo.selenium.Page;

import com.example.demo.selenium.Page.Components.NavigationMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPage extends BasePage {

    
    public ProductDetailPage(WebDriver driver) {
        super(driver);

    }  
    // Page elements
    @FindBy(how = How.CSS, using = ".btn-success")
    private WebElement btnAddToCart;

    // Page actions
    public void addProductToCart() throws InterruptedException{
        this.btnAddToCart.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
    }
}
