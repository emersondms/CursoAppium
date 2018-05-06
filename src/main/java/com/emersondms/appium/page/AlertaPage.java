package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AlertaPage extends BasePage {

    public void clicarAlertaConfirm() throws MalformedURLException {
        clicarPorTexto("ALERTA CONFIRM");
    }

    public String obterTituloAlerta() throws MalformedURLException {
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagemAlerta() throws MalformedURLException {
        return obterTexto(By.id("android:id/message"));
    }

    public void confirmar() throws MalformedURLException {
        clicarPorTexto("Confirmar");
    }

    public void sair() throws MalformedURLException {
        clicarPorTexto("Sair");
    }
}
