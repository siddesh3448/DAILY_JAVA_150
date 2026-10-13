import java.util.*;

public class Array_list_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);

        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        for(int i=0; i<3;i++){
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        
        for (ArrayList<Integer> row : list) {
            System.out.println(row);
        }

    }
}
