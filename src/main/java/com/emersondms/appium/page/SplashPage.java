package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static com.emersondms.appium.core.DriverFactory.getDriver;

public class SplashPage extends BasePage {

    public boolean isTelaSplashVisivel() throws MalformedURLException {
        return existeElementoPorTexto("Splash!");
    }

    public void aguardarSplashSumir() throws MalformedURLException {
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        new WebDriverWait(getDriver(), 10).until(
            ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']"))
        );
    }
}
