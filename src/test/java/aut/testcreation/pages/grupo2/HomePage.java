package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Rumbo_Base {

    //Definir los localizadores

    //Rechazar cookies:

    By locatorBtnRechazarcookies = By.xpath("//button[@class='iubenda-cs-reject-btn iubenda-cs-btn-primary']");

    //Para ir al icono Vuelos :
    By locatorBtnVuelos = By.xpath("//a[@title='Vuelos']");

    //Para ir al icono Hoteles:
    By locatorBtnHoteles = By.xpath("//a[@title='Hoteles']");

    //Para ir al icono de Ver más:
    By locatorBtnVerMas = By.xpath("//a[@title='Ver más']");

    //Dentro de Ver más para ir a Trenes:
    By locatorBtnTrenes = By.xpath("//a[@title='Trenes']") ;
    By locatorBtnSoloIda = By.xpath("//div[@class='d-1nwmwhy']") ;
    By locatorBtnOrigenVuelos = By.xpath("//input[@aria-label='Origen']") ;
    By locatorMadrid = By.xpath("//input[@value='Madrid (MAD)']") ;
    By locatorBtnDestinoVuelos = By.xpath("//input[@aria-label='Destino']") ;
    By locatorBarcelona = By.xpath("//input[@value='Barcelona (BCN)']") ;
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']") ;
    By locatorBtnDiaIda = By.xpath("//button[contains(text(), '25')]") ;
    By locatorBtnBuscar = By.xpath("//button[@type='submit']") ;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void cerrarCookies (){ click(esperarPorElementoLocalizado(locatorBtnRechazarcookies)); }
    public void verMas (){ click(esperarPorElementoLocalizado(locatorBtnVerMas)); }
    public void trenes (){ click(esperarPorElementoLocalizado(locatorBtnTrenes)); }
    public void vuelos (){ click(esperarPorElementoLocalizado(locatorBtnVuelos)); }
    public void hoteles (){ click(esperarPorElementoLocalizado(locatorBtnHoteles)); }
    public void soloIda (){ click(esperarPorElementoLocalizado(locatorBtnSoloIda)); }
    public void origenVuelo (){ click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos)); }
    public void destinoVuelo (){ click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos)); }
    public void fechaIda (){ click(esperarPorElementoLocalizado(locatorBtnFechaIda)); }

    public void busquedaVueloSoloIda (String origen, String destino) {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenVuelos), origen);
        enter(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        click(esperarPorElementoLocalizado(locatorMadrid));
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoVuelos), destino);
        enter(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        click(esperarPorElementoLocalizado(locatorBarcelona));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }
}
