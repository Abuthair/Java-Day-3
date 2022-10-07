package overriding;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Designation");
        String designation = sc.next();

        Employee employee;
        if (designation.equalsIgnoreCase("Manager")) {
            employee = new Manager();
            employee.calcBonus(1000);
        } else if (designation.equalsIgnoreCase("Progammer")) {
            employee = new Progammer();
            employee.calcBonus(1000);

        } else {

            employee = new Employee();
            employee.calcBonus(1000);

        }

    }
}
