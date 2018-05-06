package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static com.emersondms.appium.core.DriverFactory.getDriver;

public class CliquesPage extends BasePage {

    public void cliqueLongo() throws MalformedURLException {
        cliqueLongo(By.xpath("//*[@text='Clique Longo']"));
    }

    public String obterTextoCampo() throws MalformedURLException {
        return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }
}
