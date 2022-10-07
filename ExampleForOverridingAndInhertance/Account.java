package ExampleForOverridingAndInhertance;


public class Account {
    double balance;
 
    public Account(double balance){
        super();
        this.balance = balance;
    }

    void withdraw(int amount){
        System.out.println("Withdrawing  " +amount);
        balance-=amount;
    }
    void deposite(int amount){
        System.out.println("depositing " +amount);
        balance +=amount;
    
    }
    double getBalance(){
        return balance;
    }

}
