
package aut.testcreation.testcases;

<<<<<<< HEAD
/*package aut.testcreation.testcases;
>>>>>>> refs/remotes/origin/main
=======
>>>>>>> e1772b496f83d553c7f8407c3a5d8a628f73b2c4

import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class TestDemo extends SeleniumTestBase {

    WebDriver driver;

    @Test
    @Issue("123")
    @Issue("432")
    @DisplayName("Human-readable test name")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Test creado para bootcamp 9 tsoft")
    public void testDemo() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.navigate().to(BASE_URL_AUT);
        Thread.sleep(5000);
        Assertions.assertTrue(true);
    }
<<<<<<< HEAD

}

}*/

=======
}
>>>>>>> e1772b496f83d553c7f8407c3a5d8a628f73b2c4
