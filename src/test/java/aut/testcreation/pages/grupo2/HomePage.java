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



    public HomePage(WebDriver driver) {
        super(driver);
    }
}
