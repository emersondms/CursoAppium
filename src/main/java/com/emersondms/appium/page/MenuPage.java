package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static com.emersondms.appium.core.DriverFactory.getDriver;

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

    public void acessarCliques() throws MalformedURLException {
        clicarPorTexto("Cliques");
    }

    public void acessarSwipe() throws MalformedURLException, InterruptedException {
        new WebDriverWait(getDriver(), 10).until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
        scrollDown();
        Thread.sleep(1000);
        clicarPorTexto("Swipe");
    }

    public void clicarSwipeList() throws MalformedURLException {
        new WebDriverWait(getDriver(), 10).until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
        scrollDown();
        clicarPorTexto("Swipe List");
    }

    public void clicarDragNDrop() throws MalformedURLException {
        new WebDriverWait(getDriver(), 10).until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Formulário']")));
        scrollDown();
        clicarPorTexto("Drag and drop");
    }

    public void acessarSBHibrido() throws MalformedURLException {
        clicarPorTexto("SeuBarriga Híbrido");
    }
}
