import java.util.*;
public class sum_of_two {

    static void sumoftwo(int x,int y){
        System.out.println("Sum of two: "+(x+y));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.print("Enter Y: ");
        int y = sc.nextInt();
        
        System.out.println("~~ START ~~");

        sumoftwo(x,y);

        System.out.println("~~ END ~~");

        sc.close();
         
    }
}
