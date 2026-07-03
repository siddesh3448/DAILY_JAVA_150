import java.util.*;
public class multi_of_two {

    static void multioftwo(int x,int y){
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = input.nextInt();
        
        System.out.print("Enter Y: ");
        int y = input.nextInt();

        System.out.println("~~ START ~~");

        multioftwo(x,y);

        System.out.print("~~ END ~~");

        input.close();
        
    }
}
