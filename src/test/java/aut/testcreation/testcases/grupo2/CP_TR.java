package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Trenes;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import framework.engine.utils.grupo2.Rumbo_Base;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import javax.xml.datatype.DatatypeFactory;


public class CP_TR extends SeleniumTestBase {

    WebDriver driver;
    HomePage homePage;
    Trenes trenes;

    @BeforeEach
    public void preTests() {
        driver= DriverFactory.getDriver();
        homePage = new HomePage(driver);
        trenes = new Trenes(driver);
        homePage.cargarPagina("https://www.rumbo.es/trenes/");
        homePage.maximizar();
        homePage.cerrarCookies();
    }

    @Test
    //Error al querer reservar más de 31 noches - Busqueda Tren - Ida y Vuelta
    public void CP_TR_01() throws InterruptedException {
        trenes.reservaLargaError("Madrid", "Barcelona");
    }

    @Test
    //Reserva Tren - Ida y vuelta
    public void CP_TR_02() {

    }

    @Test
    //Error por querer ingresar email inválido  - Reserva Tren
    public void CP_TR_03() {

    }

    @Test
    //Reserva Tren - Solo ida - eligiendo opción el más rápido
    public void CP_TR_04() {

    }

    @Test
    //Error por no ingresar el DNI en la registración - Reserva Tren - Solo ida
    public void CP_TR_05() {

    }

    @Test
    public void CP_TR_06() {

    }

    @AfterEach
    public void afterTests() {
        homePage.cerrarBrowser();
    }
}
