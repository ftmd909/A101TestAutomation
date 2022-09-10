package TestCases;

import Drivers.FirefoxDrivers;
import Pages.CatalogCase;
import org.testng.annotations.Test;

public class Case1Test extends FirefoxDrivers {
    String userName = "piaerzincan@gmail.com";
    String pass = "24Erzincanpia24";


    @Test
    public void YaaniTest() {
        CatalogCase test=new CatalogCase(driver);

        test.WomenClothingFunction();
        test.ColorFunction();
        test.BasketControlFunction();
        test.CompleteOrderFunction();

    }

}
