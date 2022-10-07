package ExampleForOverridingAndInhertance;

public class Saving  extends Account {

    public Saving(double balance) {
        super(balance);
        //TODO Auto-generated constructor stub
    }

@Override
void withdraw(int amount) {
   System.out.println("Saving Withdraw");
   balance = balance - amount ;
 }
    @Override
    void deposite(int amount) {
        System.out.println("Saving Deposite");
        balance = balance + amount ;
    }
}
