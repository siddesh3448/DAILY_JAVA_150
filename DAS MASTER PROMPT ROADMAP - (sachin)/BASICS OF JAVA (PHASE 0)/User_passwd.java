import java.util.Scanner;

public class User_passwd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Username : ");
        String user_name = sc.next();

        System.out.print("Password : ");
        int num = sc.nextInt();

        int passwd = 1234;

        boolean isTrue = user_name.equals("admin");

        if(isTrue){
            if(num==passwd){
                System.out.println("Login Successful");
            }else{
                System.out.println("Wrong Password");
            }
        }else{
            System.out.println("User Name is Incorrect!!!");
        }

        sc.close();
    }
}
