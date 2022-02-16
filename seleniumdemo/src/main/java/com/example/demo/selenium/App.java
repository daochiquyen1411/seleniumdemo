package com.example.demo.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement mnuPhone = driver.findElement(By.xpath("//*[contains(text(),'Phones')]"));
        WebElement lnkFirstPhone = driver.findElement(By.xpath("//*[contains(@class, 'hrefch') and @href = 'prod.html?idp_=1']"));

        //mnuPhone.click();
        lnkFirstPhone.click();
      
        Thread.sleep(2000);
        WebElement btnAddToCart = driver.findElement(By.cssSelector(".btn-success"));

        btnAddToCart.click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();


        WebElement tabCart = driver.findElement(By.id("cartur"));
        tabCart.click();
        Thread.sleep(2000);

        WebElement btnPlaceOrder = driver.findElement(By.cssSelector(".btn-success"));
        btnPlaceOrder.click();
        Thread.sleep(1000);

        WebElement txtName = driver.findElement(By.id("name"));
        WebElement txtCountry = driver.findElement(By.id("country"));
        WebElement txtCity = driver.findElement(By.id("city"));
        WebElement txtCreditCard = driver.findElement(By.id("card"));
        WebElement txtMonth = driver.findElement(By.id("month"));
        WebElement txtYear = driver.findElement(By.id("year"));
        WebElement btnPurchase = driver.findElement(By.xpath("//button[contains(text(), 'Purchase')]"));


        txtName.sendKeys("testing name");
        txtCountry.sendKeys("testing country");
        txtCity.sendKeys("testing city");
        txtCreditCard.sendKeys("testing credit card");
        txtMonth.sendKeys("12");
        txtYear.sendKeys("2021");
        btnPurchase.click();
        Thread.sleep(1000);

        WebElement lblThankYourPurchase = driver.findElement(By.xpath("//h2[contains(text(), 'Thank you for your purchase!')]"));
        WebElement logoSuccess = driver.findElement(By.cssSelector(".sa-placeholder"));

        if(logoSuccess.isDisplayed() && lblThankYourPurchase.isDisplayed()){
            System.out.println("Ordered successfully");
        }
        else{
            System.out.println("Orderd error");
        }
        driver.quit();


    }
}
