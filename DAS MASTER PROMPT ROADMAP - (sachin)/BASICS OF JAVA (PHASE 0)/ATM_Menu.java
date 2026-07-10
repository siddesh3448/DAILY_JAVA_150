import java.util.Scanner;

public class ATM_Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== ATM =====");

        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter Option from ATM Menu : ");
        int option = sc.nextInt();

        switch (option) {
            case 1: System.out.println("Your Balance is ₹5000");
                    break;
            case 2: System.out.println("Deposit Selected");
                    break;
            case 3: System.out.println("Withdraw Selected");
                    break;
            case 4: System.out.println("Thank You");
                    break;
        
            default: System.out.println("Invalid Choice");
                break;
        }
        sc.close();
    }
}
