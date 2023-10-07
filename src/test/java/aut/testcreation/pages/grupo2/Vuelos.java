package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Vuelos extends Rumbo_Base {

    By locatorPrimerVuelo = By.xpath("//div[@class='FullTransportSummary__SummaryColumn-sc-aaxr6w-0 jegcUp']");
    By locatorSeleccionar = By.xpath("//button[contains(text(), 'Seleccionar')]");
    By locatorTarifaClassic = By.xpath("//button[contains(text(), 'Elegir Classic')]");
    By locatorNombreContacto = By.xpath("//input[@name='name']");
    By locatorNombrePasajero = By.xpath("//input[@name='groups.1.travellers.1.surname']");
    By locatorApellidoContacto = By.xpath("//input[@name='surname']");
    By locatorApellidoPasajero = By.xpath("//input[@name='groups.1.travellers.1.surname']");
    By locatorCorreoContacto = By.xpath("//input[@name='email']");
    By locatorPrefijoTelefono = By.xpath("//button[@class='FormFieldstyles__InnerWrapper-sc-1pt5zgp-3 Selectstyles__InnerWrapper-sc-d5yk3i-2 fUwskt dNHwnH']");
    By locatorPrefijoArg = By.xpath("//img[@alt='ar']");
    By locatorTelefono = By.xpath("//input[@name='phone']");
    By locatorCalle = By.xpath("//input[@name='address']");
    By locatorAlturaCalle = By.xpath("//input[@name='houseNumber']");
    By locatorCodigoPostal = By.xpath("//input[@name='postCode']");
    By locatorCiudad = By.xpath("//input[@name='city']");
    By locatorChecks = By.xpath("//span[@class='custom-radio']");
    By locatorGeneroMasculino = By.xpath("//span[@class='radio-groups.1.travellers.1.title-MALE']");
    By locatorDiaNacimientoPasajero = By.xpath("//input[@data-testid='[0-9]{1,2}']");
    By locatorMesNacimientoPasajero = By.xpath("//data-testid='groups.1.travellers.1.dateOfBirth_month'");
    By locatorEnero = By.xpath("//span[contains(text(), 'enero')]");
    By locatorAnioNacimientoPasajero = By.xpath("//input[@data-testid='[0-9]{1,4}']");

    public Vuelos(WebDriver driver) { super(driver); }

    public void seleccionarPrimerVuelo () {
        click(esperarPorElementoLocalizado(locatorPrimerVuelo));
        click(esperarPorElementoLocalizado(locatorSeleccionar));
    }

    public void tarifaClassic () {
        click(esperarPorElementoLocalizado(locatorTarifaClassic));
    }

    public void completarFormularioContacto (String nombre, String apellido, String correo, String prefijo, String telefono) {
        click(esperarPorElementoLocalizado(locatorNombreContacto));
        escribirTexto(esperarPorElementoLocalizado(locatorNombreContacto), nombre);
        click(esperarPorElementoLocalizado(locatorApellidoContacto));
        escribirTexto(esperarPorElementoLocalizado(locatorApellidoContacto), apellido);
        click(esperarPorElementoLocalizado(locatorCorreoContacto));
        escribirTexto(esperarPorElementoLocalizado(locatorCorreoContacto), correo);
        click(esperarPorElementoLocalizado(locatorPrefijoTelefono));
        escribirTexto(esperarPorElementoLocalizado(locatorPrefijoTelefono), prefijo);
        click(esperarPorElementoLocalizado(locatorPrefijoArg));
        click(esperarPorElementoLocalizado(locatorTelefono));
        escribirTexto(esperarPorElementoLocalizado(locatorTelefono), telefono);
    }

    public void completarFormularioDireccion (String calle, String altura, String CP, String ciudad) {
        click(esperarPorElementoLocalizado(locatorCalle));
        escribirTexto(esperarPorElementoLocalizado(locatorCalle), calle);
        click(esperarPorElementoLocalizado(locatorAlturaCalle));
        escribirTexto(esperarPorElementoLocalizado(locatorAlturaCalle), altura);
        click(esperarPorElementoLocalizado(locatorCodigoPostal));
        escribirTexto(esperarPorElementoLocalizado(locatorCodigoPostal), CP);
        click(esperarPorElementoLocalizado(locatorCiudad));
        escribirTexto(esperarPorElementoLocalizado(locatorCiudad), ciudad);
    }
    public void completarFormularioPasajero (String nombre, String apellido, String dia, String mes, String anio) {
        scrollByLocator(locatorChecks);
        click(esperarPorElementoLocalizado(locatorGeneroMasculino));
        click(esperarPorElementoLocalizado(locatorNombrePasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorNombrePasajero), nombre);
        click(esperarPorElementoLocalizado(locatorApellidoPasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorApellidoPasajero), apellido);
        click(esperarPorElementoLocalizado(locatorDiaNacimientoPasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorDiaNacimientoPasajero), dia);
        click(esperarPorElementoLocalizado(locatorMesNacimientoPasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorMesNacimientoPasajero), mes);
        click(esperarPorElementoLocalizado(locatorEnero));
        click(esperarPorElementoLocalizado(locatorAnioNacimientoPasajero));
        escribirTexto(esperarPorElementoLocalizado(locatorAnioNacimientoPasajero), anio);

    }
}
