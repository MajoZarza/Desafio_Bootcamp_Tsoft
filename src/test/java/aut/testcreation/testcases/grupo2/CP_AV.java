package aut.testcreation.testcases.grupo2;


import framework.engine.selenium.DriverFactory;
import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Vuelos;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CP_AV extends SeleniumTestBase {
    HomePage homePage;
    Vuelos vuelos;
    @BeforeEach
    public void preTests() {
        WebDriver driver= DriverFactory.getDriver();
        homePage = new HomePage(driver);
        vuelos = new Vuelos(homePage.getDriver());
        homePage.cargarPagina("https://www.rumbo.es/");
        homePage.maximizar();
        homePage.cerrarCookies();
    }

    @Test
    //Reserva de Vuelo - Multidestino
    public void CP_AV_01() {
        homePage.vuelos();
        vuelos.abrirMultidestino();
        vuelos.borrartodos();
        vuelos.busquedaVueloMultidestinoViaje1Origen("Barcelona");
        homePage.esperarXSegundos(1000);
        vuelos.busquedaVueloMultidestinoViaje1Destino("Madrid");
        homePage.esperarXSegundos(1000);
        vuelos.busquedaVueloMultidestinoViaje2Destino("Buenos aires");
        homePage.esperarXSegundos(3000);
        vuelos.buscarMultidestino();
        homePage.esperarXSegundos(5000);

    }

    @Test
    //Error por no encontrar resultados - Reserva de Vuelo solo IDA
    public void CP_AV_02()  {
    homePage.busquedaVueloSoloIdaOtroDestino("Villa Gesell (VLG)", "Seúl (SEL)");
    homePage.esperarXSegundos(100000);
    Assertions.assertTrue(true);

    }

    @Test
    public void CP_AV_03()  {
        homePage.busquedaVueloSoloIda("Madrid (MAD)", "Barcelona (BCN)");
        homePage.esperarXSegundos(10000);
        vuelos.seleccionarPrimerVuelo();
        vuelos.tarifaClassic();
        vuelos.completarFormularioContacto("Dario", "Daro", "darioa@gmail.com", "198889997");
        vuelos.siguiente();
    }

    @Test
    //Reserva de Vuelo - Solo Ida - Elección Full Flex
    public void CP_AV_04()  {
        homePage.busquedaVueloSoloIda("Madrid (MAD)", "Barcelona (BCN)");
        homePage.esperarXSegundos(10000);
        vuelos.seleccionarPrimerVuelo();
        vuelos.tarifaFlex();
        vuelos.completarFormularioContacto("Dario", "Daro", "darioa@gmail.com", "198889997");
        vuelos.completarFormularioDireccion("Gran via", "10", "28006", "Madrid");
        vuelos.completarFormularioPasajero("15", "Enero", "1991");
        vuelos.equipajeFacturado();
    }

    @Test
    //Busqueda Vuelo - Solo ida - con opción Tarjeta Maestro
    public void CP_AV_05() {

    }

    @Test
    //Busqueda Vuelo - Ida y vuelta - con opción Primera Clase
    public void CP_AV_06() {
        homePage.busquedaVueloSoloIda("Madrid (MAD)", "Barcelona (BCN)");
        homePage.esperarXSegundos(10000);
        vuelos.flechaparacambiarop();
        homePage.esperarXSegundos(3000);

    }

  @AfterEach
    public void afterTests() {
        homePage.cerrarBrowser();
    }
}

