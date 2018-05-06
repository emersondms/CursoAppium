package com.emersondms.appium.test;

import com.emersondms.appium.core.BaseTeste;
import com.emersondms.appium.core.DriverFactory;
import com.emersondms.appium.page.FormularioPage;
import com.emersondms.appium.page.MenuPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class FormularioTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private FormularioPage page = new FormularioPage();

    @Before
    public void inicializarAppium() throws MalformedURLException {
        menu.acessarFormulario();
    }

    @Test
    public void devePreencherCampoTexto() throws MalformedURLException {
        page.escreverNome("Emerson");
        assertEquals("Emerson", page.obterNome());
    }

    @Test
    public void deveInteragirCombo() throws MalformedURLException {
        page.selecionarCombo("Nintendo Switch");
        assertEquals("Nintendo Switch", page.obterValorCombo());
    }

    @Test
    public void deveInteragirSwitchCheckbox() throws MalformedURLException {
        assertFalse(page.isCheckMarcado());
        assertTrue(page.isSwitchMarcado());

        page.clicarCheck();
        page.clicarSwitch();

        assertTrue(page.isCheckMarcado());
        assertFalse(page.isSwitchMarcado());
    }

    @Test
    public void deveRalizarCadastro() throws MalformedURLException {
        page.escreverNome("Emerson");
        page.clicarCheck();
        page.clicarSwitch();
        page.selecionarCombo("Nintendo Switch");
        page.salvar();

        assertEquals("Nome: Emerson", page.obterNomeCadastrado());
        assertEquals("Console: switch", page.obterConsoleCadastrado());
        assertTrue(page.obterCheckCadastrado().endsWith("Off"));
        assertTrue(page.obterSwitchCadastrado().endsWith("Marcado"));
    }

    @Test
    public void deveRalizarCadastroDemorado() throws MalformedURLException, InterruptedException {
        page.escreverNome("Emerson");
        DriverFactory.getDriver().hideKeyboard();
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        page.salvarDemorado();
        //esperar(3000);
        new WebDriverWait(DriverFactory.getDriver(), 10).until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: Emerson']")));
        assertEquals("Nome: Emerson", page.obterNomeCadastrado());
    }
}
