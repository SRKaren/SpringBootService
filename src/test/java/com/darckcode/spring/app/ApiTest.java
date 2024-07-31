import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {

    @Test
    public void testGetRequest() {
        RestAssured.baseURI = "http://localhost:8080";

        Response response = given()
            .when()
            .get("/posts/1")
            .then()
            .statusCode(200)
            .body("userId", equalTo(1))
            .body("id", equalTo(1))
            .body("title", equalTo("Sample Title"))
            .body("body", equalTo("This is a sample body."))
            .extract()
            .response();

        // Imprimir respuesta en consola
        System.out.println(response.asString());
    }
}
