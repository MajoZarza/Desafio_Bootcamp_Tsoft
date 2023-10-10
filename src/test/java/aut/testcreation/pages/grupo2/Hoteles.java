package aut.testcreation.pages.grupo2;

import framework.engine.utils.grupo2.Rumbo_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hoteles extends Rumbo_Base{




    By locatorBtnDestino = By.xpath("//input[@id=':R4sd9lalamt2mm:']");

    By locatorBarcelona = By.xpath("(//input[@value='Barcelona'])");
    By locatorBtnFechaEntrada = By.className("d-s0z5ey");//para entrar el 1/11/23

    By locatorFechaSalida = By.className("d-1ktehkr");


git
    By locatorBtnBuscar = By.xpath("//button[@type='submit']");

    public Hoteles(WebDriver driver) {
        super(driver);
    }

    public void completarDestino() throws InterruptedException {


       click(esperarPorElementoLocalizado(locatorBtnDestino));
       //escribirTexto(esperarPorElementoLocalizado(locatorBtnDestino));
      //  enter(esperarPorElementoLocalizado(locatorBtnOrigenVuelos));

      //  click(esperarPorElementoLocalizado(locatorBtnDestino));
        Thread.sleep(3000);
       // escribirTexto(esperarPorElementoLocalizado(locatorBtnDestino), "Barcelona");
       // click(locatorBarcelona);
       // click(locatorBtnFechaEntrada);
        //click(locatorFechaSalida);
    }

    private void escribirTexto(WebElement webElement) {
    }

    public void buscar(){
        click(locatorBtnBuscar);

    }
/*
    click()
    escribirTexto(esperarPorElementoLocalizado(locatorNombreContacto), nombre);



2. Completar el campo "¿A donde quiere ir?" (Barcelona)
3. Seleccionar Fecha de entrada (1-11-2023)
4. Seleccionar Fecha de salida (11-11-2023)
5. Hacer clic en boton Buscar (lupa)
6. Seleccionar la primera opcion en la lista
7. Hacer clic en boton Modificar del Resumen de viaje
8. Seleccionar nueva Fecha de entrada
9. Seleccionar nueva Fecha de salida
10. Hacer clic en Buscar (lupa)*/

}
