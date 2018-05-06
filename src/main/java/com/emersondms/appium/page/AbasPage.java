package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;

import java.net.MalformedURLException;

public class AbasPage extends BasePage {

    public boolean isAba1() throws MalformedURLException {
        return existeElementoPorTexto("Este é o conteúdo da Aba 1");
    }

    public boolean isAba2() throws MalformedURLException {
        return existeElementoPorTexto("Este é o conteúdo da Aba 2");
    }

    public void selecionarAba2() throws MalformedURLException {
        clicarPorTexto("ABA 2");
    }
}
