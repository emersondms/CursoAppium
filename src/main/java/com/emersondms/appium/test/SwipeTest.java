package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.MenuPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;

public class SwipeTest extends BaseTest {

    private MenuPage menu = new MenuPage();

    @Test
    public void deveRealizarSwipe() throws MalformedURLException, InterruptedException {
        menu.acessarSwipe();
        assertTrue(menu.existeElementoPorTexto("a esquerda"));
        menu.swipeRight();
        assertTrue(menu.existeElementoPorTexto("E veja se"));
        menu.clicarPorTexto("›");
        assertTrue(menu.existeElementoPorTexto("Chegar até o fim!"));
        menu.swipeLeft();
        menu.clicarPorTexto("‹");
        assertTrue(menu.existeElementoPorTexto("a esquerda"));
    }
}
