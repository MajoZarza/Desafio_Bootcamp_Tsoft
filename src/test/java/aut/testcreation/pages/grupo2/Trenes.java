
package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Trenes extends Rumbo_Base {


    //By locatorBtnVerMas = By.xpath("//div[@class='MenuLinkstyled__MenuLinkWrapper-sc-1dkmpyp-2 ixtBwj'])[11]");

    //By locatorBtnTrenes = By.xpath("//div[@class='MenuLinkstyled__MenuLinkWrapper-sc-1dkmpyp-4 KZClY' and text()='Trenes']");

    By locatorBtnOrigenTrenes = By.xpath("//input[@aria-label='Origen']");
    By locatorBtnDestinoTrenes = By.xpath("//input[@aria-label='Destino']");
    By locatorBarcelona = By.xpath("//input[@value='Barcelona']");
    By locatorMadrid = By.xpath("//input[@value='Madrid']");
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorBtnFechaVuelta = By.xpath("//button[@aria-label='Fecha de vuelta']");
    By locatorBtnDiaIda = By.xpath("//form/div[2]/div[2]/div/div/div/div/section/div/div/div/div[2]/div[2]/button[15]");

    By locatorBtnDiaVuelta = By.xpath("//form/div[2]/div[2]/div/div/div/div/section/div/div/div/div[3]/div[2]/button[30]");

    By locatorBtnDiaVueltaotro = By.xpath("//button[@class=\"d-1ktehkr\" and text()='25']");

    By locatorBtnBuscar = By.xpath("//button[@aria-label='Buscar']");

    By locatorSoloIda = By.xpath("//div[contains(text(), 'Solo ida')]");

    By locatorPrimerTren = By.xpath("//div[@class='trip-collection-view__trips-container-top']");

    By locatorSeleccionar = By.xpath("//button[contains(text(), 'Seleccionar')]");

    By locatorNombreContactoTren = By.xpath("//input[@name='name']");
    By locatorApellidoContactoTren = By.xpath("//input[@name='surname']");
    By locatorCorreoContactoTren = By.xpath("//input[@name='email']");

    By locatorTelefono = By.xpath("//input[@name='phone']");

    By locatorSinProteccionAdicional = By.xpath("//div[@class='insurance__noThanks-expandable-left-box']");
    By locatorMensajeErrorTrenes = By.xpath("//span[@role='alert']");
    By locatorMensajeErrorEmail = By.xpath("//span[contains(text(), 'Introduce un email válido')]");

    By locatorChecks = By.xpath("//span[@class='check']");
    By locatorGeneroMasculino = By.xpath("//span[@class='radio-groups.1.travellers.1.title-MALE']");
    By locatorDiaNacimientoPasajeroTren = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[1]/div[4]/div[2]/div[1]/label/span/input");
    By locatorMesNacimientoPasajeroTren = By.xpath("//span[contains(text(), 'Mes')]");
    By locatorEneroTren = By.xpath("//span[contains(text(), 'enero')]");

    By locatorFebreroTren = By.xpath("//span[contains(text(), 'febrero')]");
    By locatorAnioNacimientoPasajeroTren = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[1]/div[4]/div[2]/div[3]/label/span/input");

    By locatorTipoDocumento = By.xpath("//button[.//span[text()='Tipo de documento']]");
    By locatorSeleccionDNI = By.xpath("//li[.//span[text()='Pasaporte']]");
    By locatorClicNumeroDNI = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section/section/div/div[2]/div/label");
    By locatorNumeroDNI = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section/section/div/div[2]/div/label/span[1]/input");
    By locatorTipoDocumento2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[2]/section/div/div[1]/div/button");

    //By locatorClicNumeroDNI2 = By.xpath("");
    By locatorNumeroDNI2 = By.xpath("//input[@name='groups.1.travellers.2.documentNumber']");


    By locatorChecks2 = By.xpath("//*[@id=\"radio-groups.1.travellers.2.title-FEMALE-label\"]/span[1]/span[2]");
    By locatorNombreContactoTren2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[2]/div[2]/div/label/span/input");
    By locatorApellidoContactoTren2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[2]/div[3]/div/label/span[1]/input");
    By locatorMesNacimientoPasajeroTren2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[2]/div[4]/div[2]/div[2]/button");
    By locatorDiaNacimientoPasajeroTren2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[2]/div[4]/div[2]/div[1]/label/span/input");
    By locatorAnioNacimientoPasajeroTren2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section[2]/div[4]/div[2]/div[3]/label/span/input");

    By locatorSiguiente = By.xpath("//button[@data-test='lead-generation-submit-btn'][text()='Siguiente']");

    By locatorErrorDNI = By.xpath("//span[contains(text(), 'Introduce nº de documento')]");

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
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(2000);
        //enter(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        //enter(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaVuelta));
        esperarXSegundos(2000);
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
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaVuelta));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }

    public void reservaSoloIda(String origen, String destino) {
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
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnDiaIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }

    public void reservaErrorSinDestino(String origen) {
        click(esperarPorElementoLocalizado(locatorSoloIda));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
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

    public void sinProteccionAdicional() {
        click(esperarPorElementoLocalizado(locatorSinProteccionAdicional));
    }

    public String obtenerError() {
        return obtenerTexto(esperarPorElementoLocalizado(locatorMensajeErrorTrenes));
    }

    public String obtenerErrorEmail() {
        return obtenerTexto(esperarPorElementoLocalizado(locatorMensajeErrorEmail));
    }

    public void seleccionarPrimerTrenParaReserva() {

        click(esperarPorElementoLocalizado(locatorPrimerTren));
        click(esperarPorElementoLocalizado(locatorSeleccionar));
    }

    public void completarFormularioPasajero(String dia, String mes, String anio) {
        click(esperarPorElementoLocalizado(locatorChecks));
        //click(esperarPorElementoLocalizado(locatorGeneroMasculino));
        scrollByLocator(locatorDiaNacimientoPasajeroTren);
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorDiaNacimientoPasajeroTren), dia);
        click(esperarPorElementoLocalizado(locatorMesNacimientoPasajeroTren));
        esperarXSegundos(3000);
        //escribirTexto(esperarPorElementoLocalizado(locatorMesNacimientoPasajeroTren), mes);
        //esperarXSegundos(1000);
        scrollByLocator(locatorEneroTren);
        esperarXSegundos(1000);
        click(locatorEneroTren);
        esperarXSegundos(1000);
        scrollByLocator(locatorAnioNacimientoPasajeroTren);
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorAnioNacimientoPasajeroTren), anio);
        esperarXSegundos(1000);

    }

    public void agregarDNI(String dni) {
        click(esperarPorElementoLocalizado(locatorTipoDocumento));
        esperarXSegundos(1000);
        click(esperarPorElementoLocalizado(locatorSeleccionDNI));
        esperarXSegundos(2000);
        click(esperarPorElementoLocalizado(locatorClicNumeroDNI));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorNumeroDNI), dni);
        esperarXSegundos(2000);
    }

    public void completarFormularioContactoTren2(String nombre, String apellido) {
        scrollByLocator(locatorChecks2);
        click(esperarPorElementoLocalizado(locatorChecks2));
        click(esperarPorElementoLocalizado(locatorNombreContactoTren2));
        escribirTexto(esperarPorElementoLocalizado(locatorNombreContactoTren2), nombre);
        click(esperarPorElementoLocalizado(locatorApellidoContactoTren2));
        escribirTexto(esperarPorElementoLocalizado(locatorApellidoContactoTren2), apellido);


    }

    public void completarFormularioPasajero2(String dia, String mes, String anio) {

        //click(esperarPorElementoLocalizado(locatorGeneroMasculino));
        scrollByLocator(locatorDiaNacimientoPasajeroTren2);
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorDiaNacimientoPasajeroTren2), dia);
        click(esperarPorElementoLocalizado(locatorMesNacimientoPasajeroTren2));
        esperarXSegundos(3000);
        escribirTexto(esperarPorElementoLocalizado(locatorMesNacimientoPasajeroTren2), mes);
        esperarXSegundos(1000);
        scrollByLocator(locatorFebreroTren);
        esperarXSegundos(1000);
        click(locatorFebreroTren);
        esperarXSegundos(1000);
        scrollByLocator(locatorAnioNacimientoPasajeroTren2);
        esperarXSegundos(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorAnioNacimientoPasajeroTren2), anio);
        esperarXSegundos(1000);

    }

    public void agregarDNI2(String dni) {
        click(esperarPorElementoLocalizado(locatorTipoDocumento2));
        esperarXSegundos(1000);
        click(esperarPorElementoLocalizado(locatorSeleccionDNI));
        esperarXSegundos(2000);
        //click(esperarPorElementoLocalizado(locatorClicNumeroDNI2));
        esperarXSegundos(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorNumeroDNI2), dni);
        esperarXSegundos(2000);
    }

    public void BtnSiguiente() {
        click(esperarPorElementoLocalizado(locatorSiguiente));
        esperarXSegundos(3000);
    }


    //-----------MARIAN-------------------------------



    By locatorBtnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By locatorCantidadPasajeros = By.xpath("//div[label[text()='Pasajero']]//button[contains(span, '2 pasajeros')]");
    By locatorReducirUnPasajero = By.xpath("//button[@aria-label='Reducir el número de adultos']");
    public void inicioFaltaDNI2 (String origen, String destino) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnOrigenTrenes));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenTrenes), origen);
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoTrenes));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoTrenes), destino);
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorCantidadPasajeros));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorReducirUnPasajero));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
        Thread.sleep(10000);
    }

    public void agregarDNI22 (String dni) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorTipoDocumento));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorSeleccionDNI));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorClicNumeroDNI));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorNumeroDNI), dni);
        Thread.sleep(2000);
    }


    public String obtenerErrorDNI(){
        return obtenerTexto(esperarPorElementoLocalizado(locatorErrorDNI));
    }

}