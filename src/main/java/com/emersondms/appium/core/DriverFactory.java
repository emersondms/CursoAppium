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
        if (driver == null) createTestObjectDriver(); //createDriver();
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

    private static void createTestObjectDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("testobject_api_key", "94537146FBC0432BAE41FEFFAB684152");
        caps.setCapability("appiumVersion", "1.8.0");
        driver = new AndroidDriver<MobileElement>(new URL("https://us1.appium.testobject.com/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
