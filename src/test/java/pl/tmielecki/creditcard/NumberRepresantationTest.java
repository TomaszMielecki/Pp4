package pl.tmielecki.creditcard;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class NumberRepresantationTest {

    @Test
    void testDouble(){
        double a = 0.03;
        double b = 0.02;

        System.out.println("Double:");
        System.out.println(a-b);
    }

    @Test
    void testFloat(){
        float a = 0.03f;
        float b = 0.02f;

        System.out.println("Float:");
        System.out.println(a-b);
    }

    @Test
    void testBigDecimal(){
        int a = 1000;
        int b = 12;

        System.out.println("Double:");
        System.out.println(a-b);
    }

}
