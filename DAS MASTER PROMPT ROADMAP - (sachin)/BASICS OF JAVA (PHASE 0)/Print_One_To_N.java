import java.util.Scanner;

public class Print_One_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Your Nth term : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
        sc.close();
    }
}
