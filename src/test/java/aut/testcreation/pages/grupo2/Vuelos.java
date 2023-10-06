package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Vuelos extends Rumbo_Base {

    By locatorPrimerVuelo = By.xpath("//div[@class='FullTransportSummary__SummaryColumn-sc-aaxr6w-0 jegcUp']");
    By locatorSeleccionar = By.xpath("//button[contains(text(), 'Seleccionar')]");
    By locatorTarifaClassic = By.xpath("//button[contains(text(), 'Elegir Classic')]");
    By locatorNombreContacto = By.xpath("//input[@name='name']");
    By locatorApellidoContacto = By.xpath("//input[@name='surname']");
    By locatorCorreoContacto = By.xpath("//input[@name='email']");
    By locatorPrefijoTelefono = By.xpath("//button[@class='FormFieldstyles__InnerWrapper-sc-1pt5zgp-3 Selectstyles__InnerWrapper-sc-d5yk3i-2 fUwskt dNHwnH']");
    By locatorPrefijoArg = By.xpath("//img[@alt='ar']");
    By locatorTelefono = By.xpath("//input[@name='phone']");

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

    public void completarFormularioDireccion (String calle, String altura, String CP, String ciudad, String pais) {

    }
    public void completarFormularioPasajero (String nombre, String apellido, String dia, String mes, String anio) {

    }
}
