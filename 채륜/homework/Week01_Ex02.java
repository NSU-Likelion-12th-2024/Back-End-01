package homework;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Week01_Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 스캐너 생성
        String result = "";     // 정답의 문자열을 받을 String 생성
        do {
            System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은?");     // 문제들 출력
            System.out.println("1. 자바");
            System.out.println("2. 파이썬");
            System.out.println("3. C언어");
            System.out.println("4. 멋쟁이사자처럼");

            int num = in.nextInt();                         // int num을 선언 후, 입력받은 숫자로 초기화

            result = num <= 3 && num >= 1 ? "정답" : (num == 4 ? "오답" : "다시");    // 삼항 연산자로 결과값 비교
            System.out.println(result);         // 결과값을 출력
        } while (result.equals("오답") || result.equals("다시"));       // 오답 또는 다시 일때는 위 부분 반복하기

        String[] strings = new String[]{"임채륜", "만나서", "반가워요", "!!!"};
        Stream<String> stream = Stream.of(strings);
        Stream<String> stream1 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> stream2 = Arrays.stream(strings);

        System.out.println(stream1.count());
        System.out.println(stream.count());
        System.out.println(stream2.count());

    }
}
