package homework;

import java.util.Scanner;

interface Caculateor {
    int add(int a, int b);

    int subtract(int a, int b);
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
}

public class Mentoring05_EX01 {
    public static void main(String[] args) {
        CauculatorSet cauculatorSet = new CauculatorSet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("메뉴 : 1.덧셈 2.뺄셈");
        System.out.printf("메뉴 선택:"+" ");
        int menu = scanner.nextInt();

        if (menu == 1) {
            System.out.printf("두 수 입력:"+" "); //스캐너 입력을 옆에 바로 하기 위해서 printf 사용
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int add = cauculatorSet.add(num1, num2);
            System.out.println("결과값:" +" "+ add);
            for (int i = 1; i <= 9; i++) {
                int multiplicationa1 = i * add;
                System.out.println(add +" "+"x"+" "+i+" "+"="+" "+ multiplicationa1); //사이사이 공백 추가
            }
        } else if (menu == 2) {
            System.out.printf("두 수 입력:"+" ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int subtract = cauculatorSet.subtract(num1, num2);
            System.out.println("결과값:" + " " + subtract);
            for (int i = 1; i <= 9; i++) {
                int multiplicationa2 = subtract - i;
                System.out.println(subtract +" "+"x"+" "+i+" "+"="+" "+ multiplicationa2);
            }
        } else {
            System.out.println("메뉴가 없습니다.");
        }
    }
}
