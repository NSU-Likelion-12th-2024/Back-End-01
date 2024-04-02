package homework;

import java.util.Scanner;

public class Week01_Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 스캐너 생성
        System.out.print("숫자: ");       // 숫자를 입력해달라고 하는 출력문 생성
        int num = in.nextInt();         // int num을 선언 후, 사용자에게 입력받은 값으로 초기화
        System.out.printf("===== %d단 =====", num);  // 입력받은 숫자의 단을 출력
        for (int i = 1; i <= 9; i++){                   // 입력받은숫자 와 1부터 9까지 곱한 값들을 반복문으로 출력
            System.out.printf("\n%d * %d = %d", num, i, num*i);
        }
    }
}
