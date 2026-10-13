/*

Problem 4 — Find the Larger Number
Easy
Filename: MaximumFinder.java
Create a class named Maximum:
1. Fields: num1 and num2 (int).
2. Constructor to initialize both numbers.
3. Method findMaximum() that returns the larger number.
4. Method displayResult() that prints both inputs and the maximum.
5. Create objects for (10, 20), (35, 12), and (7, 7).
Expected maximums: 20, 35, and 7.

*/

import java.util.Scanner;

class Maximum{
    int num1;
    int num2;

    Maximum(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    int findMaximum(){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }

    void displayResult(){
        if(num1 == num2){
            System.out.println("Both numbers are Equal");
            return;
        }
        System.out.println("Largest number --> "+ findMaximum());
    }
}

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter your secound number : ");
        int num2 = sc.nextInt();

        Maximum max = new Maximum(num1, num2);

        max.displayResult();

        sc.close();

    }
}
