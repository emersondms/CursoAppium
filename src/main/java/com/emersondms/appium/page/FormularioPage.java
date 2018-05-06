package com.emersondms.appium.page;

import com.emersondms.appium.core.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class FormularioPage extends BasePage {

    public void escreverNome(String nome) throws MalformedURLException {
        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public String obterNome() throws MalformedURLException {
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public void selecionarCombo(String valor) throws MalformedURLException {
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String obterValorCombo() throws MalformedURLException {
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void clicarCheck() throws MalformedURLException {
        clicar(By.className("android.widget.CheckBox"));
    }

    public void clicarSwitch() throws MalformedURLException {
        clicar(MobileBy.AccessibilityId("switch"));
    }

    public boolean isCheckMarcado() throws MalformedURLException {
        return isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado() throws MalformedURLException {
        return isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public void salvar() throws MalformedURLException {
        clicarPorTexto("SALVAR");
    }

    public void salvarDemorado() throws MalformedURLException {
        clicarPorTexto("SALVAR DEMORADO");
    }

    public String obterNomeCadastrado() throws MalformedURLException {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Nome:')]"));
    }

    public String obterConsoleCadastrado() throws MalformedURLException {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Console:')]"));
    }

    public String obterCheckCadastrado() throws MalformedURLException {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Switch:')]"));
    }

    public String obterSwitchCadastrado() throws MalformedURLException {
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text, 'Checkbox:')]"));
    }
}
