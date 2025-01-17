package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class CarritoScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement txtProducto;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement txtCant;

    public WebElement getTxtProducto() {
        return txtProducto;
    }

    public WebElement getTxtCant() {
        return txtCant;
    }
}
