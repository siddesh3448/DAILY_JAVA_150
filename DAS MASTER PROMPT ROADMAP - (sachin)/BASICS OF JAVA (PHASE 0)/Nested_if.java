import java.util.Scanner;

public class Nested_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age = ");
        int age = sc.nextInt();

        System.out.print("Are you Indian? (yes/no): ");
        String ans = sc.next();

        boolean hasLicense = ans.equalsIgnoreCase("yes");

        if(age >= 18){
            if(hasLicense){
                System.out.println("Eligible to Drive");
            }else{
                System.out.println("Not Eligible to Drive (Lincense need Indian citizenship)");
            }
        }else{
            System.out.println("You are Minor");
        }
        sc.close();
    }
}
