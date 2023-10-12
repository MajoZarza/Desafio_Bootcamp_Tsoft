package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Trenes;
import aut.testcreation.pages.grupo2.Vuelos;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;



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
        Assertions.assertEquals(("Lo sentimos, no se pueden reservar más de 31 noches"), trenes.obtenerError());
    }


    @Test
    //Reserva Tren - Ida y vuelta
    public void CP_TR_02() {
        trenes.reservaTren("Madrid", "Barcelona");
        homePage.esperarXSegundos(5000);
        trenes.buscarLupa();
        homePage.esperarXSegundos(5000);
        trenes.seleccionarPrimerTrenParaReserva();
        homePage.esperarXSegundos(3000);
        trenes.completarFormularioContactoTren("Dario", "Daro", "darioa@gmail.com", "198889997");
        trenes.completarFormularioPasajero("15", "Enero", "1991");
        trenes.agregarDNI("1115555");
        homePage.esperarXSegundos(3000);
        trenes.completarFormularioContactoTren2("Daria", "Daro");
        homePage.esperarXSegundos(2000);
        trenes.completarFormularioPasajero2("15", "Febrero", "1992");
        trenes.agregarDNI2("1115556");
        trenes.BtnSiguiente();
        homePage.esperarXSegundos(2000);


    }

    @Test
    //Error por querer ingresar email inválido  - Reserva Tren
    public void CP_TR_03() {
        trenes.reservaSoloIda("Madrid", "Barcelona");
        homePage.esperarXSegundos(2000);
        trenes.seleccionarPrimerVuelo();
        homePage.esperarXSegundos(2000);
        vuelos.completarFormularioContacto("Dario", "Daro", "darioa@@gmail.com", "198889997");
        homePage.esperarXSegundos(2000);
        Assertions.assertEquals(("Introduce un email válido"), trenes.obtenerErrorEmail());
    }

    @Test
    //Error no se ingresa ciudad de destino - Busqueda Tren
    public void CP_TR_04() {
        trenes.reservaErrorSinDestino("Madrid");
        Assertions.assertEquals(("Selecciona ciudad de destino"), trenes.obtenerError());
    }

    @Test
    //Reserva Tren - Solo ida - eligiendo opción el más rápido
    public void CP_TR_05() {
        trenes.reservaSoloIda("Madrid", "Barcelona");
        homePage.esperarXSegundos(2000);
        trenes.elMasRapido();
        homePage.esperarXSegundos(2000);
        trenes.seleccionarPrimerVuelo();
        homePage.esperarXSegundos(2000);
        vuelos.completarFormularioContacto("Dario", "Daro", "darioa@gmail.com", "198889997");
        vuelos.completarFormularioDireccion("Gran via", "10", "28006", "Madrid");
        vuelos.completarFormularioPasajero("15", "Enero", "1991");
        trenes.sinProteccionAdicional();
    }


    @Test
    public void CP_TR_06() throws InterruptedException {
        trenes.inicioFaltaDNI2("Madrid", "Barcelona");
        trenes.seleccionarPrimerVuelo();
        homePage.esperarXSegundos(5000);
        //le agrege espera al general
        trenes.completarFormularioContactoTren("Dario", "Daro", "darioa@gmail.com", "198889997");
        homePage.esperarXSegundos(3000);
        //le agrege espera al general
        trenes.completarFormularioPasajero("15", "Enero", "1991");
        homePage.esperarXSegundos(2000);
        trenes.BtnSiguiente();
        Assertions.assertEquals("Introduce nº de documento", trenes.obtenerErrorDNI());

    }


    @AfterEach

    public void afterTests (){ homePage.cerrarBrowser(); }




}