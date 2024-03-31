import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 입력을 받기위한 스캐너 생성
        System.out.println("숫자를 입력하세요: "); // 입력을 받을 질문을 출력
        int user; // 정수형 변수를 선언하였다.

        user = sc.nextInt();  // 입력받은 정수를 user로 대입한다.

        for (int i = 1; i<=9; i++) { //정수는 1보다 크고 9이하이다.
            System.out.printf( "%d * %d = %d \n", user, i, user*i); // printf 이기떄문네 정수가들어갈 %d를 사용하여 수식을 만들었고, 첫번쨰 %d에들어갈
            // 입력받은 정수 유저라고하고, 두번째 %d는 i 라고하며, 최종결과는 user과 1를 곱한것이다.
        }
    }
}
