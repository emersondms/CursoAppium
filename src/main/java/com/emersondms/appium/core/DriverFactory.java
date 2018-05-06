package com.emersondms.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static AndroidDriver<MobileElement> driver;

    public static AndroidDriver<MobileElement> getDriver() throws MalformedURLException {
        if (driver == null) createDriver();
        return driver;
    }

    private static void createDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "09ac24a3028152d3");
        caps.setCapability("appPackage", "com.ctappium");
        caps.setCapability("appActivity", "com.ctappium.MainActivity");
        /*caps.setCapability(MobileCapabilityType.APP,
            "/home/emersondms/Desktop/CursoAppium/src/main/resources/CTAppium-1-1.apk"
        );*/

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
