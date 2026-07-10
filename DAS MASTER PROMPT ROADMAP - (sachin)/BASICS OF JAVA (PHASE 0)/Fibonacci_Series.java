import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int fibo = 0;
        int fibonaci = 1;
        
        for(int i=0;i<num;i++){
            int c = fibonaci + fibo;
            fibonaci = fibo;
            fibo = c;
            System.out.print(fibonaci+" ");
        }

        sc.close();
    }
}
