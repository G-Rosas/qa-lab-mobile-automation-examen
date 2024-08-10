package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.serenitybdd.core.pages.PageObject;

public class CatalogScreen extends PageObject{

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement lblCatalogProductTest;

    public boolean isProductDisplayed(){

        waitFor(ExpectedConditions.visibilityOf(lblCatalogProductTest));
        return lblCatalogProductTest.isEnabled();
    }

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement lblCatalogProduct1;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement lblCatalogProduct2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement lblCatalogProduct3;


}
