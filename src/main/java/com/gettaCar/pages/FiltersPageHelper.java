package com.gettaCar.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class FiltersPageHelper extends PageBase {
    String priceText;

    public FiltersPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")
    WebElement bodyType;

    @FindBy(xpath = "//a[contains(text(),'Pickup')]")
    WebElement pickupType;

    @FindBy(className = "price-box-details_carPrice__2OTPp")
    WebElement carPrise;


    public FiltersPageHelper tapOnBodyType() {
        bodyType.click();
        return this;
    }

    public FiltersPageHelper tapOnPickupType() {
        pickupType.click();
        return this;
    }

    public FiltersPageHelper tapOnFirstCar() {
        List<WebElement> carsList = driver.findElements(By.className("car-card_car-card__19FY8"));
        carsList.get(0).click();
        return this;
    }

    public FiltersPageHelper comparingPrice() {
        priceText = carPrise.getText();
        double price = Double.parseDouble(priceText.substring(1).replaceAll(",", ""));
        System.out.println(price);
        System.out.println(priceText);

        if (price >= 20000) {
            System.out.println("High");
        } else {
            System.out.println("Low");
        }
        return this;
    }
}


