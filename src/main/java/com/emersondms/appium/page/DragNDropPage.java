package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.List;

import static com.emersondms.appium.core.DriverFactory.getDriver;

public class DragNDropPage extends BasePage {

    public void arrastar(String origem, String destino) throws MalformedURLException {
        new TouchAction(getDriver())
            .longPress(getDriver().findElement(By.xpath("//*[@text='"+origem+"']")))
            .moveTo(getDriver().findElement(By.xpath("//*[@text='"+destino+"']")))
            .release()
            .perform();
    }

    public String[] obterLista() throws MalformedURLException {
        List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
        String[] retorno = new String[elements.size()];
        for (int i = 0; i < elements.size(); i++)
            retorno[i] = elements.get(i).getText();
        return retorno;
    }
}
