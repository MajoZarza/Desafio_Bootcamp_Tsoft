package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Vuelos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CP_AV {
    WebDriver driver;
    HomePage homePage;
    Vuelos vuelos;
    String rutaDriver = "C:\\Users\\guido.paparua\\Desktop\\BootCamp\\GIT\\Repo de todos - practica\\app\\src\\test\\resources\\drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";
    @BeforeEach
    public void preTests(){
        homePage = new HomePage(driver);
        homePage.conexionDriver(browser,rutaDriver,property);
        homePage.cargarPagina("https://www.rumbo.es/");
        homePage.maximizar();
        homePage.cerrarCookies();
    }

    @Test
    //Reserva de Vuelo - Multidestino
    public void CP_AV_01(){

    }


    @Test
   //Error por no encontrar resultados - Reserva de Vuelo solo IDA
    public void CP_AV_02(){

    }
    @Test
    //Error falta de ingreso de un campo obligatorio - Reserva vuelo - SOLO IDA
    public void CP_AV_03(){
        homePage.busquedaVueloSoloIda("Madrid (MAD)", "Barcelona (BCN)"); //si no aplico tab no me los toma
        // aca sin un sleep se me rompe
        //vuelos.seleccionarPrimerVuelo(); // no estoy pudiendo seleccionarlo
        //vuelos.tarifaClassic();
        //vuelos.completarFormularioContacto("Dario", "Daro", "darioa@gmail.com", "Argentina", "11115555");
        //vuelos.completarFormularioDireccion("Gran via", "10", "28006", "Madrid");
        //vuelos.completarFormularioPasajero("Dario", "Daro", "15", "Enero", "1991");
    }
    @Test
    //Reserva de Vuelo - Solo Ida - Elección Full Flex
    public void CP_AV_04(){

    }
    @Test
    //Busqueda Vuelo - Solo ida - con opción Tarjeta Maestro
    public void CP_AV_05(){

    }
    @Test
    //Busqueda Vuelo - Ida y vuelta - con opción Primera Clase
    public void CP_AV_06(){

    }

    @AfterEach
    public void afterTests (){ homePage.cerrarBrowser(); }
}
