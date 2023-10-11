
package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Trenes extends Rumbo_Base {



    //By locatorBtnVerMas = By.xpath("//div[@class='MenuLinkstyled__MenuLinkWrapper-sc-1dkmpyp-2 ixtBwj'])[11]");

    //By locatorBtnTrenes = By.xpath("//div[@class='MenuLinkstyled__MenuLinkWrapper-sc-1dkmpyp-4 KZClY' and text()='Trenes']");

    By locatorBtnOrigenTrenes = By.xpath("//input[@aria-label='Origen']");
    By locatorBtnDestinoTrenes = By.xpath("//input[@aria-label='Destino']");
    By locatorBarcelona = By.xpath("//input[@value='Barcelona']");
    By locatorMadrid = By.xpath("//input[@value='Madrid']");
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorBtnFechaVuelta = By.xpath("//button[@aria-label='Fecha de vuelta']");
    By locatorBtnDiaIda = By.xpath("//button[contains(text(), '15')]");

    By locatorBtnDiaVuelta = By.xpath("By.xpath(\"//form/div[2]/div[2]/div/div/div/div/section/div/div/div/div[3]/div[2]/button[30]\")");

    By locatorBtnDiaVueltaotro = By.xpath("//button[@class=\"d-1ktehkr\" and text()='25']");

    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");

    By locatorSoloIda = By.xpath("//div[contains(text(), 'Solo ida')]") ;

    By locatorPrimerTren = By.xpath("//div[@class='trip-collection-view__trips-container-top']");

    By locatorSeleccionar = By.xpath("//button[contains(text(), 'Seleccionar')]");

    By locatorNombreContactoTren = By.xpath("//input[@name='name']");
    By locatorApellidoContactoTren = By.xpath("//input[@name='surname']");
    By locatorCorreoContactoTren = By.xpath("//input[@name='email']");

    By locatorTelefono = By.xpath("//input[@name='phone']");

    By locatorSinProteccionAdicional = By.xpath("//div[@class='insurance__noThanks-expandable-left-box']");



    public Trenes(WebDriver driver) {
        super(driver);
    }


    public void completarFormularioContactoTren(String nombre, String apellido, String correo, String telefono) {
        click(esperarPorElementoLocalizado(locatorNombreContactoTren));
        escribirTexto(esperarPorElementoLocalizado(locatorNombreContactoTren), nombre);
        click(esperarPorElementoLocalizado(locatorApellidoContactoTren));
        escribirTexto(esperarPorElementoLocalizado(locatorApellidoContactoTren), apellido);
        scrollByLocator(locatorCorreoContactoTren);
        click(esperarPorElementoLocalizado(locatorCorreoContactoTren));
        escribirTexto(esperarPorElementoLocalizado(locatorCorreoContactoTren), correo);
        scrollByLocator(locatorTelefono);
        click(esperarPorElementoLocalizado(locatorTelefono));
        escribirTexto(esperarPorElementoLocalizado(locatorTelefono), telefono);
        enter(esperarPorElementoLocalizado(locatorTelefono));
    }

    public void buscarLupa() {
        click(locatorBtnBuscar);
    }

   /* public void entraraTrenes() {
        click(esperarPorElementoLocalizado(locatorBtnVerMas));
        esperarXSegundos(1000);
        click(esperarPorElementoLocalizado(locatorBtnTrenes));
        esperarXSegundos(1000);
    }



 */

    public void reservaLargaError(String origen, String destino) {


        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(1000);
        //enter(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(5000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        //enter(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        click(esperarPorElementoLocalizado(locatorBarcelona));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaVuelta));
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
        esperarXSegundos(1000);
    }


    public void reservaTren(String origen, String destino) {
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(1000);
        //enter(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        click(esperarPorElementoLocalizado(locatorMadrid));
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        esperarXSegundos(1500);
        // enter(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        click(esperarPorElementoLocalizado(locatorBarcelona));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        click(esperarPorElementoLocalizado(locatorBtnFechaVuelta));
        esperarXSegundos(1000);

    }

    public void seleccionarPrimerTren() {

        esperarXSegundos(5000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaVuelta));
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }
    public void reservaSoloIda (String origen, String destino) {
        click(esperarPorElementoLocalizado(locatorSoloIda));
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(5000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        esperarXSegundos(5000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
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





