import java.util.Scanner;

//  Program to Simulate an ATM

public class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;
    int Currentbalance;
    
    public static int action(int a,int balance,int amount) {
        int cuebl=balance;
        if(a==1){
            cuebl+=amount;
        }
        if(a==2){
            if(balance<amount){
                System.out.println("Insufficent Balance");
            }
            else{
                cuebl-=amount;
            }
        }
        return cuebl;
    }
    void display(){
        System.out.println("-------------------------------");
        System.out.println("Account no.: "+accountNumber);
        System.out.println("Account holer name: "+accountHolder);
        System.out.println("previous balance: "+balance);
        System.out.println("Current balance: "+Currentbalance);

    }
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        b.accountHolder=sc.nextLine();
        System.out.print("Enter your account no.: ");
        b.accountNumber = sc.nextInt();
        System.out.print("Enter account balance: ");
        int bal=b.balance=sc.nextInt();
        System.out.println("Enter action:");
        System.out.println("1 for deposit money");
        System.out.println("2 for withdraw money");
        int a=sc.nextInt();
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        b.Currentbalance=action(a,bal,amount);
        
        b.display();
    }
}
