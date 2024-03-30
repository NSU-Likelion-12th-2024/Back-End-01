
package homework;
import java.util.Scanner;
public class Week01_EX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result;
        do {
            System.out.println("Q. 다음 중 프로그래밍 언어가 아닌 것은?");
            System.out.println("1. 자바");
            System.out.println("2. 파이썬");
            System.out.println("3. c언어");
            System.out.println("4. 멋쟁이사자처럼");
            String answer = sc.nextLine();
            result = answer.equals("4") ? "정답" : (!answer.equals("1") && !answer.equals("2") && !answer.equals("3") ? "다시" : "오답");
            System.out.println(result);
        } while(!result.equals("정답"));

        sc.close();
    }
}

