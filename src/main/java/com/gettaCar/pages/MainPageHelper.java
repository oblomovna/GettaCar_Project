package com.gettaCar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHelper extends PageBase{
    public MainPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='center']//div//span//a[@href='/used']")
    WebElement chooseCarButton;

    public FiltersPageHelper tapOnChooseCarButton() {
        chooseCarButton.click();
        return new FiltersPageHelper(driver);

    }
}
