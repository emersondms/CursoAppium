package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.CliquesPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class CliquesTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private CliquesPage page = new CliquesPage();

    @Before
    public void setup() throws MalformedURLException {
        menu.acessarCliques();
    }

    @Test
    public void deveRealizarCliqueLongo() throws MalformedURLException {
        page.cliqueLongo();
        assertEquals("Clique Longo", page.obterTextoCampo());
    }

    @Test
    public void deveRealizarCliqueDuplo() throws MalformedURLException {
        page.clicarPorTexto("Clique duplo");
        page.clicarPorTexto("Clique duplo");
        assertEquals("Duplo Clique", page.obterTextoCampo());
    }
}
