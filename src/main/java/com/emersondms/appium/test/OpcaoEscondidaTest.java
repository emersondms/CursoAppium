package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTest;
import com.emersondms.appium.page.MenuPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static com.emersondms.appium.core.DriverFactory.getDriver;
import static org.junit.Assert.assertEquals;

public class OpcaoEscondidaTest extends BaseTest {

    private MenuPage menu = new MenuPage();

    @Test
    public void deveEncontrarOpcaoEscondida() throws MalformedURLException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
        menu.scrollDown();
        menu.clicarPorTexto("Opção bem escondida");
        assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
        menu.clicarPorTexto("OK");
    }
}
