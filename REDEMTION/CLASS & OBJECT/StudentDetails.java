/*
    Problem 1 — Student Details
Create a Student class
Easy

Objective: Practise classes, objects, fields, and methods.
Requirements:
1. Create a class named Student.
2. Declare three fields: name (String), rollNo (int), and marks (double).
3. Create a method displayDetails() that prints all three fields.
4. In main(), create two Student objects with different details.
5. Call displayDetails() for both objects.
Expected output format:
Name: Rahul
Roll No: 101
Marks: 85.5

Name: Priya
Roll No: 102
Marks: 91.0


Filename: Student.java
*/

class Student {
    String name; int rollNo; double marks;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Student st1 = new Student("Rahul", 101, 85.5);
        
        Student st2 = new Student("Priya", 102, 91.0);

        st1.displayDetails();
        System.out.println();
        st2.displayDetails();
    }
}
