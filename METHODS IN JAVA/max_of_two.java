import java.util.Scanner;

public class max_of_two {
    static void maxoftwo(int num1, int num2){
        if(num1>num2)     System.out.println(num1+" is greater");
        else    System.out.println(num2+" is greater");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();

        System.out.println("~~ START ~~");

        maxoftwo(num1,num2);

        System.out.println("~~ END ~~");

        sc.close();
    }
}
