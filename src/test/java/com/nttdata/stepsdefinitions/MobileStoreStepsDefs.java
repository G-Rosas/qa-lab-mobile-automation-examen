package com.nttdata.stepsdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import com.nttdata.steps.MobileStoreSteps;
import com.nttdata.screens.ProductosScreen;
import com.nttdata.screens.CarritoScreen;

public class MobileStoreStepsDefs {
    @Steps
    MobileStoreSteps mobileStoreSteps;
    ProductosScreen productosScreen;
    CarritoScreen carritoScreen;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGalería() {
        mobileStoreSteps.loadSuccess();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoUNIDADESDelSiguienteProducto(int unidades, String producto) {
        mobileStoreSteps.agregarMas(unidades, producto);
    }

    @Then("valido que el carrito de compra se actualice correctamente con {int} unidades del producto {string}")
    public void valido_que_el_carrito_de_compra_se_actualice_correctamente_con_unidades_del_producto(Integer unidadesEsperadas, String productoEsperado) {
        mobileStoreSteps.verificarCarrito(unidadesEsperadas, productoEsperado);
    }

}
