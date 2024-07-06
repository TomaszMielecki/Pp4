package pl.tmielecki.ecommerce.catalog;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.*;



public class ProductCatalogTest {
    @Test
    void itListsProducts() {
        ProductCatalog catalog = createProductCatalog();

        List<Product> productList = catalog.allProducts();

        assert productList.isEmpty();

        assertThat(productList).hasSize(0);
    }

    private static ProductCatalog createProductCatalog() {
        ProductCatalog catalog = new ProductCatalog(new ArrayListProductStorage());
        return catalog;
    }

    @Test
    void itAllowsToAddProducts(){
        ProductCatalog catalog = createProductCatalog();

        catalog.addProduct("Lego set 8083", "Nice one");

        List<Product> productList = catalog.allProducts();
        assertThat(productList).hasSize(1);
    }

    @Test
    void itLoadsProductDetails(){
        ProductCatalog catalog = createProductCatalog();
        String id = catalog.addProduct("Lego set 8083", "Nice one");

        Product loadedProduct = catalog.getProductBy(id);
        assertThat(id).isEqualTo(loadedProduct.getId());
    }
    @Test
    void itAllowsToChangePrice(){
        ProductCatalog catalog = createProductCatalog();
        String id = catalog.addProduct("Lego set 8083", "Nice one");

        catalog.changePrice(id, BigDecimal.valueOf(10.10));

        Product loadedProduct = catalog.getProductBy(id);
        assertThat(BigDecimal.valueOf(10.10)).isEqualTo(loadedProduct.getPrice());

    }
}
