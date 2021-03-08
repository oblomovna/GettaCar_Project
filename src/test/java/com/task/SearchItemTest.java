package com.task;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SearchItemTest {
   /* WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "//Users/korypaev/Desktop/Tools/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.gettacar.com");
    }
    @Test
    public void priceValidationTest(){

        WebElement chooseCarButton = driver.findElement(By.xpath("//div[@class='center']//div//span//a[@href='/used']"));
        chooseCarButton.click();
        WebElement selectBodyType = driver.findElement(By.xpath("//h5[contains(text(),'Body type')]"));
        selectBodyType.click();
        WebElement selectPickupType = driver.findElement(By.xpath("//a[contains(text(),'Pickup')]"));
        selectPickupType.click();
        List<WebElement> carsList = driver.findElements(By.className("car-card_car-card__19FY8"));
        carsList.get(0).click();

        WebElement carPrice = driver.findElement(By.className("price-box-details_carPrice__2OTPp"));
        String priceText = carPrice.getText();

        double price = Double.parseDouble(priceText.substring(1).replaceAll(",",""));
        System.out.println(price);
        System.out.println(priceText);

        if (price>=20000){
            System.out.println("High");
        }else{
            System.out.println("Low");
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }*/
}



