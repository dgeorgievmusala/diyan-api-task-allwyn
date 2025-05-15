package tests;

import org.testng.annotations.Test;

import routes.Routes;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.greaterThan;

public class BookTests extends BaseTest {
    @Test
    public void testGetAllProducts() {
        given()
         .when().get(Routes.GET_ALL_BOOKS)
                .then().statusCode(200).body("size()",greaterThan(0))
                .log().body();
    }


}
