package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CP_TR {
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
    //Error al querer reservar más de 31 noches - Busqueda Tren - Ida y Vuelta
    public void CP_TR_01(){

    }

    @Test
    //Reserva Tren - Ida y vuelta
    public void CP_TR_02(){

    }
    @Test
    //Error por querer ingresar email inválido  - Reserva Tren
    public void CP_TR_03(){

    }
    @Test
    //Reserva Tren - Solo ida - eligiendo opción el más rápido
    public void CP_TR_04(){

    }
    @Test
    //Error por no ingresar el DNI en la registración - Reserva Tren - Solo ida
    public void CP_TR_05(){

    }
    @Test
    public void CP_TR_06(){

    }

    @AfterEach
    public void afterTests (){ homePage.cerrarBrowser(); }
}
