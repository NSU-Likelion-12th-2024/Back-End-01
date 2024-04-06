package homework;

import java.util.ArrayList;
import java.util.List;

public class Week02_EX03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        List<Integer> oddnumber = new ArrayList<>();
        for(Integer i :list) { //for each 문
            if (i % 2 == 1) {
                oddnumber.add(i);
            }
        }
        System.out.println("입력한 리스트의 홀수 값: ");
        for(Integer i:oddnumber){
            System.out.print(i);
        }
    }
}
