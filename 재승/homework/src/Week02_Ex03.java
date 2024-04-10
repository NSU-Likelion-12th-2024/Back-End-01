import java.util.ArrayList;
import java.util.List;

public class Week02_Ex03 {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        number.add(5);
        number.add(6);
        number.add(7);
        number.add(8);
        number.add(9);

        System.out.println("입력한 리스트의 홀수값: ");
        for (int i = 0; i <= 4; i++) {
            if (number.get(i) % 2 == 1) {
                System.out.print(number.get(i)+"");
            }
        }
    }
}


