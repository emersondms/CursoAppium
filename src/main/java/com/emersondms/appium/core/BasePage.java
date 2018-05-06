package com.emersondms.appium.core;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static com.emersondms.appium.core.DriverFactory.getDriver;

public class BasePage {

    protected void escrever(By by, String texto) throws MalformedURLException {
        getDriver().findElement(by).sendKeys(texto);
    }

    protected String obterTexto(By by) throws MalformedURLException {
        return getDriver().findElement(by).getText();
    }

    protected void clicar(By by) throws MalformedURLException {
        getDriver().findElement(by).click();
    }

    protected void clicarPorTexto(String texto) throws MalformedURLException {
        clicar(By.xpath("//*[@text='"+texto+"']"));
    }

    protected void selecionarCombo(By by, String valor) throws MalformedURLException {
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    protected boolean isCheckMarcado(By by) throws MalformedURLException {
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public boolean existeElementoPorTexto(String texto) throws MalformedURLException {
        return getDriver().findElements(By.xpath("//*[@text='"+texto+"']")).size() > 0;
    }
}
