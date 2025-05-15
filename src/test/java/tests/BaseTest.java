package tests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import routes.BookRoutes;
import utils.AuthorConfigReader;
import utils.BookConfigReader;


public class BaseTest {
    AuthorConfigReader authorConfigReader;
    BookConfigReader bookConfigReader;

    @BeforeClass
    public void setup() {

        RestAssured.baseURI = BookRoutes.BASE_URL;

        authorConfigReader = new AuthorConfigReader();
        bookConfigReader = new BookConfigReader();
    }

}
