package lab7.first;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class AppTest {

    @Test
    public void whenGetUrlThenStatusCode200() {

        String URL = "https://jsonplaceholder.typicode.com/todos";
        given().when().get(URL).then().assertThat().statusCode(200);
    }

    @Test
    public void whenGetTodo4CheckName() {
        String URL = "https://jsonplaceholder.typicode.com/todos/4";

        given().when().get(URL).then().assertThat().body("id", equalTo(4))
        .and().body("title", equalTo("et porro tempora"));
    }

    @Test
    public void whenGetTodoCheckElements198And199ArePresent() {

        String URL = "https://jsonplaceholder.typicode.com/todos";
        given().when().get(URL).then().assertThat().body("id", hasItems(198,199));
    }
}