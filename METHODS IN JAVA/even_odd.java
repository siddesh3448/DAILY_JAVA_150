import java.util.Scanner;

public class even_odd {
    static void evenodd(int num){
        if(num%2==0)    System.out.println(num+" is Even");
        else    System.out.println(num+" is Odd");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("~~ START ~~");

        evenodd(n);

        System.out.println("~~ END ~~");

        sc.close();
    }
}
