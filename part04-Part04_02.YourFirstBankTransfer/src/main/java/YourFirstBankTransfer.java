
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account matthews = new Account("Matthews account", 1000.0);
        Account mine = new Account("My account", 0.0);
        matthews.withdrawal(100.0);
        mine.deposit(100.0);
        System.out.println(matthews.toString());
        System.out.println(mine.toString());
    }
}
