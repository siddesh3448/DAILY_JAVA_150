/* Problem 3 — Square Number Calculator

Difficulty: Easy

Objective: Practise classes, objects, constructors, instance variables, methods, and return values.

Requirements

Create a class named SquareCalculator.
Declare an instance variable number of type int.
Create a constructor that accepts an integer and initializes the instance variable.
Create a method calculateSquare() that calculates and returns the square of the number.
Create a method displayResult() that prints the original number and its square.
In the main() method, create three objects with the values 5, -4, and 0.
Call displayResult() for each object.

*/

import java.util.Scanner;

class SquareCalculator {
    int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    int calculateSquare() {
        return number * number;
    }

    void displayResult(){
        System.out.println("Square of "+ number + " = " + calculateSquare());
    }
}

public class SquareFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        SquareCalculator square = new SquareCalculator(num);

        square.displayResult();
        input.close();
    }
}
