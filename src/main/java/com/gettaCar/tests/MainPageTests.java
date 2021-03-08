package com.gettaCar.tests;

import com.gettaCar.pages.MainPageHelper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTests extends TestBase {

    MainPageHelper mainPageHelper;


    @BeforeMethod(alwaysRun = true)
    public void initTest(){
        mainPageHelper = PageFactory.initElements(driver,MainPageHelper.class);
    }

    @Test
    public void chooseCarButton(){
        mainPageHelper.tapOnChooseCarButton();
    }
}
