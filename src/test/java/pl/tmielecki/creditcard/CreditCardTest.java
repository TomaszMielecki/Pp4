package pl.tmielecki.creditcard;

import org.junit.jupiter.api.Test;

import javax.naming.InsufficientResourcesException;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;



public class CreditCardTest {
    @Test
    void itAllowsToAssignCredit() {

        CreditCard card = new CreditCard();

        card.assignCreditLimit(BigDecimal.valueOf(1000));

        assert BigDecimal.valueOf(1000).equals(card.getBalance());
        assertEquals(
                BigDecimal.valueOf(1000),
                card.getBalance(),
                "Current balance not matcched "
        );
    }



    void itDenyCreditBelowThreshold() {
        CreditCard card = new CreditCard();

    }

    void itDenyCreditReassignment(){
        CreditCard card = new CreditCard();
        //card.assignCreditlimit(BigDecimal.valueOf(1000));

    }

    @Test
    void payForSomething(){
        CreditCard card = new CreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000));
 //       card.pay(BigDecimal.valueOf(100));

        assertEquals(
                BigDecimal.valueOf(900),
                card.getBalance()
        );
    }

    @Test
    void itDenyPaymentWhenNotEnoughMoney(){
        CreditCard card = new CreditCard();
        card.assignCreditLimit(BigDecimal.valueOf(1000));
   //     card.pay(BigDecimal.valueOf(900));

   //     assertThrows(
 //               InsufficientFoundException.class,
  //              () -> card.pay(BigDecimal.valueOf(200))
      //  );
    }
}
