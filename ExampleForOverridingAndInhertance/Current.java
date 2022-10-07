package ExampleForOverridingAndInhertance;

public class Current extends Account {

    public Current(double balance) {
        super(balance);
        // TODO Auto-generated constructor stub
    }

    @Override
    void deposite(int amount) {
        System.out.println("Current deposite");
        balance = balance + amount;
        // super.deposite(amount);
    }

    @Override
    void withdraw(int amount) {
        System.out.println("Current Withdraw");
        balance = balance - amount;

        // super.withdraw(amount);
    }

    void checkIntererst() {
        System.out.println("Checking Interest");
    }

}
