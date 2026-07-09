public class Logical_Operators {
    public static void main(String[] args) {
        int age = 22;
        int marks = 78;

        System.out.println("Eligible for Vote: "+(age >= 18));
        System.out.println("Passed Student: "+(marks>=35));
        System.out.println("Placement Eligible: "+(age >= 18 && marks >= 60));
        System.out.println("Not Passed: "+(!(marks >= 35)));
    }
}
