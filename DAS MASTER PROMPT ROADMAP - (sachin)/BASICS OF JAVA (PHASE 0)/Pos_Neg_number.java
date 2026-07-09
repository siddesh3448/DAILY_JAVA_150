import java.util.Scanner;

public class Pos_Neg_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number = ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Positive Number");
        }

        sc.close();
    }
}
