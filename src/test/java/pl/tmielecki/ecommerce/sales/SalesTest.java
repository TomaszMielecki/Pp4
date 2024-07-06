package pl.tmielecki.ecommerce.sales;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class SalesTest {

    @Test
    void itShowsCurrentOffer() {
        //ARRANGE
        SalesFacade sales = thereIsSalesFacade();
        String customerId = thereIsCustomer("Tomek");
        //ACT
        Offer offer = sales.getCurrentOffer(customerId);
        //Assert
        assertThat(offer.getTotal()).isEqualTo(BigDecimal.valueOf(0));
        assertThat(offer.getItemsCount()).isEqualTo(0);
    }

    private String thereIsCustomer(String name) {
        return name;
    }

    private SalesFacade thereIsSalesFacade() {
        return new SalesFacade();
    }

    @Test
    void itAllowsToAddProductToCart(){
    SalesFacade sales = thereIsSalesFacade();
    String customerId = thereIsCustomer("tomasz");
    String productId = thereIsProduct("x", BigDecimal.valueOf(10.10));

    sales.addProductToCart(customerId, productId);

    Offer offer = sales.getCurrentOffer(customerId);

    assertThat(offer.getTotal()).isEqualTo(BigDecimal.valueOf(10.10));
    assertThat(offer.getItemsCount()).isEqualTo(1);
    }

    private String thereIsProduct(String name, BigDecimal price) {
        return null;
    }

    @Test
    void itAllowsToRemoveProductFromCart(){

    }

    @Test
    void itAllowsToShowActualOffer(){

    }
}
