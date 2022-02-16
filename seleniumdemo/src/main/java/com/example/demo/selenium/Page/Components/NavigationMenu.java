package com.example.demo.selenium.Page.Components;

import com.example.demo.selenium.Page.BasePage;
import com.example.demo.selenium.Page.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu{

    public WebDriver driver;
    
    public NavigationMenu(WebDriver driver) {
        this.driver = driver;
    }
    
    // page elements
    private WebElement lnkCart = this.driver.findElement(By.xpath("//*[text() = 'Cart']"));
    // page actions
    public CartPage navigateToCartPage() throws InterruptedException{
        this.lnkCart.click();
        Thread.sleep(1000);
        return new CartPage(this.driver);
    }
}
