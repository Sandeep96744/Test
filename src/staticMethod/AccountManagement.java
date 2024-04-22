package staticMethod;

public class AccountManagement {

    public static void main(String[] args) {

        // Create few accounts
        Account a1 = new Account(11223344, "Ram", 10000.0);
        Account a2 = new Account(11223377, "Shyam", 50000.0);


        // Display the no. of accounts created
        Account.totalAccountHolder();

        // Do the basic operations(deposit/withdraw)
        a1.deposit(3000.0);
        a1.withdraw(15000.0);
        
    }

}
