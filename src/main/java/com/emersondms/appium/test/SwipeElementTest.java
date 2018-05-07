package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.MenuPage;
import com.emersondms.appium.page.SwipeListPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertTrue;

public class SwipeElementTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SwipeListPage page = new SwipeListPage();

    @Test
    public void deveResolverDesafio() throws MalformedURLException, InterruptedException {
        menu.clicarSwipeList();
        page.swipeElementRight("Opção 1");
        page.clicarBotaoMais();
        assertTrue(page.existeElementoPorTexto("Opção 1 (+)"));
        page.swipeElementRight("Opção 4");
        esperar(1000);
        page.clicarPorTexto("(-)");
        esperar(1000);
        assertTrue(page.existeElementoPorTexto("Opção 4 (-)"));
        page.swipeElementLeft("Opção 5 (-)");
        assertTrue(page.existeElementoPorTexto("Opção 5"));
    }
}
