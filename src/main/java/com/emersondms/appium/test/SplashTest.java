package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.MenuPage;
import com.emersondms.appium.page.SplashPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class SplashTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage page = new SplashPage();

    @Test
    public void deveAguardarSplashSumir() throws MalformedURLException {
        menu.acessarSplash();
        page.isTelaSplashVisivel();
        page.aguardarSplashSumir();
        assertTrue(page.existeElementoPorTexto("Formulário"));
    }
}
