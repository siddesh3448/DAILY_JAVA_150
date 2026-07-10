import java.util.Scanner;

public class Challenge_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks are at least 35: (Y/N) = ");
        String responce = sc.next();

        int marks = 0;

        boolean isResponce = responce.equalsIgnoreCase("Y");

        if(isResponce){
            System.out.print("Enter Your Marks = ");
            if((marks = sc.nextInt()) >= 90){
                System.out.println("Distinction");
            }else if(marks >= 75){
                System.out.println("First Class");
            }else if(marks >= 65){
                System.out.println("Second Class");
            }else{
                System.out.println("Pass");
            }
        }else{
            System.out.println("Fail");
        }
        sc.close();
    }
}
