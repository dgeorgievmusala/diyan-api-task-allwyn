package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import routes.Routes;
import utils.ConfigReader;


public class BaseTest {

    ConfigReader configReader;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = Routes.BASE_URL;
        configReader = new ConfigReader();

    }

}
