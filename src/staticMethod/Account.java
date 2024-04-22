package staticMethod;

public class Account {
    private long accountNo;
    private String customerName;
    private double balance;
    static int cnt = 0;

    public Account(long accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
        cnt = cnt + 1;
    }


    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount Deposited Successfully!\nAvailable Balance: " + this.balance);
    }

    public void withdraw(double amount){
        if(this.balance >= amount)
            this.balance -= amount;
        else
            System.out.println("Insufficient Balance!\nAvailable Balance: " + this.balance);
    }

    public void showAccountInfo(){
        System.out.println("------------------------\nAccount Details\n------------------------");
        System.out.println("Account No.: " + this.accountNo);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Available Balance: " + this.balance);
        System.out.println("------------------------");
    }

    public static void totalAccountHolder() {
        System.out.println("Total Account Holders: " + cnt);
    }
}

