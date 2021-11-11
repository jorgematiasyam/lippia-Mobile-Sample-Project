package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LogInClockifyConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class LogInClockifyService {

    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(LogInClockifyConstants.EMAIL_INPUT_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), "No se encuentra cargado el elemento");
    }

    public static void doLogin(String email, String password) {
        MobileActionManager.setInput(LogInClockifyConstants.EMAIL_INPUT_LOCATOR, email);
        MobileActionManager.setInput(LogInClockifyConstants.PASS_INPUT_LOCATOR, password);
    }
    public static void clickButton() {
        MobileActionManager.click(LogInClockifyConstants.LOGIN_BUTTON_ID);
    }

    public static void isHomePageVisible() {
        MobileActionManager.waitVisibility(LogInClockifyConstants.TOOLBAR_TITLE_XPATH);
        Assert.assertTrue(MobileActionManager.isVisible(LogInClockifyConstants.TOOLBAR_TITLE_XPATH), "No se puede cargar la pagina");
    }
    public static void pantallaSettings() {
        MobileActionManager.click(LogInClockifyConstants.MENU_BUTTON_XPATH);
        MobileActionManager.waitVisibility(LogInClockifyConstants.SETTINGS_BUTTON_ID);
        MobileActionManager.click(LogInClockifyConstants.SETTINGS_BUTTON_ID);
    }

    public static void desactivarShowNotifications(){
        MobileActionManager.click(LogInClockifyConstants.SHOW_NOTIFICATIONS_ID);
    }

    public static void noMostrarNotificaciones(){
        Assert.assertEquals(MobileActionManager.getAttribute(LogInClockifyConstants.SHOW_NOTIFICATIONS_ID,"checked"),"false");
    }

}
