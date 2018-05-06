package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.AccordionPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertEquals;

public class AccordionTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AccordionPage page = new AccordionPage();

    @Test
    public void deveInteragirComAccordion() throws MalformedURLException, InterruptedException {
        menu.acessarAccordion();
        page.selecionarOp1();
        esperar(1000);
        assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());
    }
}
