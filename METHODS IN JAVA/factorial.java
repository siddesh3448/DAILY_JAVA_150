import java.util.Scanner;

public class factorial {
    static void factp(int num){
        if(num==0) {
            System.out.println("1");
            return;
        }
        int factorial = 1;
        for(int i=num;i>=1;i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int f = sc.nextInt();

        System.out.println("~~ START ~~");

        factp(f);

        System.out.println("~~ END ~~");

        sc.close();
    }
}
