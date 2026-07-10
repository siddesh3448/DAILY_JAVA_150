import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int og = num;

        int rev = 0;

        while(num>0){
            int ld = num % 10;
            rev = rev * 10 + ld;
            num /= 10;
        }
        if(rev == og) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        sc.close();
    }
    
}
