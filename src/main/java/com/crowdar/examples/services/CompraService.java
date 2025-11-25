package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CompraConstants;
import junit.framework.Assert;

public class CompraService extends MobileActionManager {
    public static void clickCheckout(){
        waitPresence(CompraConstants.BOTON_CHECKOUT_ACCESSIBILITY_ID).isDisplayed();
        click(CompraConstants.BOTON_CHECKOUT_ACCESSIBILITY_ID);
    }
    public static void verifPagCheckOut(){
        waitVisibility(CompraConstants.TITUTLO_CHECKOUT_ID).isDisplayed();
        Assert.assertTrue("El usuario no se encuentra en la pagina del checkout", isPresent(CompraConstants.TITUTLO_CHECKOUT_ID));
    }
    public static void compCampoNombre(String pNombre){
        setInput(CompraConstants.CAMPO_NOMBRE_ID, pNombre);
    }

    public static void compCampoDireccion(String pDireccion){
        setInput(CompraConstants.CAMPO_DIRECCION_ID, pDireccion);

    }
    public static void compCampoCiudad(String pCiudad){
        setInput(CompraConstants.CAMPO_CIUDAD_ID, pCiudad);
    }
    public static void compCampoCodPostal(String pRegion){
        setInput(CompraConstants.CAMPO_COD_POSTAL_ID, pRegion);
    }
    public static void compCampoRegion(String pRegion){
        setInput(CompraConstants.CAMPO_REGION_ID, pRegion);
    }

    public static void compCampoPais(String pRegion){
        setInput(CompraConstants.CAMPO_PAIS_ID, pRegion);
    }
    public static void clickPayment(){
        GenericService.scrollAndroid("Accessibility", CompraConstants.BOTON_FINALIZAR_CHECKOUT_ACCESSIBILITY_ID);
        click(CompraConstants.BOTON_FINALIZAR_CHECKOUT_ACCESSIBILITY_ID);
    }
    public static void verifPagPayment(){
        waitVisibility(CompraConstants.TITULO_PAG_PAYMENT_ID).isDisplayed();
        Assert.assertTrue("El usuario no se encuentra en la pagina de datos de pago", isPresent(CompraConstants.TITULO_PAG_PAYMENT_ID));
    }
    public static void compCampNom(String pNom){
        setInput(CompraConstants.CAMPO_NOM_ID, pNom);
    }
    public static void compCampoTarjeta(String pNum){
        setInput(CompraConstants.CAMPO_NUM_TARJETA_ID, pNum);
    }
    public static void compCampoExpTarjeta(String pNum){
        setInput(CompraConstants.CAMPO_EXPIRACION_TARJETA_ID, pNum);
    }
    public static void compCampoCodTarjeta(String pCod){
        setInput(CompraConstants.CAMPO_COD_TARJETA_ID, pCod);
    }
    public static void clickRevisarPedido(){
        GenericService.scrollAndroid("Accessibility", CompraConstants.BOTON_REVISAR_PEDIDO_ACCESSIBILITY_ID);
        click(CompraConstants.BOTON_REVISAR_PEDIDO_ACCESSIBILITY_ID);
    }
    public static void verifPagRevisarPedido(){
        waitVisibility(CompraConstants.TITULO_REVISAR_PEDIDO_ID).isDisplayed();
        Assert.assertTrue("El usuario no se encuentra en la pagina de Revisar pedido", isPresent(CompraConstants.TITULO_REVISAR_PEDIDO_ID));
    }
    public static void clickPlaceOrder(){
        GenericService.scrollAndroid("Accessibility", CompraConstants.BOTON_REALIZAR_PEDIDO_ACCESSIBILITY_ID);
        click(CompraConstants.BOTON_REALIZAR_PEDIDO_ACCESSIBILITY_ID);

    }

    public static void verifCompraExitosa(){
        waitVisibility(CompraConstants.TITULO_COMPRA_EXITOSA_ID).isDisplayed();
        Assert.assertTrue("El usuario no realiza correctamente la compra", isPresent(CompraConstants.TITULO_COMPRA_EXITOSA_ID));
    }

}
