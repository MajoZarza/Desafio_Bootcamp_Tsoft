package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Trenes extends Rumbo_Base {

    By locatorBtnOrigenTrenes = By.xpath("//input[@aria-label='Origen']") ;
    By locatorBtnDestinoTrenes = By.xpath("//input[@aria-label='Destino']") ;
    By locatorBarcelona = By.xpath("//input[@value='Barcelona']") ;
    By locatorMadrid = By.xpath("//input[@value='Madrid']") ;
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']") ;
    By locatorBtnFechaVuelta = By.xpath("//button[@aria-label='Fecha de vuelta']") ;
    By locatorBtnDiaIda = By.xpath("//button[contains(text(), '15')]") ;
    By locatorBtnDiaVuelta = By.xpath("//button[contains(text(), '17')]") ;
    By locatorBtnBuscar = By.xpath("//button[@type='submit']") ;

    public Trenes(WebDriver driver) {
        super(driver);
    }

    public void reservaLargaError (String origen, String destino) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        enter(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        click(esperarPorElementoLocalizado(locatorMadrid));
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        Thread.sleep(2000);
        enter(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        click(esperarPorElementoLocalizado(locatorBarcelona));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        click(esperarPorElementoLocalizado(locatorBtnFechaVuelta));
        click(esperarPorElementoLocalizado(locatorBtnDiaVuelta));
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }
}
