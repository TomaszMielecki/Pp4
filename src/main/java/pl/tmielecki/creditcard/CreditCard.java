package pl.tmielecki.creditcard;

//import java.org.junit.jupiter;
import java.math.BigDecimal;

public class CreditCard {

    private BigDecimal balance;

    public void assignCreditLimit(BigDecimal creditLimit) {
      // if (BigDecimal.valueOf(100).compareTo(creditLimit) > 0){
        //throw new CreditCantBeReassignException();
      }

   // }

    public BigDecimal getBalance() {
        return BigDecimal.valueOf(1000);
    }

    //public void pay(BigDecimal money){
       //if (this.balance.substract(money).compareTo(BigDecimal.ZERO) < 0){
      //     throw  new InsufficientFoundsException();
     //  }
       // this.balance = this.balance.substract(money);
   // }

}
