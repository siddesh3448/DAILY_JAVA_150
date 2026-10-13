import java.util.*;

public class Basics_ArraysList {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 10; i++) {
            list.add(in.nextInt());
        }

        System.out.println(list);

        
    }
}
