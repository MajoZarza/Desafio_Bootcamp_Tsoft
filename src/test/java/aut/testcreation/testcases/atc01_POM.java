
<<<<<<< HEAD
/*package aut.testcreation.testcases;

package aut.testcreation.testcases;

=======
package aut.testcreation.testcases;
>>>>>>> e1772b496f83d553c7f8407c3a5d8a628f73b2c4

import aut.testcreation.pages.GoogleHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class atc01_POM extends SeleniumTestBase {

    GoogleHomePage googleHomePage;

    @Test
    @Tag("regresion")
    void busquedaGoogle() {
        googleHomePage = new GoogleHomePage(DriverFactory.getDriver());
        googleHomePage.navegarAlHome();
        googleHomePage.buscarConBotonBuscar("Tsoft");
        Assertions.assertEquals("Tsoft - Buscar con Google", googleHomePage.getUrlTitle());
    }
<<<<<<< HEAD

}

}*/

=======
}
>>>>>>> e1772b496f83d553c7f8407c3a5d8a628f73b2c4
