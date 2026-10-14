/* 
DSA Day 2 — Question 2
Problem: Count Even and Odd Elements
Filename: CountEvenOdd.java
Problem statement
Given an integer array, count how many elements are even and how many are odd. Display both counts.
Example
Input: {12, 7, 4, 9, 0, -3, -8}
Output:
- Even elements: 4
- Odd elements: 3
Requirements
1. Create a class to store the array.
2. Initialize the array through a constructor.
3. Create a method to count even and odd elements.
4. Create a method to display the results.
5. Test with positive numbers, negative numbers, and zero.
Important: Zero is even because 0 % 2 == 0.
*/

class OddEvenCounter {
    int[] array;
    int even;
    int odd;

    OddEvenCounter(int[] array) {
        this.array = array;
    }

    void countEvenOdd() {
        even = 0;
        odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
    }

    void displayResult() {
        System.out.println("Even elements : " + even);
        System.out.println("Odd elements : " + odd);
    }
}

public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = { 0, -2, -4, 7, 9 };
        OddEvenCounter call = new OddEvenCounter(arr);

        call.countEvenOdd();
        call.displayResult();
    }
}
