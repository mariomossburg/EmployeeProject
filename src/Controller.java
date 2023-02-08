import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        ArrayList<Integer> totalDeductions = new ArrayList<>();
        double deductionSum = 0;

        Employee emp1 = new Manager("E001", "Mark", "HR", 15000.0, "Manager");
        Manager emp2 = new Manager("E0012", "Peter", "R&D", 15000.0, "Manager");
        Clerk emp3 = new Clerk("E056", "Samual", "Accounts", 10000.0, "Clerk");
        Employee emp4 = new Employee("E089", "Heather", "R", 10000.0, "Assistant");
        emp4.setBonus(0);

        emp1.display();
        lineBreak();
        emp2.display();
        lineBreak();
        emp3.display();
        //Todo: 4th employee but not printed below
//      lineBreak();
//      emp4.display();

        System.out.println("\n\n");
        Scanner sc = new Scanner(System.in);

        lineBreak();
        if (emp1.equals(emp3)) {
            System.out.println(emp1.getName() + " and " + emp3.getName() + " have the same Designations");
        } else {
            System.out.println(emp1.getName() + " and " + emp3.getName() + " have different Designations");
        }

        lineBreak();
        System.out.print("Enter the number of days Employee " + emp1.getEmployeeID() + " is Present out of 20: ");
        int empDaysPresent1 = sc.nextInt();
        System.out.print("Enter the number of days Employee " + emp2.getEmployeeID() + " is Present out of 20: ");
        int empDaysPresent2 = sc.nextInt();
        System.out.print("Enter the number of days Employee " + emp3.getEmployeeID() + " is Present out of 20: ");
        int empDaysPresent3 = sc.nextInt();
        System.out.print("Enter the number of days Employee " + emp4.getEmployeeID() + " is Present out of 20: ");
        int empDaysPresent4 = sc.nextInt();
        lineBreak();

        emp1.display2Header();
        emp1.display2(empDaysPresent1);
        emp2.display2(empDaysPresent2);
        emp3.display2(empDaysPresent3);
        emp4.display2(empDaysPresent4);

        totalDeductions.add(emp1.deductions(empDaysPresent1));
        totalDeductions.add(emp2.deductions(empDaysPresent2));
        totalDeductions.add(emp3.deductions(empDaysPresent3));
        totalDeductions.add(emp4.deductions(empDaysPresent4));


        System.out.println("EXAMPLEEEEEe");
        for (int i : totalDeductions) {
            deductionSum += i;
        }

        System.out.println("\nTotal Deductoins: " + deductionSum);

    }//end main

    public static void lineBreak() {
        System.out.println("\n============================");
    }
}//end class
