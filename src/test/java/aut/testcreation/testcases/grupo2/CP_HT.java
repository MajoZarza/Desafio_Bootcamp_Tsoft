package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Hoteles;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import framework.engine.utils.grupo2.Rumbo_Base;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Driver;
import java.util.List;
import java.util.Set;

public class CP_HT extends SeleniumTestBase {
    WebDriver driver;
    HomePage homePage;
    Hoteles hoteles;


    @BeforeEach
    public void preTests() {
        hoteles = new Hoteles(DriverFactory.getDriver());
        driver = DriverFactory.getDriver();
        hoteles = new Hoteles(driver);
        homePage = new HomePage(driver);
        homePage.cargarPagina("https://www.rumbo.es/");
        homePage.maximizar();
        homePage.cerrarCookies();
    }

    @Test
    //Reserva de Hotel - Añadir habitación
    public void CP_HT_01() throws InterruptedException {
        Thread.sleep(2000);
        homePage.hoteles();
        Thread.sleep(2000);
        hoteles.inicioReservaHotel();
        Thread.sleep(2000);
        hoteles.agregarHabitacion();
        Thread.sleep(2000);
        hoteles.buscarLupa();
        Thread.sleep(2000);
    }


    @Test
    //Reserva de Hotel - Filtrar precios
    public void CP_HT_02() throws InterruptedException {
        homePage.hoteles();
        Thread.sleep(2000);
        hoteles.inicioReservaHotel();
        Thread.sleep(2000);
        hoteles.buscarLupa();
        Thread.sleep(2000);
        hoteles.aplicarRangoPrecio();
        Thread.sleep(5000);
    }

    @Test
    public void CP_HT_03() throws InterruptedException {
        Thread.sleep(3000);
        homePage.hoteles();
        Thread.sleep(3000);
        hoteles.completarDestino();
        Thread.sleep(3000);
        hoteles.seleccionarFechas();
        Thread.sleep(3000);
        hoteles.buscarLupa();
        Thread.sleep(3000);
        hoteles.seleccionarHotel();
        Thread.sleep(3000);
        hoteles.modificarFechas();
        Thread.sleep(3000);
        hoteles.buscarLupa();
    }


    @Test
//Error por fecha límite en el calendario - Reserva de hotel
    public void CP_HT_04() throws InterruptedException {

        homePage.hoteles();
        Thread.sleep(3000);
        hoteles.completarDestino();
        Thread.sleep(3000);
        hoteles.ponerMalFecha();
        Thread.sleep(3000);
        hoteles.buscarLupa();
        Thread.sleep(3000);
    }

    @Test

//Error falta de ingreso de un campo obligatorio - Reserva para otra persona habitación de hotel
    public void CP_HT_05() throws InterruptedException {

        Thread.sleep(3000);
        homePage.hoteles();
        Thread.sleep(3000);
        hoteles.completarDestino();
        Thread.sleep(3000);
        hoteles.seleccionarFechas();
        Thread.sleep(3000);
        hoteles.buscarLupa();
        Thread.sleep(3000);
        hoteles.seleccionarHabitacion();
        Thread.sleep(3000);
        hoteles.completarDatos("Dario", "Daro", "11115555");
        Thread.sleep(3000);
        hoteles.reservar();
        Thread.sleep(3000);
        WebElement textoMensaje = driver.findElement(By.xpath("//span[text()='Introduce el apellido']"));
        By locatorApellidoHuesped = By.xpath("//span[text()='Introduce el apellido']");
        String resultadoObtenido = textoMensaje.getText();
        hoteles.obtenerTexto(locatorApellidoHuesped);
        String resultadoEsperado = "Introduce el apellido";
        Assertions.assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
//Reserva de habitación - Con WIFI y Parking
    public void CP_HT_06() throws InterruptedException {
        Thread.sleep(2000);
        homePage.hoteles();
        Thread.sleep(2000);
        hoteles.completarDestino();
        Thread.sleep(2000);
        hoteles.seleccionarFechas();
        Thread.sleep(2000);
        hoteles.buscarLupa();
        Thread.sleep(2000);
        hoteles.filtrar();
        Thread.sleep(2000);
    }

    @AfterEach
    public void afterTests() {
        homePage.cerrarBrowser();
    }
}


