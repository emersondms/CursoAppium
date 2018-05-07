package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.MenuPage;
import com.emersondms.appium.page.WebViewPage;
import org.junit.After;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class WebViewTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private WebViewPage page = new WebViewPage();

    @Test
    public void deveFazerLogin() throws MalformedURLException, InterruptedException {
        menu.acessarSBHibrido();
        esperar(10000);
        page.entrarContextoWeb();
        page.setEmail("emersondms@hotmail.com");
        page.setSenha("emersondms");
        page.entrar();
        assertEquals("Bem vindo, emersondms!", page.getMensagem());
    }

    @After
    public void tearDown() throws MalformedURLException {
        page.sairContextoWeb();
    }
}
