package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hoteles extends Rumbo_Base {

    public Object agregarHabitacion;

    //Para ir al icono Hoteles:
    By locatorBtnHoteles = By.xpath("//a[@title='Hoteles']");


    //Dentro de apartado Hoteles:
    By locatorDestinoBarcelona = By.xpath("//label[@for=':R4sd9lalamt2mm:']");
    By locatorEscribirBarcelona = By.xpath("//*[@id=\":R4sd9lalamt2mm:\"]");
    By locatorElegirBarcelona = By.xpath("//input[@value='Barcelona']");
    By locatorBtnFechaEntrada = By.xpath("//label[@class='d-kf04ay'][text()='Fecha de entrada']");
    By locatorDiaEntrada = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[1]/div[1]/div/div/div[2]/section/div/div/div/div[3]/div[2]/button[1]");
    By locatorDiaSalida = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[1]/div[1]/div/div/div[2]/section/div/div/div/div[3]/div[2]/button[11]");
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");
    By locatorSeleccionarPersonas = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[1]");

    // CP_HT_01
    By locatorBtnSumarHabitacion = By.xpath("//*[@id=\"hub-csw-container\"]/div/div[2]/div/form/div/div[2]/div[1]/div/div[2]/div/div/section/div/section/div/button");
    By locatorFiltroPrecio = By.xpath("//div[@id='Pill-PriceContainer' and contains(text(), 'Precio')]");
    By locatorPrecioMax1000 = By.xpath("//div[@class='sc-fXSgeo kAKPXQ oss-ui-slider-bar']//div[@class='sc-JrDLc cZjmvO oss-ui-slider-bar-size']");
    By locatorBtnAplicarPrecio = By.xpath("//div[contains(text(), 'Aplicar')]");


    public Hoteles(WebDriver driver) {
        super(driver);
    }

    public void buscarLupa() {
        click(esperarPorElementoLocalizado(locatorBtnBuscar));
    }


    // INICIO DE RESERVA DE HOTELES - MENU PRINCIPAL

    public void inicioReservaHotel() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnHoteles));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDestinoBarcelona));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorEscribirBarcelona), "Barcelona");
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorElegirBarcelona));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnFechaEntrada));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDiaEntrada));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDiaSalida));
        Thread.sleep(2000);
    }

    // CP_HT_01 -----------------------------------------------
    public void agregarHabitacion() {
        click(esperarPorElementoLocalizado(locatorBtnSumarHabitacion));
    }

    public void aplicarRangoPrecio() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorFiltroPrecio));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorPrecioMax1000));
        Thread.sleep(5000);
        click(esperarPorElementoLocalizado(locatorBtnAplicarPrecio));
        Thread.sleep(2000);
    }



    // ---------------------------MAJO -----------------------------


    By locatorBtnModificar = By.xpath("//div/button[@type='button']");
    By locatorDiaNuevoEntrada = By.xpath("//button[text()='2']");
    By locatorSeleccionarBtnReservarDesde = By.xpath("//button[@data-test-id='book-cta']");
    By locatorSeleccionarBtnContinuar = By.xpath("//*[@id='rooms']/div[3]/div/div/div/div/div/div[1]/div[2]/div/div/div[1]/div/div[2]/button");
    By locatorFormNombre = By.xpath("//input[@name='name']");
    By locatorFormApellido = By.xpath("//input[@name='surname']");
    By locatorFormTelefono = By.xpath("//input[@name='phone']");
    By locatorNombreHuesped = By.xpath("//input[@name='groups.1.travellers.1.name']");
    By locatorBtnReservaParaOtraPersona = By.xpath("//div[@class='Switchstyles__Slider-sc-1ym8u79-3 iUCQwB']");
    By locatorBtnFiltros = By.xpath("//div[@id='Pill-undefined']");
    By locatorSeccionServicios = By.xpath("//div[@id='FacilitiesContainer']");
    By locatorOpcionWifi = By.xpath("//li/div[text()='Wifi gratis']");
    By locatorOpcionParking = By.xpath("//li/div[text()='Parking']");
    By locatorBtnAplicar = By.xpath("//div[text()='Aplicar']");
    By locatorBtnReservar = By.xpath(" //button[@data-test='submit-button']/span");
    By locatorNuevaFecha = By.xpath("//div[@aria-label='Hoteles']");
    By locatorHotelSunotel = By.xpath("//div[text()='Sunotel Central']");


    public void completarDestino() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnHoteles));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDestinoBarcelona));
        Thread.sleep(2000);
        escribirTexto(esperarPorElementoLocalizado(locatorEscribirBarcelona), "Barcelona");
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorElegirBarcelona));
        Thread.sleep(2000);
    }

    public void seleccionarFechas() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnFechaEntrada));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDiaEntrada));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDiaSalida));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorSeleccionarPersonas));
        Thread.sleep(3000);
    }

    public void seleccionarHotel() {
        click(esperarPorElementoLocalizado(locatorHotelSunotel));
    }


    public void scrollByLocator(By localizador) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", esperarPorElementoLocalizado(localizador));
    }

    public void abrirPageHotel() throws InterruptedException {
        String paginaOriginal = driver.getWindowHandle();
        click(esperarPorElementoLocalizado(locatorHotelSunotel));
        esperarXSegundos(2000);
        for (String windowHandle : driver.getWindowHandles()) {
            if (!paginaOriginal.contentEquals(windowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void seleccionarHabitacion() throws InterruptedException {
        this.abrirPageHotel();
        click(esperarPorElementoLocalizado(locatorSeleccionarBtnReservarDesde));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorSeleccionarBtnContinuar));
        Thread.sleep(3000);
    }

    public void completarDatos(String nombre, String apellido, String telefono) throws InterruptedException {
        escribirTexto(esperarPorElementoLocalizado(locatorFormNombre), nombre);
        Thread.sleep(3000);
        escribirTexto(esperarPorElementoLocalizado(locatorFormApellido), apellido);
        Thread.sleep(3000);
        escribirTexto(esperarPorElementoLocalizado(locatorFormTelefono), telefono);
        click(esperarPorElementoLocalizado(locatorBtnReservaParaOtraPersona));
        Thread.sleep(3000);
        escribirTexto(esperarPorElementoLocalizado(locatorNombreHuesped), nombre);
        Thread.sleep(3000);
    }

    public void filtrar() throws InterruptedException {

        click(esperarPorElementoLocalizado(locatorBtnFiltros));
        Thread.sleep(3000);
        scrollByLocator(locatorSeccionServicios);
        Thread.sleep(3000);
        //Filtro por wifi y parking
        click(esperarPorElementoLocalizado(locatorOpcionWifi));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorOpcionParking));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorBtnAplicar));
        Thread.sleep(4000);
    }

    public void ponerMalFecha() throws InterruptedException {
        click(esperarPorElementoLocalizado(locatorBtnFechaEntrada));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDiaSalida));
        Thread.sleep(2000);
        click(esperarPorElementoLocalizado(locatorDiaEntrada));
        Thread.sleep(2000);

    }

    public void reservar() throws InterruptedException {
        scrollByLocator(locatorBtnReservar);
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorBtnReservar));
        Thread.sleep(3000);
    }

    public void modificarFechas() throws InterruptedException {
        this.abrirPageHotel();
        click(esperarPorElementoLocalizado(locatorBtnModificar));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorNuevaFecha));
        Thread.sleep(3000);
        click(esperarPorElementoLocalizado(locatorDiaNuevoEntrada));
        Thread.sleep(10000);
    }

}


