package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CarritoService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CarritoSteps extends PageSteps {


    @When("el usuario hace click en el boton AddToCart")
    public void elUsuarioHaceClickEnElBotonAddToCart() {
        CarritoService.clickAddToCart();
    }


    @And("^el usuario visualiza que el contador del carrito es (.*)$")
    public void elUsuarioVisualizaQueElContadorDelCarritoEs(String valor){
        CarritoService.contadorCarrito(valor);
    }

    @And("el usuario hace click en el carrito")
    public void elUsuarioHaceClickEnElCarrito() {
        CarritoService.clickCarrito();
    }

    @When("el usuario hace click en el boton Remove")
    public void elUsuarioHaceClickEnElBotonRemove() {
        CarritoService.clickRemoverProducto();
    }

    @Then("el usuario verifica que el carrito esta vacio")
    public void elUsuarioVerificaQueElCarritoEstaVacio() {

    }
}
