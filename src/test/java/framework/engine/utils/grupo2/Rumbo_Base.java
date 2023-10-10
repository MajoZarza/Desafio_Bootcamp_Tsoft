package framework.engine.utils.grupo2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Rumbo_Base {
    protected WebDriver driver;
    protected WebDriverWait espera;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public Rumbo_Base(WebDriver driver) {this.driver = driver;}

    public void click(By localizador) {
        driver.findElement(localizador).click();
    }

    public void click(WebElement elemento) {
        elemento.click();
    }

    public void escribirTexto(By localizador, String texto) {
        driver.findElement(localizador).sendKeys(texto);
    }

    public void escribirTexto(WebElement elemento, String texto) {
        elemento.sendKeys(texto);
    }

    public void enter (WebElement elemento) {
        elemento.sendKeys(Keys.ENTER);
    }

    public WebElement buscarElementoWeb(By localizador) {
        return driver.findElement(localizador);
    }

    public List<WebElement> buscarElementosWeb(By localizador) {
        return driver.findElements(localizador);
    }

    public void esperarXSegundos(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            System.out.println("Ups! Error. No te preocupes :) lo estamos solucionando.");
        }
    }

    public void cargarPagina(String url) {
        driver.get(url);
    }

    public WebElement esperarPorElementoLocalizado(By localizador) {
        espera = new WebDriverWait(this.getDriver(), 20);
        return espera.until(ExpectedConditions.presenceOfElementLocated(localizador));
    }

    public String obtenerTexto(By localizador) {
        return driver.findElement(localizador).getText();
    }

    public String obtenerTexto(WebElement elemento) {
        return elemento.getText();
    }

    public void maximizar() {
        driver.manage().window().maximize();
    }

    public void cerrarBrowser() {
        driver.quit();
    }

    public WebDriver conexionDriver(String browser, String ruta, String property) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty(property, ruta);
            this.driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty(property, ruta);
            this.driver = new FirefoxDriver();
        }
        return this.driver;
    }

    public void scrollByLocator (By localizador) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", esperarPorElementoLocalizado(localizador));
    }

    public void cambiarVentana () {
        String currentWindowHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        windowHandles.remove(currentWindowHandle);
        driver.switchTo().window(windowHandles.iterator().next());
    }

    public void seleccionarComboboxPorValue (By localizador, String value) {
        Select selectorOrigen = new Select(esperarPorElementoLocalizado(localizador));
        selectorOrigen.selectByValue(value);
    }
}
