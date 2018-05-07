package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.DragNDropPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.assertArrayEquals;

public class DragNDropTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private DragNDropPage page = new DragNDropPage();

    private String[] estadoInicial = new String[] {
        "Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,",
        "e arraste para", "qualquer local desejado."
    };

    private String[] estadoIntermediario = new String[] {
        "é uma lista", "Drag em Drop!", "Faça um clique longo,",
        "e arraste para", "Esta", "qualquer local desejado."
    };

    private String[] estadoFinal = new String[] {
        "Faça um clique longo,", "é uma lista", "Drag em Drop!",
        "e arraste para", "Esta", "qualquer local desejado."
    };

    @Test
    public void deveEfetuarDragNDrop() throws MalformedURLException, InterruptedException {
        menu.clicarDragNDrop();
        esperar(1000);
        assertArrayEquals(estadoInicial, page.obterLista());
        page.arrastar("Esta", "e arraste para");
        assertArrayEquals(estadoIntermediario, page.obterLista());
        page.arrastar("Faça um clique longo,", "é uma lista");
        assertArrayEquals(estadoFinal, page.obterLista());
    }
}
