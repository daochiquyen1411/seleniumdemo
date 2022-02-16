package com.example.demo.selenium.Page;

import com.example.demo.selenium.Page.Components.NavigationMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public WebDriver driver;
    //public NavigationMenu mnuNavigate;

    public BasePage(WebDriver driver){
        this.driver = driver;
        //this.mnuNavigate = new NavigationMenu(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    public CartPage navigateToCartPage() throws InterruptedException{
        this.driver.findElement(By.id("cartur")).click();
        Thread.sleep(2000);
        return new CartPage(this.driver);
    }
}
