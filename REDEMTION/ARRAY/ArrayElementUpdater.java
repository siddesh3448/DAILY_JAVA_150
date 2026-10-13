/*
Problem 3: Update an Array Element
Easy

Filename: ArrayElementUpdater.java
Problem statement
Create a Java program using classes and objects that updates an element at a specified index in an integer array.
Requirements
1. Create a class named ArrayUpdater.
2. Declare an integer array as an instance field.
3. Create a constructor that accepts and initializes the array.
4. Create a void method named updateElement(int index, int newValue) that replaces the element at the specified index with the new value.
5. Create another void method named displayArray() that prints all elements using a for loop.
6. In main(), create an array containing 10, 20, 30, 40, 50.
7. Create an object, update the element at index 2 to 99, and display the updated array.
Expected output
10
20
99
40
50


Constraints
- Use a constructor and an object.
- Update the array through a method.
- Do not manually print each element.
- For this exercise, assume the supplied index is valid.
*/

import java.util.Scanner;

class ArrayUpdater {
    int[] arr;
    int index;
    int newValue;

    ArrayUpdater(int[] arr) {
        this.arr = arr;
    }

    void updateElement(int index, int newValue) {
        arr[index] = newValue;
    }

    void displayArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}

public class ArrayElementUpdater {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = { 10, 20, 30, 40, 50 };

        System.out.print("Enter index number : ");
        int indx = sc.nextInt();

        System.out.print("Enter the value you want to update : ");
        int newvalue = sc.nextInt();

        ArrayUpdater obj = new ArrayUpdater(array);

        obj.updateElement(indx, newvalue);

        obj.displayArray();

        sc.close();
    }
}
