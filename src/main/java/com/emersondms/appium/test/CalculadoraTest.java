package com.emersondms.appium.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraTest {

    @Test
    public void deveSomarDoisValores() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "09ac24a3028152d3");
        //caps.setCapability("automationName", "uiautomator2");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");

        AndroidDriver<MobileElement> driver = new AndroidDriver(
            new URL("http://0.0.0.0:4723/wd/hub"), caps
        );

        driver.findElementById("com.google.android.calculator:id/digit_2").click();
        driver.findElementById("com.google.android.calculator:id/op_add").click();
        driver.findElementById("com.google.android.calculator:id/digit_3").click();
        Assert.assertEquals("5",
            driver.findElementById("com.google.android.calculator:id/result").getText()
        );

        driver.quit();
    }
}
