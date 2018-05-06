package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTeste;
import com.emersondms.appium.page.AlertaPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Test;

import java.net.MalformedURLException;

import static org.junit.Assert.*;

public class AlertTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private AlertaPage page = new AlertaPage();

    @Test
    public void deveConfirmarAlerta() throws MalformedURLException {
        menu.acessarAlertas();
        page.clicarAlertaConfirm();
        assertEquals("Info", page.obterTituloAlerta());
        assertEquals("Confirma a operação?", page.obterMensagemAlerta());
        page.confirmar();
        assertEquals("Confirmado", page.obterMensagemAlerta());
        page.sair();
    }
}
