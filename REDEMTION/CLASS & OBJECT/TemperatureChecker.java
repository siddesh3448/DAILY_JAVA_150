/* 
Problem 2 — Temperature Checker
Easy
Filename: TemperatureChecker.java
Create a class named Temperature:
1. Field: celsius (double).
2. Constructor to initialize the temperature.
3. Boolean method isFreezing() that returns true if the temperature is at or below 0°C, otherwise false.
4. Method displayResult() that prints the temperature and whether it is freezing.
5. Create three objects for -5, 0, and 12.
Expected results: -5 → true, 0 → true, 12 → false.

*/

import java.util.Scanner;

class Temperature {
    double celsius;

    Temperature(double celsius){
        this.celsius = celsius;
    }

    boolean isFreezing(){
        return celsius <= 0;
    }

    void displayResult(){
        System.out.println(celsius + " "+ " "+ isFreezing());
    }
}

public class TemperatureChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        double temperature = sc.nextInt();

        Temperature temp = new Temperature(temperature);

        temp.displayResult();
        
        sc.close();
    }
}
