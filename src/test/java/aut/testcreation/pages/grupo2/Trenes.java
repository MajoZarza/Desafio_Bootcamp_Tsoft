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
    By locatorBtnDiaIda = By.xpath("//button[contains(text(), '15')]");

    By locatorBtnDiaVuelta = By.xpath("By.xpath(\"//form/div[2]/div[2]/div/div/div/div/section/div/div/div/div[3]/div[2]/button[30]\")");

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
    //WebElement locatorError = driver.findElement(By.xpath("//span[@role='alert']"));
    //String textoError = locatorError.getText();




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
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
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
        //Assert.assertEquals("Lo sentimos, no se pueden reservar más de 31 noches", textoError);
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

    public void seleccionarPrimerVuelo() {

        click(esperarPorElementoLocalizado(locatorPrimerTren));
        click(esperarPorElementoLocalizado(locatorSeleccionar));
    }

    public void sinProteccionAdicional() {
        click(esperarPorElementoLocalizado(locatorSinProteccionAdicional));
    }


    //-----------MARIAN-------------------------------
    By locatorBtnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By locatorTipoDocumento = By.xpath("//button[.//span[text()='Tipo de documento']]");
    By locatorSeleccionDNI = By.xpath("//li[.//span[text()='DNI']]");
    By locatorClicNumeroDNI = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section/section/div/div[2]/div/label");
    By locatorNumeroDNI = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section/section/div/div[2]/div/label/span[1]/input");


    By locatorDNI = By.xpath("//input[@name='groups.1.travellers.2.documentNumber']");


    By locatorCantidadPasajeros = By.xpath("//div[label[text()='Pasajero']]//button[contains(span, '2 pasajeros')]");
    By locatorReducirUnPasajero = By.xpath("//button[@aria-label='Reducir el número de adultos']");

    public void inicioFaltaDNI(String origen, String destino) throws InterruptedException {
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

    public void agregarDNI (String dni) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorTipoDocumento));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorSeleccionDNI));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorClicNumeroDNI));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorNumeroDNI), dni);
        Thread.sleep(2000);
    }

    By locatorChecksTren = By.xpath("//*[@id=\"radio-groups.1.travellers.1.title-MALE-label\"]");
    By locatorDiaNacimientoPasajeroTren = By.xpath("//input[@data-testid='input-input' and @name='groups.1.travellers.1.dateOfBirth']");
    By locatorMesNacimientoPasajeroTren = By.xpath("//button[@data-testid='groups.1.travellers.1.dateOfBirth_month' and .//span[@data-testid='select-label-text' and text()='Mes']]");
    By locatorEneroTren = By.xpath("//span[text()='enero']");
    By locatorAnioNacimientoPasajeroTren = By.xpath("//div[@data-testid=\"groups.1.travellers.1.dateOfBirth_year\"]");
    By locatorIngresarAnioNacimiento = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[5]/form/section/div[4]/div[2]/div[3]/label/span/input");

    By locatorBtnSiguiente = By.xpath("//button[@data-test='lead-generation-submit-btn'][text()='Siguiente']");


    public void BtnSiguiente() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnSiguiente));
        Thread.sleep(3000);
    }

    public void completarFormularioPasajeroTren(String dia, String mes, String anio) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorChecksTren));
        Thread.sleep(3000);
        escribirTexto(esperarPorElementoLocalizado(locatorDiaNacimientoPasajeroTren), dia);
        click(esperarPorElementoLocalizado(locatorMesNacimientoPasajeroTren));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorMesNacimientoPasajeroTren), mes);
        click(esperarPorElementoLocalizado(locatorEneroTren));
        Thread.sleep(1000);
        click(esperarPorElementoLocalizado(locatorAnioNacimientoPasajeroTren));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorIngresarAnioNacimiento), anio);
        Thread.sleep(1000);
    }

}
