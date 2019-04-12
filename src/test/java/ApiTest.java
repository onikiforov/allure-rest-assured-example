import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class ApiTest {
    @Test
    void testAllureReportWithRestAssured() {
        Response response = given().filter(new AllureRestAssured()).get("https://api.github.com/events");
//        Response response = given().get("https://api.github.com/events");
        System.out.println(response.prettyPrint());
    }
}
