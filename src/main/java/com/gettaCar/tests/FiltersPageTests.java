package com.gettaCar.tests;

import com.gettaCar.pages.FiltersPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FiltersPageTests extends TestBase{

    FiltersPageHelper filtersPageHelper;


    @BeforeMethod(alwaysRun = true)
    public void initTest() {
        filtersPageHelper = PageFactory.initElements(driver, FiltersPageHelper.class);

    }
    @Test
    public void selectPickupTypeAndComparePrise(){
        filtersPageHelper.tapOnBodyType()
                .tapOnPickupType()
                .tapOnFirstCar()
                .comparingPrise();

    }
}
