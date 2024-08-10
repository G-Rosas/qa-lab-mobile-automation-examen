package com.nttdata.steps;

import com.nttdata.screens.CatalogScreen;
import com.nttdata.screens.ProductosScreen;
import com.nttdata.screens.CarritoScreen;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class MobileStoreSteps extends PageObject {

    CatalogScreen catalogScreen;
    ProductosScreen productosScreen;
    CarritoScreen carritoScreen;

    public void loadSuccess(){
        Assert.assertTrue(catalogScreen.isProductDisplayed());
    }

public void agregarMas(int unidades, String producto) {
    selectProduct(producto);
    for (int i = 1; i < unidades; i++) {
        productosScreen.getBtnMas().click();
    }
    productosScreen.getBtnAgregar().click();
    irAlCarrito();
}

    public void selectProduct(String producto) {
        switch (producto) {
            case "Sauce Labs Backpack":
                productosScreen.getLblCatalogProduct1().click();
                break;
            case "Sauce Labs Bolt T-Shirt":
                productosScreen.getLblCatalogProduct2().click();
                break;
            case "Sauce Labs Bike Light":
                productosScreen.getLblCatalogProduct3().click();
                Assert.fail("La aplicación se cerró inesperadamente al seleccionar 'Sauce Labs Bike Light'.");
                break;
            default:
                System.out.println("Producto no encontrado: " + producto);
                break;
        }
    }

    public void irAlCarrito() {
        productosScreen.clickAlCarrito();
    }

    public void verificarCarrito(int unidadesEsperadas, String productoEsperado) {
        String productoActual = carritoScreen.getTxtProducto().getText();
        int unidadesActuales = Integer.parseInt(carritoScreen.getTxtCant().getText());

        System.out.println("Producto actual en el carrito: " + productoActual);
        System.out.println("Cantidad actual en el carrito: " + unidadesActuales);

        Assert.assertEquals("El producto en el carrito no es el esperado", productoEsperado, productoActual);
        Assert.assertEquals("La cantidad en el carrito no es la esperada", unidadesEsperadas, unidadesActuales);
    }
}
