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
    public void CP_AV_01(){

    }

    @Test
    public void CP_AV_02(){

    }
    @Test
    public void CP_AV_03(){
        homePage.busquedaVueloSoloIda("Madrid", "Barcelona"); //si no aplico tab no me los toma
        // aca sin un sleep se me rompe
        vuelos.seleccionarPrimerVuelo(); // no estoy pudiendo seleccionarlo
        vuelos.tarifaClassic();
        vuelos.completarFormularioContacto("Dario", "Daro", "darioa@gmail.com", "Argentina", "11115555");
        vuelos.completarFormularioDireccion("Gran via", "10", "28006", "Madrid", "España");
        vuelos.completarFormularioPasajero("Dario", "Daro", "15", "Enero", "1991");
    }
    @Test
    public void CP_AV_04(){

    }
    @Test
    public void CP_AV_05(){

    }
    @Test
    public void CP_AV_06(){

    }

    @AfterEach
    public void afterTests (){ homePage.cerrarBrowser(); }
}
