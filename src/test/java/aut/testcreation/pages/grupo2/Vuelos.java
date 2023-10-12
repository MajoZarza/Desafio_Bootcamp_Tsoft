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

    By locatorBtnBorrartodos = By.xpath("//*[@id=\"modals\"]/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/button");

    By locatorCiudadparaMultidestino = By.xpath("//input[@placeholder='Ciudad, aeropuerto o lugar']");
    By viaje1OrigenLocator= By.xpath("//*[@id=\"modals\"]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/div/div/div/div[1]/div/div/div");
    By viaje1DestinoLocator=By.xpath("//*[@id=\"modals\"]/div[2]/div/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[1]/div");
    //By viaje2OrigenLocator= By.xpath("//*[@id=\"modals\"]/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div[2]/div[1]/div/div/div[2]/div/div/div/div[1]/div/div/div");
    By viaje2DestinoLocator=By.xpath("//*[@id=\"modals\"]/div[2]/div/div/div/div[2]/div/div[2]/div[3]/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div");

    By locatorDestinoBarcelona = By.xpath("//label[@for=':R4sd9lalamt2mm:']");
    By locatorEscribirBarcelona = By.xpath("//*[@id=\":R4sd9lalamt2mm:\"]");
    By locatorElegirBarcelona = By.xpath("//input[@value='Barcelona']");

    By locatorBtnOrigenVuelos = By.xpath("//input[@aria-label='Origen']");
    By locatorMadrid = By.xpath("//input[@value='Madrid (MAD)']");
    By locatorBtnDestinoVuelos = By.xpath("//input[@aria-label='Destino']");
    By locatorBarcelona = By.xpath("//input[@value='Barcelona (BCN)']");
    By locatorBtnFechaIda = By.xpath("//button[@aria-label='Fecha de ida']");
    By locatorBtnDiaIda = By.xpath("//button[contains(text(), '25')]");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");

    By locatorBtnBuscarMultidestino = By.xpath("//*[@id=\"modals\"]/div[2]/div/div/div/div[2]/div/div[3]/div/button");

    By locatorBtnFlecha = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[6]/div[1]/div/div[2]/div/div[2]/section/div/div/div[2]/button");

    By locatorPasajeros = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[6]/div/div/div/button");
    By locatorErrorTelefono = By.xpath("//form/section/div[4]/div/div[3]");
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

    public void abrirMultidestino() {
        String paginaOriginal = driver.getWindowHandle();

        click(esperarPorElementoLocalizado(locatorMultidestino));

        esperarXSegundos(2000);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!paginaOriginal.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void completarFormularioContacto(String nombre, String apellido, String correo, String telefono) {
        click(esperarPorElementoLocalizado(locatorNombreContacto));
        escribirTexto(esperarPorElementoLocalizado(locatorNombreContacto), nombre);
        click(esperarPorElementoLocalizado(locatorApellidoContacto));
        escribirTexto(esperarPorElementoLocalizado(locatorApellidoContacto), apellido);
        scrollByLocator(locatorCorreoContacto);
        click(esperarPorElementoLocalizado(locatorCorreoContacto));
        escribirTexto(esperarPorElementoLocalizado(locatorCorreoContacto), correo);
        scrollByLocator(locatorTelefono);
        click(esperarPorElementoLocalizado(locatorTelefono));
        escribirTexto(esperarPorElementoLocalizado(locatorTelefono), telefono);
        enter(esperarPorElementoLocalizado(locatorTelefono));
    }

    public void completarFormularioDireccion(String calle, String altura, String CP, String ciudad) {
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

    public void completarFormularioPasajero(String dia, String mes, String anio) {
        scrollByLocator(locatorChecks);
        click(esperarPorElementoLocalizado(locatorGeneroMasculino));
        escribirTexto(esperarPorElementoLocalizado(locatorDiaNacimientoPasajero), dia);
        click(esperarPorElementoLocalizado(locatorMesNacimientoPasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorMesNacimientoPasajero), mes);
        click(esperarPorElementoLocalizado(locatorEnero));
        click(esperarPorElementoLocalizado(locatorAnioNacimientoPasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorAnioNacimientoPasajero), anio);
    }

    public void equipajeFacturado() {
        scrollByLocator(locatorChecks);
    }


    public void siguiente() {
        scrollByLocator(locatorSiguiente);
        click(esperarPorElementoLocalizado(locatorSiguiente));
    }

    public void borrartodos() {
        click(locatorBtnBorrartodos);
        esperarXSegundos(3000);

    }
    public void CiudadparaMultidestino() {
        scrollByLocator(locatorCiudadparaMultidestino);
        click(esperarPorElementoLocalizado(locatorCiudadparaMultidestino));
    }

    public void busquedaVueloMultidestinoViaje1Origen(String destino) {

        escribirTexto(esperarPorElementoLocalizado(locatorCiudadparaMultidestino), destino);
        esperarXSegundos(1000);
        click(viaje1OrigenLocator);
    }
    public void busquedaVueloMultidestinoViaje1Destino(String destino) {

        escribirTexto(esperarPorElementoLocalizado(locatorCiudadparaMultidestino), destino);
        esperarXSegundos(1000);
        click(viaje1DestinoLocator);
    }

    public void busquedaVueloMultidestinoViaje2Destino(String destino) {

        escribirTexto(esperarPorElementoLocalizado(locatorCiudadparaMultidestino), destino);
        esperarXSegundos(1000);
        click(viaje2DestinoLocator);
    }
    public void buscarMultidestino(){click(locatorBtnBuscarMultidestino);
        esperarXSegundos(2000);
    }

    public void flechaparacambiarop(){click(locatorBtnFlecha);
        esperarXSegundos(2000);

    }
    public String obtenerErrorTelefono () {
        return obtenerTexto(esperarPorElementoLocalizado(locatorErrorTelefono));
    }
}