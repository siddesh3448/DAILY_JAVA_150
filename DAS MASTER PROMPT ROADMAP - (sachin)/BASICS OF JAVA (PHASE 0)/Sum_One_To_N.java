import java.util.Scanner;

public class Sum_One_To_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Nth term : ");
        int n = sc.nextInt();


        int sum = 0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print("N natural Sum = "+sum);
        sc.close();
    }
}
