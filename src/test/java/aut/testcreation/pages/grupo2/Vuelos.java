package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Vuelos extends Rumbo_Base {

    By locatorPrimerVuelo = By.xpath("//div[@class='trip-collection-view__trips-container-top']");
    By locatorSeleccionar = By.xpath("//button[contains(text(), 'Seleccionar')]");
    By locatorTarifaClassic = By.xpath("//button[contains(text(), 'Elegir Classic')]");
    By locatorTarifaFlex = By.xpath("//button[contains(text(), 'Elegir Flexible')]");
    By locatorNombreContacto = By.xpath("//input[@name='name']");
    By locatorApellidoContacto = By.xpath("//input[@name='surname']");
    By locatorCorreoContacto = By.xpath("//input[@name='email']");
    By locatorTelefono = By.xpath("//input[@name='phone']");
    By locatorCalle = By.xpath("//label[@class='FormFieldstyles__InnerWrapper-sc-1pt5zgp-3 cSxNJu']");
    By locatorAlturaCalle = By.xpath("//input[@name='houseNumber']");
    By locatorCodigoPostal = By.xpath("//input[@name='postCode']");
    By locatorCiudad = By.xpath("//input[@name='city']");
    By locatorChecks = By.xpath("//span[@class='custom-radio']");
    By locatorGeneroMasculino = By.xpath("//span[@class='radio-groups.1.travellers.1.title-MALE']");
    By locatorDiaNacimientoPasajero = By.xpath("//input[@data-testid='[0-9]{1,2}']");
    By locatorMesNacimientoPasajero = By.xpath("//data-testid='groups.1.travellers.1.dateOfBirth_month'");
    By locatorEnero = By.xpath("//span[contains(text(), 'enero')]");
    By locatorAnioNacimientoPasajero = By.xpath("//input[@data-testid='[0-9]{1,4}']");
    By locatorSiguiente = By.xpath("//button[@data-test='lead-generation-submit-btn']");

    By locatorMultidestino = By.xpath("//a[contains(text(),\"Multidestino\")]");


    public Vuelos(WebDriver driver) {
        super(driver);
    }

    public void seleccionarPrimerVuelo() {
        click(esperarPorElementoLocalizado(locatorPrimerVuelo));
        click(esperarPorElementoLocalizado(locatorSeleccionar));
    }

    public void tarifaClassic() {
        scrollByLocator(locatorTarifaClassic);
        click(esperarPorElementoLocalizado(locatorTarifaClassic));
    }

    public void tarifaFlex() {
        scrollByLocator(locatorTarifaFlex);
        click(esperarPorElementoLocalizado(locatorTarifaFlex));
    }

    public void multidestino() {
        click(esperarPorElementoLocalizado(locatorMultidestino));
    }

    public void completarFormularioContacto(String nombre, String apellido, String correo, String telefono) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorNombreContacto));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorNombreContacto), nombre);
        click(esperarPorElementoLocalizado(locatorApellidoContacto));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorApellidoContacto), apellido);
        scrollByLocator(locatorCorreoContacto);
        click(esperarPorElementoLocalizado(locatorCorreoContacto));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorCorreoContacto), correo);
        scrollByLocator(locatorTelefono);
        click(esperarPorElementoLocalizado(locatorTelefono));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorTelefono), telefono);
        enter(esperarPorElementoLocalizado(locatorTelefono));
        Thread.sleep(2000);
    }

    public void completarFormularioDireccion(String calle, String altura, String CP, String ciudad){
        scrollByLocator(locatorCalle);
        click(esperarPorElementoLocalizado(locatorCalle));
        escribirTexto(esperarPorElementoLocalizado(locatorCalle), calle);
        click(esperarPorElementoLocalizado(locatorAlturaCalle));
        escribirTexto(esperarPorElementoLocalizado(locatorAlturaCalle), altura);
        click(esperarPorElementoLocalizado(locatorCodigoPostal));
        escribirTexto(esperarPorElementoLocalizado(locatorCodigoPostal), CP);
        scrollByLocator(locatorCiudad);
        click(esperarPorElementoLocalizado(locatorCiudad));
        escribirTexto(esperarPorElementoLocalizado(locatorCiudad), ciudad);
    }

    public void completarFormularioPasajero(String dia, String mes, String anio) throws InterruptedException {
        scrollByLocator(locatorChecks);
        click(esperarPorElementoLocalizado(locatorGeneroMasculino));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorDiaNacimientoPasajero), dia);
        click(esperarPorElementoLocalizado(locatorMesNacimientoPasajero));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorMesNacimientoPasajero), mes);
        click(esperarPorElementoLocalizado(locatorEnero));
        Thread.sleep(1000);
        click(esperarPorElementoLocalizado(locatorAnioNacimientoPasajero));
        Thread.sleep(1000);
        escribirTexto(esperarPorElementoLocalizado(locatorAnioNacimientoPasajero), anio);
        Thread.sleep(1000);
    }

    public void equipajeFacturado() {
        scrollByLocator(locatorChecks);
    }


    public void siguiente() {
        scrollByLocator(locatorSiguiente);
        click(esperarPorElementoLocalizado(locatorSiguiente));
    }


    //-----------MARIAN-------------------------------


    By locatorFormaDePago = By.xpath("//button[contains(@class, 'd-wi363e') and .//span[contains(text(), 'El método más económico')]]");
    By locatorBtnVuelos = By.xpath("//a[@title='Vuelos']");
    By locatorTarjetaMaestro = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div/div[1]/div/div[2]/div/section/ul/li[4]/div/button");
    By locatorBtnSoloIda = By.xpath("//div[@class='d-1nwmwhy']");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By locatorBtnDestinoVuelos = By.xpath("//input[@aria-label='Destino']");
    By locatorBtnOrigenVuelos = By.xpath("//input[@aria-label='Origen']");
    By locatorMadrid = By.xpath("//input[@value='Madrid (MAD)']");
    By locatorBarcelona = By.xpath("//input[@value='Barcelona (BCN)']");


    public void buscarLupa() {
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }


    public void pagaMaestro(String origen, String destino) throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnVuelos));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnSoloIda));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorFormaDePago));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorTarjetaMaestro));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnOrigenVuelos), origen);
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorMadrid));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnDestinoVuelos));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorBtnDestinoVuelos), destino);
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBarcelona));
        Thread.sleep(2000);
    }
}
