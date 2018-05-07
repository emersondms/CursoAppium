package com.emersondms.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.net.MalformedURLException;
import java.time.Duration;

import static com.emersondms.appium.core.DriverFactory.getDriver;

public class BasePage {

    protected void escrever(By by, String texto) throws MalformedURLException {
        getDriver().findElement(by).sendKeys(texto);
    }

    protected String obterTexto(By by) throws MalformedURLException {
        return getDriver().findElement(by).getText();
    }

    public void clicar(By by) throws MalformedURLException {
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto) throws MalformedURLException {
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

    public String obterTituloAlerta() throws MalformedURLException {
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public String obterMensagemAlerta() throws MalformedURLException {
        return obterTexto(By.id("android:id/message"));
    }

    protected void tap(int x, int y) throws MalformedURLException {
        new TouchAction(getDriver()).tap(x, y).perform();
    }

    public void scrollDown() throws MalformedURLException {
       scroll(0.9, 0.1);
    }

    public void scrollUp() throws MalformedURLException {
        scroll(0.1, 0.9);
    }

    public void swipeLeft() throws MalformedURLException {
        swipe(0.1, 0.9);
    }

    public void swipeRight() throws MalformedURLException {
        swipe(0.9, 0.1);
    }

    private void scroll(double inicio, double fim) throws MalformedURLException {
        Dimension size = getDriver().manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);

        new TouchAction(getDriver())
            .press(x, start_y)
            .waitAction(Duration.ofMillis(500))
            .moveTo(x, end_y)
            .release()
            .perform();
    }

    private void swipe(double inicio, double fim) throws MalformedURLException {
        Dimension size = getDriver().manage().window().getSize();
        int y = size.height / 2;
        int start_x = (int) (size.width * inicio);
        int end_x = (int) (size.width * fim);

        new TouchAction(getDriver())
            .press(start_x, y)
            .waitAction(Duration.ofMillis(500))
            .moveTo(end_x, y)
            .release()
            .perform();
    }

    protected void swipeElement(MobileElement element, double inicio, double fim) throws MalformedURLException {
        int y = element.getLocation().y + (element.getSize().height / 2);
        int start_x = (int) (element.getSize().width * inicio);
        int end_x = (int) (element.getSize().width * fim);

        new TouchAction(getDriver())
            .press(start_x, y)
            .waitAction(Duration.ofMillis(500))
            .moveTo(end_x, y)
            .release()
            .perform();
    }

    protected void cliqueLongo(By by) throws MalformedURLException {
        new TouchAction(getDriver())
            .longPress(getDriver().findElement(by))
            .perform();
    }
}
