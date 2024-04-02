import java.util.Scanner;
public class week01_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 4;
        int inputInt;  //정수를 저장할 변수 선언
        do {
            System.out.printf("Q. 다음 중 프로그래밍 언어가 아닌 것은?");
            System.out.printf(" 1. 자바");
            System.out.printf(" 2. 파이썬");
            System.out.printf(" 3. c 언어");
            System.out.printf(" 4. 멋쟁이사자처럼");

            inputInt = sc.nextInt();

            if (inputInt == answer) {
                System.out.println("정답");
            } else {
                System.out.println("오답");
            }
        } while (inputInt != answer);
    }
}
