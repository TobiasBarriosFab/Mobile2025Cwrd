package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CarritoConstants;
import junit.framework.Assert;

public class CarritoService extends MobileActionManager {
    public static void clickAddToCart(){
        GenericService.scrollAndroid("Accessibility", CarritoConstants.BOTON_ADD_CART_ACCESSIBILITY_ID);
        click(CarritoConstants.BOTON_ADD_CART_ACCESSIBILITY_ID);
    }
    public static void contadorCarrito(String valorEsperado){
        waitVisibility(CarritoConstants.CONTADOR_CARRITO_ID);
        Assert.assertTrue("No se visualiza el contador del carrito", isPresent(CarritoConstants.CONTADOR_CARRITO_ID));
        String valorActual = getText(CarritoConstants.CONTADOR_CARRITO_ID);
        Assert.assertEquals("El valor del contador no es el esperado", valorEsperado, valorActual);
    }
    public static void clickCarrito(){
        waitVisibility(CarritoConstants.BOTON_CARRITO_ID);
        click(CarritoConstants.BOTON_CARRITO_ID);
    }
    public static void clickRemoverProducto(){
        waitPresence(CarritoConstants.BOTON_REMOVER_CARRITO_ACCESSIBILITY_ID);
        click(CarritoConstants.BOTON_REMOVER_CARRITO_ACCESSIBILITY_ID);
    }
    public static void verificarCarritoVacio(){
        waitVisibility(CarritoConstants.TITULO_CARRITO_VACIO_ID);
        Assert.assertTrue("El carrito no esta vacio", isPresent(CarritoConstants.TITULO_CARRITO_VACIO_ID));
    }
}
