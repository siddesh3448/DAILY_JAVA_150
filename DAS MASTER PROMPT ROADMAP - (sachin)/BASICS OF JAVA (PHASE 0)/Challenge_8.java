import java.util.Scanner;

public class Challenge_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number = ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Zero");
        } else {
            String sign = (num > 0) ? "Positive" : "Negative";
            String nums = (num % 2 == 0) ? "Even" : "Odd";

            System.out.println(sign + " " + nums);
        }

        sc.close();
    }
}