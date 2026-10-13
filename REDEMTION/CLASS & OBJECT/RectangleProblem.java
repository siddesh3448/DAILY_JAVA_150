/*  Problem 2 — Rectangle Calculator
Create a Rectangle class
Easy

Objective: Practise objects, fields, methods, parameters, and return values.
Requirements:
1. Create a class named Rectangle.
2. Declare length and width as double fields.
3. Create a method calculateArea() that returns the area.
4. Create a method calculatePerimeter() that returns the perimeter.
5. Create a rectangle object with length 10 and width 5.
6. Print both returned values from main().

Expected output:
Area: 50.0
Perimeter: 30.0
Filename: Rectangle.java  */

class Rectangle {
    double length;
    double width;
    double Area;
    double Perimeter;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        Area = length * width;
        return Area;
    }

    double calculatePerimeter() {
        Perimeter = 2 * (length + width);
        return Perimeter;
    }
}

public class RectangleProblem {
    public static void main(String[] args) {
        
        Rectangle area = new Rectangle(10, 5);

        System.out.println("Area ==> " + area.calculateArea());
        System.out.println("Perimeter ==> " + area.calculatePerimeter());
    }
}
