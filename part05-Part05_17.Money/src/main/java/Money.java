
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        Money newMoney = new Money (addition.euros + this.euros, addition.cents + this.cents());
        
        return newMoney;
    }
    
    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;
        
       
        
        if (euros < 0) {
            return new Money(0, 0);
        }
        
        if (cents < 0) {
            cents = this.cents + 100 - decreaser.cents;
            euros = this.euros - 1 - decreaser.euros;
            return new Money(euros, cents);
        }
        
        return new Money(euros, cents);
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }
        
        if (this.cents < compared.cents && this.euros == compared.euros) {
            return true;
        }
        
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
