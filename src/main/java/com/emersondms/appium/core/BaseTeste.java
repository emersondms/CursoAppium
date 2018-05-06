package com.emersondms.appium.core;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;

import java.io.File;
import java.io.IOException;

public class BaseTeste {

    @Rule
    public TestName testName = new TestName();

    @After
    public void tearDown() throws IOException {
        gerarScreenShot();
        //DriverFactory.getDriver().resetApp();
    }

    @AfterClass
    public static void finalizaClasse() {
        DriverFactory.killDriver();
    }

    private void gerarScreenShot() throws IOException {
        FileUtils.copyFile(
            DriverFactory.getDriver().getScreenshotAs(OutputType.FILE),
            new File("target/screenshots/"+testName.getMethodName()+".png")
        );
    }

    public void esperar(long tempo) throws InterruptedException {
        Thread.sleep(tempo);
    }
}
