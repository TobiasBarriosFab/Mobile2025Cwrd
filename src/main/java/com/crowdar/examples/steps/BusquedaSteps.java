package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.BusquedaService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusquedaSteps extends PageSteps {

    @Given("^el usuario se loguea en la app MYDEMOAPP con el usuario (.*) y la contraseña (.*)$")
    public void elUsuarioSeLogueaEnLaAppMYDEMOAPPConElUsuarioYLaContraseña(String pUsuario, String pPass) {
        LoginService.clickMenu();
        LoginService.clickLoginItemMenu();
        LoginService.Logueo(pUsuario,pPass);
        LoginService.clickBotonLogin();
    }

    @And("el usuario se encuentra en la pagina de catalogo")
    public void elUsuarioSeEncuentraEnLaPaginaDeCatalogo() {
        BusquedaService.navCatalogo();
    }

    @When("^el usuario hace click en el producto (.*)$")
    public void elUsuarioHaceClickEnElProducto(String pProducto) {
        BusquedaService.clickProducto(pProducto);
    }

    @Then("^el usuario visualiza la ventana del producto (.*)$")
    public void elUsuarioVisualizaLaVentanaDelProducto(String pProducto) {
        BusquedaService.verifPaginaProducto(pProducto);
    }
}
