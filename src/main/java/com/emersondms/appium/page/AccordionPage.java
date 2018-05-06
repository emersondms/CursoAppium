package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class AccordionPage extends BasePage {

    public void selecionarOp1() throws MalformedURLException {
        clicarPorTexto("Opção 1");
    }

    public String obterValorOp1() throws MalformedURLException {
        return obterTexto(By.xpath(
            "//*[@text='Opção 1']/../..//following-sibling::" +
            "android.view.ViewGroup//android.widget.TextView"
        ));
    }
}
