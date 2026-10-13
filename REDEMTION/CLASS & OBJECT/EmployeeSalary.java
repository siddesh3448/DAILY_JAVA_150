/*

 * Easy
 * Filename: EmployeeSalary.java
 * Create a class named Employee with the following requirements:
 * 1. Fields: name (String) and basicSalary (double).
 * 2. Constructor to initialize both fields.
 * 3. Method calculateBonus() that returns 10% of the basic salary.
 * 4. Method displayDetails() that prints the employee's name, basic salary, and
 * bonus.
 * 5. In main(), create two employee objects:
 * - Rahul, salary ₹30,000
 * - Priya, salary ₹40,000
 * Expected bonus values: Rahul — 3000.0; Priya — 4000.0.

*/

import java.util.Scanner;

class Employee {
    String name;
    double salary;
    int percentage;
    double result;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double calculateBonus() {
        result = (percentage / 100.0) * salary;
        return result;
    }

    void displayDetails(){
        System.out.println(name + "," + salary + " ");
        System.out.println("Expected Bonus Values:"+name+" - " + calculateBonus());
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first Emp Name : ");
        String emp1 = sc.nextLine();

        System.out.print("Enter your second Emp Name : ");
        String emp2 = sc.nextLine();

        System.out.print("Enter "+emp1+"salary : ");
        int salary1 = sc.nextInt();

        System.out.print("Enter "+emp2+"salary : ");
        int salary2 = sc.nextInt();

        System.out.print("Enter Percentage of basic salary : ");
        int bonusPercentage = sc.nextInt();

        Employee employee1 = new Employee(emp1, salary1);
        Employee employee2 = new Employee(emp2, salary2);

        employee1.percentage = bonusPercentage;
        employee2.percentage = bonusPercentage;

        employee1.displayDetails();
        System.out.println();
        employee2.displayDetails();

        sc.close();

    }
}