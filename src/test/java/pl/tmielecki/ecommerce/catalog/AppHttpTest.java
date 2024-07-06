package pl.tmielecki.ecommerce.catalog;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(
        webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT
)

public class AppHttpTest {
    @LocalServerPort
    int port;

    @Autowired
    TestRestTemplate http;

    @Test
    void itLoadsEcommerceHomepage() {
        var url = String.format("http://localhost:%s", port);
    }
}
