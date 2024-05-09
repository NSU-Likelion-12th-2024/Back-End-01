package homework;

import java.util.Scanner;


interface Caculateor {
    int add(int a, int b);

    int subtract(int a, int b);

    void for_gugu(int a);

}

class CauculatorSet implements Caculateor {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public void for_gugu(int a) {
        for (int i = 1; i <= 9; i++) {
            int result = a * i;
            System.out.println(a+" x "+i+" = "+ result);
        }

    }
}

public class Mentoring05_EX01 {
    public static void main(String[] args) {
        CauculatorSet cauculatorSet = new CauculatorSet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴 : 1.덧셈 2.뺄셈");
        System.out.printf("메뉴 선택: ");
        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.printf("두 수 입력: "); //스캐너 입력을 옆에 바로 하기 위해서 printf 사용
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int add = cauculatorSet.add(num1, num2);
            System.out.println("결과값: " + add);
            cauculatorSet.for_gugu(add); //CauculatorSet의 인스턴스인 cauculatorSet의 for_gugu에 add를 넣음

        } else if (menu == 2) {
            System.out.printf("두 수 입력: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int subtract = cauculatorSet.subtract(num1, num2);
            System.out.println("결과값: " + +subtract);
            cauculatorSet.for_gugu(subtract); //CauculatorSet의 인스턴스인 cauculatorSet의 for_gugu에 subtract를 넣음
        } else {
            System.out.println("메뉴가 없습니다.");

        }
        }

}

