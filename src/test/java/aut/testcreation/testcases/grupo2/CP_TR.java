package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Trenes;
import aut.testcreation.pages.grupo2.Vuelos;
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
    Vuelos vuelos;

    @BeforeEach
    public void preTests() {
        driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        trenes = new Trenes(driver);
        vuelos = new Vuelos (driver);
        homePage.cargarPagina("https://www.rumbo.es/trenes/");
        //homePage.cargarPagina("https://www.rumbo.es/");
        //trenes.entraraTrenes();
        homePage.maximizar();
        homePage.cerrarCookies();
    }

    @Test
    //Error al querer reservar más de 31 noches - Busqueda Tren - Ida y Vuelta
    public void CP_TR_01() {
        trenes.reservaLargaError("Madrid", "Barcelona");
        homePage.esperarXSegundos(1000);



        // comparar el mensaje con //span[@role='alert']
        // Lo sentimos, no se pueden reservar más de 31 noches

    }


    @Test
    //Reserva Tren - Ida y vuelta
    public void CP_TR_02() {
        trenes.reservaTren("Madrid", "Barcelona");
        homePage.esperarXSegundos(1000);
        trenes.buscarLupa();
        homePage.esperarXSegundos(5000);
        trenes.seleccionarPrimerTren();
        homePage.esperarXSegundos(3000);
        trenes.completarFormularioContactoTren("Dario", "Daro", "darioa@gmail.com", "198889997");


    }

    @Test
    //Error por querer ingresar email inválido  - Reserva Tren
    public void CP_TR_03() {

    }

    @Test
    //Error no se ingresa ciudad de destino - Busqueda Tren
    public void CP_TR_04() {

    }

    @Test
    //Reserva Tren - Solo ida - eligiendo opción el más rápido
    public void CP_TR_05() {
        trenes.reservaSoloIda("Madrid", "Barcelona");
        homePage.esperarXSegundos(5000);
        trenes.seleccionarPrimerVuelo();
        homePage.esperarXSegundos(10000);
        vuelos.completarFormularioContacto("Dario", "Daro", "darioa@gmail.com", "198889997");
        vuelos.completarFormularioDireccion("Gran via", "10", "28006", "Madrid");
        vuelos.completarFormularioPasajero("15", "Enero", "1991");
        trenes.sinProteccionAdicional();
    }

    @Test
    //Error por no ingresar el DNI en la registración - Reserva Tren - Solo ida
    public void CP_TR_06() {

    }

    @AfterEach

    public void afterTests (){ homePage.cerrarBrowser(); }




}






