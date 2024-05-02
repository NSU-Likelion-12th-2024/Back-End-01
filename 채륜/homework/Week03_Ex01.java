package homework;

import java.util.ArrayList;
import java.util.List;

public class Week03_Ex01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        for (Integer integer : list) {
            if (integer % 2 == 1) {
                System.out.print(integer + " ");
            }
        }

    }
}
