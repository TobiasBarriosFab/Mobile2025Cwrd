package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.BusquedaConstants;
import junit.framework.Assert;

public class BusquedaService extends MobileActionManager {
    public static void navCatalogo(){
        Assert.assertTrue("El usuario no se encuentra en el catalogo", waitPresence(BusquedaConstants.TITULO_PRODUCTO_ACCESSIBILITY_ID).isDisplayed());
    }
    public static void clickProducto(String pProducto){
        GenericService.scrollAndroid("text", pProducto);
        String imagen = String.format(BusquedaConstants.IMAGEN_PRODUCTO_XPATH, pProducto);
        click(imagen);

    }
    public static void verifPaginaProducto(String pProducto){
        String xpath = String.format(BusquedaConstants.TITULO_PAGINA_PRODUCTO_ID, pProducto);
        Assert.assertTrue("El usuario no se encuentra en la pagina del producto",waitPresence(BusquedaConstants.TITULO_PAGINA_PRODUCTO_ID).isDisplayed() );
    }

}
