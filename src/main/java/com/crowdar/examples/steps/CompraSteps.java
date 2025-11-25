package com.crowdar.examples.steps;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.constants.CompraConstants;
import com.crowdar.examples.services.CompraService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CompraSteps extends PageSteps {

    @When("el usuario hace click en el boton Proceed To Checkout")
    public void elUsuarioHaceClickEnElBotonProceedToCheckout() {
        CompraService.clickCheckout();
    }


    @And("el usuario visualiza la ventana del checkout")
    public void elUsuarioVisualizaLaVentanaDelCheckout() {
        CompraService.verifPagCheckOut();
    }

    @And("^el usuario completa el campo Full Name con (.*)$")
    public void elUsuarioCompletaElCampoFullNameConNombre(String pNombre) {
        CompraService.compCampoNombre(pNombre);
    }

    @And("^el usuario completa el campo Adress Line 1 con (.*)$")
    public void elUsuarioCompletaElCampoAdressLineConDireccion(String pDireccion) {
        CompraService.compCampoDireccion(pDireccion);
    }

    @And("^el usuario completa el campo City con (.*)$")
    public void elUsuarioCompletaElCampoCityConCiudad(String pCiudad) {
        CompraService.compCampoCiudad(pCiudad);
    }

   


    @And("^el usuario completa el campo Zip code con (.*)$")
    public void elUsuarioCompletaElCampoZipCodeConCodigoPostal(String pCodPostal) {
        CompraService.compCampoCodPostal(pCodPostal);
    }


    @And("^el usuario completa el campo State Region con (.*)$")
    public void elUsuarioCompletaElCampoStateRegionConRegion(String pRegion) {
        CompraService.compCampoRegion(pRegion);
    }

    @And("^el usuario completa el campo Country con (.*)$")
    public void elUsuarioCompletaElCampoCountryConPais(String pPais) {
        CompraService.compCampoPais(pPais);
    }


    @And("el usuario hace click en el boton To Payment")
    public void elUsuarioHaceClickEnElBotonToPayment() {
        CompraService.clickPayment();
    }

    @Then("el usuario visualiza la ventana de Pago")
    public void elUsuarioVisualizaLaVentanaDePago() {
        CompraService.verifPagPayment();
    }


    @And("^el usuario completa el campo Nombre completo con (.*)$")
    public void elUsuarioCompletaElCampoNombreCompletoConNombre(String pNom) {
        CompraService.compCampNom(pNom);
    }

    @And("^el usuario completa el campo Card number con (.*)$")
    public void elUsuarioCompletaElCampoCardNumberConTarjetaNum(String pNum) {
        CompraService.compCampoTarjeta(pNum);
    }

    @And("^el usuario completa el campo Expiration Date con (.*)$")
    public void elUsuarioCompletaElCampoExpirationDateConExpiracion(String pNum) {
        CompraService.compCampoExpTarjeta(pNum);
    }

    @And("^el usuario completa el campo Security code con (.*)$")
    public void elUsuarioCompletaElCampoSecurityCodeConCodSeguridad(String pCod) {
        CompraService.compCampoCodTarjeta(pCod);
    }

    @And("el usuario hace click en el boton Review Order")
    public void elUsuarioHaceClickEnElBotonReviewOrder() {
        CompraService.clickRevisarPedido();
    }

    @Then("el usuario visualiza la ventana de Review Order")
    public void elUsuarioVisualizaLaVentanaDeReviewOrder() {
        CompraService.verifPagRevisarPedido();
    }

    @When("el usuario hace click en el boton Place Order")
    public void elUsuarioHaceClickEnElBotonPlaceOrder() {
        CompraService.clickPlaceOrder();
    }

    @Then("el usuario compra exitosamente el producto")
    public void elUsuarioCompraExitosamenteElProducto() {
        CompraService.verifCompraExitosa();
    }
}
