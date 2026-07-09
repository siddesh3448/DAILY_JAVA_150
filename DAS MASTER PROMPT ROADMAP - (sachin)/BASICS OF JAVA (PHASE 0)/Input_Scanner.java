import java.util.Scanner;

public class Input_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello "+name);
        System.out.print("Your age is "+age);

        sc.close();
    }
}
