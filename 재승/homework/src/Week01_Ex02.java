import java.util.Scanner;

public class Week01_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer;
        String Answer;
       do {
           System.out.println("-다음 중 프로그래밍 언어가 아닌 것은? (번호로 쓰시오) \n"
                   + "1. 자바 \n"
                   + "2. 파이썬 \n"
                   + "3. C언어 \n"
                   + "4. 멋쟁이사자처럼 \n");
           answer = sc.nextInt();
           Answer = answer == 4 ? "정답": (answer > 4 || answer <=0 ? "다시":"오답");

           System.out.println(Answer);
       }
       while (!Answer.equals("정답"));




             }
    }


