package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;

import java.net.MalformedURLException;

public class MenuPage extends BasePage {

    public void acessarFormulario() throws MalformedURLException {
        clicarPorTexto("Formulário");
    }

    public void acessarSplash() throws MalformedURLException {
        clicarPorTexto("Splash");
    }

    public void acessarAlertas() throws MalformedURLException {
        clicarPorTexto("Alertas");
    }

    public void acessarAbas() throws MalformedURLException {
        clicarPorTexto("Abas");
    }

    public void acessarAccordion() throws MalformedURLException {
        clicarPorTexto("Accordion");
    }
}
