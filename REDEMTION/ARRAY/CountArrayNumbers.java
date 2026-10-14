/*

Task 2 — Next problem
Your next step is to practise the array concepts you've already learned before advancing to another topic.
Problem: Count Positive, Negative, and Zero Elements
Filename: CountArrayNumbers.java
Problem statement: Given an integer array, count how many elements are positive, how many are negative, and how many are equal to zero.
Example
Input: {-3, 0, 5, -1, 8, 0, 2}
Output:
- Positive elements: 3
- Negative elements: 2
- Zero elements: 2
Requirements
- Use a class and an object, following your existing practice style.
- Store the array in an instance variable and initialize it through a constructor.
- Use a method to count and display the three categories.
- Test an array containing positive numbers, negative numbers, and zeros.

*/

class NumberCounter {
    int[] array;
    int positive;
    int negative;
    int zero;

    NumberCounter(int[] array) {
        this.array = array;
    }

    int Counter() {
        positive = 0;
        negative = 0;
        zero = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zero++;
            } else if (array[i] > 0) {
                positive++;
            } else {
                negative++;
            }
        }
        return positive;
    }

    void displayResult() {
        System.out.println("Positive elements: " + positive);
        System.out.println("Negative elements: " + negative);
        System.out.println("Zero elements: " + zero);
    }
}

public class CountArrayNumbers {
    public static void main(String[] args) {
        int[] arr = { -3, 0, 5, -1, 8, 0, 2 };
        NumberCounter counter = new NumberCounter(arr);
        counter.Counter();
        counter.displayResult();
    }
}
