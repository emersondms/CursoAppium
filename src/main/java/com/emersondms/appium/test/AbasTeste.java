package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTeste;
import com.emersondms.appium.page.AbasPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class AbasTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private AbasPage page = new AbasPage();

    @Test
    public void deveInteragirComAbas() throws MalformedURLException {
        menu.acessarAbas();
        assertTrue(page.isAba1());
        page.selecionarAba2();
        assertTrue(page.isAba2());
    }
}
