package pl.tmielecki.ecommerce.catalog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

public class CatalogHttpTest {

    @Autowired
    ProductCatalog catalog;

    @Test
    void itLoadsProductsOverHttp() {
        var url = String.format("http://localhost:%s/api/products", port);
        catalog.addProduct("My Example Product", "ex desc");

        ReponseEntity<Product[]> response = http.getForEntity(url, Product[].class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody())
                .hasSizeGreaterThan(1)
                .extracting("name")
                .contains
    }
}
