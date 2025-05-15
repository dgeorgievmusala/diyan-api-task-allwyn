//package tests;
//
//import base.BaseTest;
//import endpoints.AuthorEndpoints;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import payloads.Author;
//import specifications.RequestSpec;
//import specifications.ResponseSpec;
//
//public class AuthorTests extends BaseTest {
//
//    @Test(priority = 1)
//    public void getAllAuthors() {
//        Response response = RestAssured
//                .given()
//                .spec(RequestSpec.getRequestSpec())
//                .when()
//                .get(AuthorEndpoints.BASE_PATH)
//                .then()
//                .spec(ResponseSpec.getResponseSpec())
//                .extract().response();
//
//        Assert.assertEquals(response.statusCode(), 200);
//    }
//
//    @Test(priority = 2)
//    public void createAuthor() {
//        Author newAuthor = new Author(0, 101, "Jane", "Austen");
//
//        Response response = RestAssured
//                .given()
//                .spec(RequestSpec.getRequestSpec())
//                .body(newAuthor)
//                .when()
//                .post(AuthorEndpoints.BASE_PATH)
//                .then()
//                .statusCode(201)
//                .extract().response();
//
//        int createdId = response.jsonPath().getInt("id");
//        Assert.assertTrue(createdId > 0);
//    }
//
//    @Test(priority = 3)
//    public void getAuthorById() {
//        int authorId = 1; // Replace with dynamic or known ID
//
//        Response response = RestAssured
//                .given()
//                .spec(RequestSpec.getRequestSpec())
//                .pathParam("id", authorId)
//                .when()
//                .get(AuthorEndpoints.BY_ID)
//                .then()
//                .statusCode(200)
//                .extract().response();
//
//        Assert.assertEquals(response.jsonPath().getInt("id"), authorId);
//    }
//
//    @Test(priority = 4)
//    public void updateAuthorById() {
//        int authorId = 1; // Replace with dynamic ID if created during test
//        Author updatedAuthor = new Author(authorId, 101, "UpdatedFirst", "UpdatedLast");
//
//        RestAssured
//                .given()
//                .spec(RequestSpec.getRequestSpec())
//                .pathParam("id", authorId)
//                .body(updatedAuthor)
//                .when()
//                .put(AuthorEndpoints.BY_ID)
//                .then()
//                .statusCode(200);
//    }
//
//    @Test(priority = 5)
//    public void deleteAuthorById() {
//        int authorId = 1; // Replace with the ID of an author to delete
//
//        RestAssured
//                .given()
//                .spec(RequestSpec.getRequestSpec())
//                .pathParam("id", authorId)
//                .when()
//                .delete(AuthorEndpoints.BY_ID)
//                .then()
//                .statusCode(204);
//    }
//}
