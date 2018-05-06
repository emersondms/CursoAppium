package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.AlertaPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class AlertaTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private AlertaPage page = new AlertaPage();

    @Before
    public void setup() throws MalformedURLException {
        menu.acessarAlertas();
    }

    @Test
    public void deveConfirmarAlerta() throws MalformedURLException {
        page.clicarAlertaConfirm();
        assertEquals("Info", page.obterTituloAlerta());
        assertEquals("Confirma a operação?", page.obterMensagemAlerta());
        page.confirmar();
        assertEquals("Confirmado", page.obterMensagemAlerta());
        page.sair();
    }

    @Test
    public void deveClicarForaAlerta() throws MalformedURLException, InterruptedException {
        page.clicarAlertaSimples();
        esperar(1000);
        page.clicarForaCaixa();
        Assert.assertFalse(page.existeElementoPorTexto(
            "Pode clicar no OK ou fora da caixa para sair"
        ));
    }
}
