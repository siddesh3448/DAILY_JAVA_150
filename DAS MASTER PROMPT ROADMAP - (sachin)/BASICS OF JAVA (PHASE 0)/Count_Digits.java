import java.util.Scanner;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        while (num>0) {
            count++;
            num /= 10;
        }
        
        System.out.println("Total Digits = "+count);
        sc.close();
    }
}
