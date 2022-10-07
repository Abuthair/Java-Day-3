import java.util.Scanner;
import java.util.*;

enum Fruits {
    APPLE, MANGO, ORANGE
}

public class EnumDemo {

    public static void main(String[] args) {

        // convert enum into array
        Fruits[] fruits = Fruits.values();
        for (Fruits fruits2 : fruits) {
            System.out.println(fruits2);
        }
    }

    Scanner sc = new Scanner(System.in);
    String choice = sc.next();

    Fruits fruit = Fruits.valueOf(choice);

    switch (fruit) {
        case APPLE:
            System.out.println("This is apple ");
            break;

            case MANGO:
            System.out.println("This is apple ");
            break;
          
          
        default:
         System.out.println("none is true");
            break;
    }
}
