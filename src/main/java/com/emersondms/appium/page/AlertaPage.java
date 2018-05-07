package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;

import java.net.MalformedURLException;

public class AlertaPage extends BasePage {

    public void clicarAlertaConfirm() throws MalformedURLException {
        clicarPorTexto("ALERTA CONFIRM");
    }

    public void clicarAlertaSimples() throws MalformedURLException {
        clicarPorTexto("ALERTA SIMPLES");
    }

    public void confirmar() throws MalformedURLException {
        clicarPorTexto("Confirmar");
    }

    public void sair() throws MalformedURLException {
        clicarPorTexto("Sair");
    }

    public void clicarForaCaixa() throws MalformedURLException {
        tap(100, 150);
    }
}
