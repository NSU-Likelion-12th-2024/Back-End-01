import java.util.ArrayList;
import java.util.List;

public class Week03_Ex01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();  //리스트 타입은 Int이고 이름을 numbers로 지정
        numbers.add(5);     //각각 인덱스에 값을 넣음
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        List<Integer> result = new ArrayList<>();  //출력하고자 하는 리스트 생성
        for (int num : numbers) { //numbers 리스트의 요소를 반복하고자 함
            if (num % 2 != 0) {  //상수가 짝수가 아니면 결과값을 result에 넣음
                result.add(num);
            }
        }

        System.out.println("입력한 리스트의 홀수 값: ");
        for (int i = 0; i < result.size(); i++) {  //초기값이 0이고 i의 크기가 result의 사이즈보다 작으면 +1을 함
            System.out.println(result.get(i));
        }
    }
}
