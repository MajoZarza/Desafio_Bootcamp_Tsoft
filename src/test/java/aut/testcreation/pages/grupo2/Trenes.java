package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Trenes extends Rumbo_Base {

    By locatorBtnOrigenTrenes = By.xpath("//form/div/div/fieldset/div[1]/div/input") ;
    By locatorBtnDestinoTrenes = By.xpath("//form/div/div/fieldset/div[3]/div/input") ;
    By locatorBarcelona = By.xpath("//form/div/div/fieldset/div[3]/div/input[@value='Barcelona']") ;
    By locatorMadrid = By.xpath("//form/div/div/fieldset/div[1]/div/input[@value='Madrid']") ;
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']") ;
    By locatorBtnFechaVuelta = By.xpath("//button[@aria-label='Fecha de vuelta']") ;
    By locatorBtnDiaIda = By.xpath("//form/div[2]/div/div/div/div/div/section/div/div/div/div[2]/div[2]/button[6]") ;
    By locatorBtnDiaVuelta = By.xpath("//form/div[2]/div[2]/div/div/div/div/section/div/div/div/div[3]/div[2]/button[30]") ;
    By locatorBtnBuscar = By.xpath("//button[@type='submit']") ;
    By locatorSoloIda = By.xpath("//div[contains(text(), 'Solo ida')]") ;
    By locatorPrimerTren = By.xpath("//div[@class='trip-collection-view__trips-container-top']");
    By locatorSeleccionar = By.xpath("//button[contains(text(), 'Seleccionar')]");
    By locatorSinProteccionAdicional = By.xpath("//div[@class='insurance__noThanks-expandable-left-box']");
    //WebElement locatorError = driver.findElement(By.xpath("//span[@role='alert']"));
    //String textoError = locatorError.getText();

    public Trenes(WebDriver driver) {
        super(driver);
    }

    public void reservaLargaError (String origen, String destino) {
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaVuelta));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
        //Assert.assertEquals("Lo sentimos, no se pueden reservar más de 31 noches", textoError);
    }
    public void reservaSoloIda (String origen, String destino) {
        click(esperarPorElementoLocalizado(locatorSoloIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        esperarXSegundos(5000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }

    public void seleccionarPrimerVuelo() {
        click(esperarPorElementoLocalizado(locatorPrimerTren));
        click(esperarPorElementoLocalizado(locatorSeleccionar));
    }

    public void sinProteccionAdicional () {
        click(esperarPorElementoLocalizado(locatorSinProteccionAdicional));
    }


}
