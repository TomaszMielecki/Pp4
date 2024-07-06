package pl.tmielecki.creditcard;

import org.junit.jupiter.api.Test;

public class HelloTest {

    void helloTest() {
        //A / Arrange / Given
        var a =2;
        var b =4;
        //A Act / When
        var result = a + b;
        //A Assert / then / expected
       assert 6 == result;




    }

    void itGreetUsername() {
        String name = "Tomek";
        String message = String.format("Hello %s", name);

    }
}
