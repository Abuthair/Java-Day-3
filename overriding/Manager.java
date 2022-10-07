package overriding;

public class Manager  extends Employee {
    @Override
    void calcBonus(int a) {
        // TODO Auto-generated method stub
     System.out.println("Bonus for Manager" +a*2);
    }
}
