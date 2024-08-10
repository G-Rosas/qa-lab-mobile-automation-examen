package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductosScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement lblCatalogProduct1;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement lblCatalogProduct2;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement lblCatalogProduct3;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnMas;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregar;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement txtCant;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCarrito;

    public WebElement getLblCatalogProduct1() {
        return lblCatalogProduct1;
    }

    public WebElement getLblCatalogProduct2() {
        return lblCatalogProduct2;
    }

    public WebElement getLblCatalogProduct3() {
        return lblCatalogProduct3;
    }

    public WebElement getBtnAgregar() {
        return btnAgregar;
    }

    public WebElement getBtnMas() {
        return btnMas;
    }

    public WebElement getBtnCarrito() {
        return btnCarrito;
    }

    public void clickAlCarrito() {
        getBtnCarrito().click();
    }
}
