import java.util.Scanner;

public class sqrt_of_number {
    static void sqrts(int num){
        int sqrt = num * num;
        System.out.println("Square of "+num+" = "+sqrt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        System.out.println("~~ START ~~");

        sqrts(n);

        System.out.println("~~ END ~~");

        sc.close();
        
    }
}
