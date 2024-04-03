/*
import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자 : ");
        int num = scanner.nextInt();

        for(int i = 1;i<=9;i++) {
            System.out.println(num+"*"+i+"="+(num * i));
        }
        System.out.println();
    }
}

 */

import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int my = 0;
        int answer = 4;
        String result = "";
        do{
            System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은?");
            System.out.println("1. 자바");
            System.out.println("2. 파이썬");
            System.out.println("3. C언어");
            System.out.println("4. 멋쟁이사자처럼");
            System.out.println("정답:");

            my = scanner.nextInt();
            result = my == answer ? "정답" : my < 4 ? "오답" : "다시";
            System.out.println(result);
        }while (my!=answer);
    }
}
