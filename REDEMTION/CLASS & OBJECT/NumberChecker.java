/* Positive Number Checker
Easy

Objective: Build a class that determines whether a number is positive, negative, or zero.
Requirements
1. Create a class named NumberChecker.
2. Declare an instance variable number of type int.
3. Create a constructor to initialize number.
4. Create a boolean method isPositive() that returns true only when the number is greater than zero.
5. Create a displayResult() method that prints whether the number is positive, negative, or zero.
6. In main(), create three objects to test 8, -4, and 0.
Filename: NumberChecker.java

*/
import java.util.Scanner;

class Checker {
    int number;

    Checker(int number) {
        this.number = number;
    }

    boolean isPositive() {
        return number > 0;
    }

    void displayResult() {
        if(number > 0){
            System.out.println(number + " is positive");
        }else if(number == 0){
            System.out.println(number + " is zero");
        }else{
            System.out.println(number+" is negative");
        }
    }
}

public class NumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();

        Checker check = new Checker(num);

        check.displayResult();
    }
}
