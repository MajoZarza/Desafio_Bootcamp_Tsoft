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
    By locatorBtnVerMas = By.xpath("//div[contains(text(), 'Ver más')]");

    //Dentro de Ver más para ir a Trenes:

    By locatorBtnTrenes = By.xpath("//a[@title='Trenes']");
    By locatorBtnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By locatorBtnMediosPago = By.xpath("//form/div/div[2]/div/div/div/div/button");
    By locatorBtnMaestro = By.xpath("//form/div/div[2]/div/div/div/div[2]/div/section/ul/li[4]");
    By locatorBtnOrigenVuelos = By.xpath("//input[@aria-label='Origen']");
    By locatorMadrid = By.xpath("//input[@value='Madrid (MAD)']");
    By locatorBtnDestinoVuelos = By.xpath("//input[@aria-label='Destino']");
    By locatorBarcelona = By.xpath("//input[@value='Barcelona (BCN)']");
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorBtnDiaIda = By.xpath("//button[contains(text(), '25')]");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");


    //Dentro de apartado Hoteles:

    By locatorDestinoBarcelona = By.xpath("//label[@for=':R4sd9lalamt2mm:']");
    By locatorEscribirBarcelona = By.xpath("//*[@id=\":R4sd9lalamt2mm:\"]");
    By locatorElegirBarcelona = By.xpath("//input[@value='Barcelona']");
    By locatorBtnFechaEntrada = By.xpath("//label[@class='d-kf04ay'][text()='Fecha de entrada']");
    By locatorBtnMesEntrada = By.xpath("//span[@id='10' and text()='noviembre 2023']");
    By locatorBtnDiaEntrada = By.xpath("//button[text()='1']");
    By locatorBtnElegirDiaEntradaHotel = By.xpath("//button[text()='1']");

    By locatorFechaIngreso = By.xpath("//button[@aria-label='Fecha de entrada']");
    By locatorFechaSalida = By.xpath("//button[@aria-label='Fecha de salida]");
    By locatorPersonasXhab = By.xpath("//span[@class='d-ocxq5f]");
    By locatorSumarHabitacion = By.xpath("//button[text()='Añadir habitación]");

    //agregue esto
    By locatorSeul = By.xpath("//input[@value='Seúl (SEL)']");
    By locatorGesel = By.xpath("//input[@value='Villa Gesell (VLG)']");
    By locatorMensajeErrorVuelos = By.xpath("//div[contains(text(), 'No hemos encontrado ningún resultado con tus criterios de búsqueda.')]");
    By locatorBtnClasesVuelo1 = By.xpath("//form/div/div[6]/div/div/div[2]/div/div[2]/section/div/div/div[2]");
    By locatorBtnClasesVuelo2 = By.xpath("//form/div/div[6]/div/div/div[2]/div/div[2]/section/div/div/div[3]");
    By locatorClasePrimera = By.xpath("//form/div/div[6]/div/div/div[2]/div/div[2]/section/div/div/div[2]/div/button[5]");



    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void cerrarCookies() {
        click(esperarPorElementoLocalizado(locatorBtnRechazarcookies));
    }

    public void verMas() {
        click(esperarPorElementoLocalizado(locatorBtnVerMas));
    }

    public void trenes() {
        click(esperarPorElementoLocalizado(locatorBtnTrenes));
    }

    public void vuelos() {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
    }

    public void hoteles() {
        click(esperarPorElementoLocalizado(locatorBtnHoteles));
    }

    public void soloIda() {
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
    }

    public void origenVuelo() {
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
    }

    public void destinoVuelo() {
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
    }

    public void fechaIda() {
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
    }



    public void busquedaVueloSoloIda(String origen, String destino)  {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenVuelos), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoVuelos), destino);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }
    public void busquedaVueloSoloIdaPrimera(String origen, String destino)  {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenVuelos), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoVuelos), destino);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnClasesVuelo1));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnClasesVuelo2));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorClasePrimera));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }
    public void busquedaVueloSoloIdaMaestro(String origen, String destino)  {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnMediosPago));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnMaestro));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenVuelos), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoVuelos), destino);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }


    public void agregaHabitacion() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnHoteles));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorDestinoBarcelona));
        Thread.sleep(3000);
        escribirTexto(esperarPorElementoLocalizado(locatorEscribirBarcelona), "Barcelona");
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorElegirBarcelona));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorBtnFechaEntrada));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorBtnElegirDiaEntradaHotel));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorBtnMesEntrada));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorBtnDiaEntrada));
        Thread.sleep(3000);
    }

    public void buscarLupa() {
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }


    public void irATrenes() {
        click(esperarPorElementoLocalizado(locatorBtnVerMas));
        click(esperarPorElementoLocalizado(locatorBtnTrenes));
    }


    public void busquedaVueloSoloIdaOtroDestino(String origen, String destino) {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenVuelos), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorGesel));
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoVuelos), destino);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorSeul));
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        click(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }

    public String obtenerError(){
        return obtenerTexto(esperarPorElementoLocalizado(locatorMensajeErrorVuelos));
    }
}