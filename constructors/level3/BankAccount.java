
class Bank{
    public int accountNumber;
    protected String accountHolder;
    private int balance;

    public Bank(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
}

class SavingsAccount extends Bank{
    
    public SavingsAccount(int accountNumber, String accountHolder, int balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder: "+accountHolder);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank b = new Bank(123, "Mohit", 100000);
        b.display();

        b.setBalance(200000);
        System.out.println("Updated Balance: "+b.getBalance());

        System.out.println("----------------------------------------");
        SavingsAccount sa = new SavingsAccount(1234, "Ramji", 10000000);
        sa.display();
    }
}
