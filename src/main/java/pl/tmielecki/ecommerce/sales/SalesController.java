package pl.tmielecki.ecommerce.sales;

import org.springframework.web.bind.annotation.*;

public class SalesController {

    SalesFacade sales;

    public SalesController(SalesFacade sales) {

        this.sales = sales;
    }

    @PostMapping("/api/add-product/{productId}")
    void addProduct(@PathVariable String productId){
        String customerId = getCurrentCustomer();
        sales.addProductToCart(customerId, productId);
    }

    @PostMapping("/api/accept-offer")
    ReservationDetails acceptOffer(@RequestBody AcceptOfferRequest request) {
        String customerId = getCurrentCustomer();
        return sales.acceptOffer(customerId);
    }

    @GetMapping("/api/current-offer")
    Offer getCurrentOffer() {
        String customerId = getCurrentCustomer();
        return sales.getCurrentOffer(customerId);
    }

    private String getCurrentCustomer() {
        return "guest";
    }
}
