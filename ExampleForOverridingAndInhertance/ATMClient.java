package ExampleForOverridingAndInhertance;

import java.util.Scanner;

public class ATMClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account type S/C");
        String accType = sc.next();
        Account  account;
        if (accType.equals("S")) {
            account= new Saving(5000);
        } else if (accType.equals("C")) {
              account = new Current(2000);
        }   
        else{
            account = new Account(1000);
        }
        account.withdraw(200);
        System.out.println("Balance "+account.getBalance());
        account.deposite(100);
        System.out.println("Balance "+account.getBalance());
    }
}
