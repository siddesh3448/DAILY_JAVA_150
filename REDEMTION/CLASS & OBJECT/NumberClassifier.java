/*
Problem 5 — Number Classifier
Medium
Filename: NumberClassifier.java
Create a class named NumberClassifier:
1. Field: number (int).
2. Constructor to initialize the field.
3. Boolean method isPositive() that returns true only if the number is greater than zero.
4. Method displayResult() that prints whether the number is positive, negative, or zero.
5. Create objects for 8, -4, and 0.
Expected classifications: Positive, Negative, Zero.
Recall focus: A boolean method returns only true or false, while displayResult() handles the three output cases.
*/

import java.util.Scanner;

class Number {
    int number;

    Number(int number){
        this.number = number;
    }

    boolean isPositive(){
        if(number > 0 ){
            return true;
        }
        return false;
    }

    void display(){
        if(isPositive()){
            System.out.println("Positive Number");
        }else if(number == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negative");
        }
    }
}

public class NumberClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        Number nums = new Number(num);

        nums.display();
    }
}
