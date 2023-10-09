package aut.testcreation.testcases.grupo2;

import aut.testcreation.pages.grupo2.HomePage;
import aut.testcreation.pages.grupo2.Hoteles;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class CP_HT {
    WebDriver driver;
    HomePage homePage;
    Hoteles hoteles; //= new Hoteles(driver);
    String rutaDriver ="C:\\Users\\maria.zarza\\Desktop\\Majo\\Desafio_Bootcamp_Tsoft\\src\\test\\resources\\Drivers\\chromedriver.exe";
            //"C:\\Users\\guido.paparua\\Desktop\\BootCamp\\GIT\\Repo de todos - practica\\app\\src\\test\\resources\\drivers\\chromedriver.exe";
    String browser = "Chrome";
    String property = "webdriver.chrome.driver";


    @BeforeEach
    public void preTests(){
        hoteles = new Hoteles(driver);
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
<<<<<<< HEAD
    public void CP_HT_03() throws InterruptedException {

        //WebDriver driver = new ChromeDriver();
        //Hoteles hoteles = new Hoteles(driver);
      //  Thread.sleep(3000);
        //homePage.hoteles();
        //Thread.sleep(5000);
        //hoteles.completarDestino();
        //Thread.sleep(3000);
        //hoteles.buscar();
        //Thread.sleep(3000);
=======
    //Reserva de Habitación - con modificación de fecha - "Resumen de viaje"
    public void CP_HT_03(){
>>>>>>> 572fb9c4eece9607208ef41811930a48c2e84db0

    }
    @Test
    //Error por fecha límite en el calendario - Reserva de hotel
    public void CP_HT_04(){
        homePage.hoteles();

    }
    @Test
    //Error falta de ingreso de un campo obligatorio - Reserva para otra persona habitación de hotel
    public void CP_HT_05(){

        homePage.hoteles();


    }
    @Test
    //Reserva de habitación - Con WIFI y Parking
    public void CP_HT_06(){
        homePage.hoteles();

    }

    @AfterEach
    public void afterTests (){ homePage.cerrarBrowser(); }
}
