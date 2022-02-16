package com.example.demo.selenium.Test;

import com.example.demo.selenium.Page.CartPage;
import com.example.demo.selenium.Page.CheckOutInfoPopup;
import com.example.demo.selenium.Page.ConfirmationPopup;
import com.example.demo.selenium.Page.PhonePage;
import com.example.demo.selenium.Page.ProductDetailPage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlaceOrderPageTest extends BaseTest{
    
    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://www.demoblaze.com/");
        this.driver.manage().window().maximize();    
    }

    @Test
    public void testPlaceOrderSuccesfully() throws InterruptedException{
        Thread.sleep(2000);
        PhonePage phonePage = new PhonePage(this.driver);
        ProductDetailPage productDetailPage = phonePage.selectFristProduct();
        productDetailPage.addProductToCart();

        CartPage cartPage = productDetailPage.navigateToCartPage();
        CheckOutInfoPopup checkOutPopup = cartPage.placeOrder();

        ConfirmationPopup confirmation = checkOutPopup.placeOrder();
        Thread.sleep(1000);
        Assert.assertTrue(confirmation.isPlaceOrderSuccesfully(), "Order ko duoc");
    }


    @AfterMethod
    public void tearDown(){
        this.driver.quit();
    }
}
