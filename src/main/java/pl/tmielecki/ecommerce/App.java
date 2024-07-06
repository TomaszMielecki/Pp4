package pl.tmielecki.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.tmielecki.ecommerce.catalog.ArrayListProductStorage;
import pl.tmielecki.ecommerce.catalog.Product;
import pl.tmielecki.ecommerce.catalog.ProductCatalog;
import pl.tmielecki.ecommerce.sales.SalesFacade;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        System.out.println("Here we go!!");
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog createMyCatalog(){
        var catalog = new ProductCatalog( new ArrayListProductStorage());
        catalog.addProduct("Lego set 8083", "Nice one");

        catalog.addProduct("Cobi set 8083", "Nice one");

        return catalog;
    }

    @Bean
    SalesFacade createSalesFacade(){
        return new SalesFacade();
    }
}
