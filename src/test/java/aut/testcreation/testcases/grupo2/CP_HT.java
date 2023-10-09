package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CP_HT {
    WebDriver driver;
    HomePage homePage;
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
    //Reserva de Hotel - Añadir habitación
    public void CP_HT_01(){

    }

    @Test
    //Reserva de Hotel - Filtrar precios
    public void CP_HT_02(){

    }
    @Test
    //Reserva de Habitación - con modificación de fecha - "Resumen de viaje"
    public void CP_HT_03(){

    }
    @Test
    //Error por fecha límite en el calendario - Reserva de hotel
    public void CP_HT_04(){

    }
    @Test
    //Error falta de ingreso de un campo obligatorio - Reserva para otra persona habitación de hotel
    public void CP_HT_05(){

    }
    @Test
    //Reserva de habitación - Con WIFI y Parking
    public void CP_HT_06(){

    }

    @AfterEach
    public void afterTests (){ homePage.cerrarBrowser(); }
}
