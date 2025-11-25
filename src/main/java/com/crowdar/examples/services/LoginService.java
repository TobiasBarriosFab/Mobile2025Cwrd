package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;

public class LoginService extends MobileActionManager {
    public static void clickMenu(){
        waitPresence(LoginConstants.BURGER_ITEM_ACCESSIBILITY_ID).isDisplayed();
        click(LoginConstants.BURGER_ITEM_ACCESSIBILITY_ID);
    }
    public static void clickLoginItemMenu(){
        waitPresence(LoginConstants.ITEM_MENU_LOGIN_ACCESSIBILITY_ID).isDisplayed();
        click(LoginConstants.ITEM_MENU_LOGIN_ACCESSIBILITY_ID);
    }
    public static void Logueo(String pUsuario, String pPass){
        MobileActionManager.setInput(LoginConstants.INPUT_USERNAME_ID, pUsuario);
        MobileActionManager.setInput(LoginConstants.INPUT_PASSWORD_ID, pPass);
    }
    public static void clickBotonLogin(){
        waitPresence(LoginConstants.BOTON_LOGIN_ACCESSIBILITY_ID).isDisplayed();
        click(LoginConstants.BOTON_LOGIN_ACCESSIBILITY_ID);
    }

}
