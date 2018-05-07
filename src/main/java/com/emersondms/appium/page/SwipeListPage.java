package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static com.emersondms.appium.core.DriverFactory.getDriver;

public class SwipeListPage extends BasePage {

    public void swipeElementLeft(String opcao) throws MalformedURLException {
        swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
    }

    public void swipeElementRight(String opcao) throws MalformedURLException {
        swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
    }

    public void clicarBotaoMais() throws MalformedURLException {
        MobileElement botao = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
        new TouchAction(getDriver()).tap(botao, -50, 0).perform();
    }
}
