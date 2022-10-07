package overriding;

public class Progammer  extends Employee{
    
    @Override
    void calcBonus(int a) {
     System.out.println("Bonus of programer"+a*3);
    }
}
