import java.util.Scanner;

public class Vote_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you Age = ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");
        }

        sc.close();
    }
}
