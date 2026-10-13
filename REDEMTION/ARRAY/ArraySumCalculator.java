/*
Problem 4: Calculate the Sum
Easy

Filename: ArraySumCalculator.java
Problem statement
Create a Java program that calculates the sum of all elements in an integer array using classes, objects, and methods.
Requirements
1. Create a class named ArrayCalculator.
2. Declare an integer array as an instance field.
3. Initialize the array through a constructor.
4. Create an int method named calculateSum() that traverses the array, calculates the total, and returns it.
5. Create a void method named displayResult() that prints the sum by calling calculateSum().
6. In main(), create an array containing 10, 20, 30, 40, 50.
7. Create an object and call displayResult().
Expected output
Sum of array elements = 150


Constraints
- Use a for loop.
- Do not calculate the sum manually.
- Use return to send the result back.
- Do not use static methods for the array operations.
*/

class ArrayCalculator {
    int[] array;

    ArrayCalculator(int[] array) {
        this.array = array;
    }

    int calculateSum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    void displayResult() {
        System.out.println("Sum of Array --> " + calculateSum());
    }
}

public class ArraySumCalculator {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        ArrayCalculator obj = new ArrayCalculator(arr);

        obj.displayResult();
        obj.displayResult();
    }
}
