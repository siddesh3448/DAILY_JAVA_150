import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int og = num;

        int original = num;

        int count = 0;

        while (num>0) {
            count++;
            num /= 10;
        }

        int arm = 0;

        while(og>0){
            int ld = og%10;
            int sum = (int)Math.pow(ld, count);
            arm += sum;
            og /= 10;

        }

        if(arm == original) System.out.println("Armstrong Number");
        else System.out.println("Not an Armstrong Number");


        sc.close();
    }
}
