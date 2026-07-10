import java.util.Scanner;

public class Switch_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1 = ");
        int num1 = sc.nextInt();

        System.out.print("Enter num2 = ");
        int num2 = sc.nextInt();

        System.out.print("Enter Operator (+,-,*,/,%) = ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+': System.out.println("Addition = "+(num1+num2));
                      break;
            case '-': System.out.println("Subtraction = "+(num1-num2));
                      break;
            case '*': System.out.println("Multiplication = "+(num1*num2));
                      break;
            case '/': System.out.println("Division = "+(num1/num2));
                      break;
            case '%': System.out.println("Modulus = "+(num1%num2));
                      break;
        
            default: System.out.println("Invalid Input");
                break;
        }

        sc.close();

    }
}
