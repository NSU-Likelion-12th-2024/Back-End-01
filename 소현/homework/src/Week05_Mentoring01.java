import com.sun.source.tree.BreakTree;

import java.util.Scanner;
interface Caculator {
    int add(int a, int b); //a와 b합
    int subtract(int a, int b); //a와 b의 차
    void for_ququ(int a); //구구단 출력
}
//CalculatorSet 클래스는 Calculator 인터페이스 구현
class CalculatorSet implements Caculator {

    @Override // add 구현 (a와 b의 합)
    public int add(int a, int b) {
        return a + b;
    }

    @Override // subtract 구현 (a와 b의 차)
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override //구구단 구현
    public void for_ququ(int a) { //구구단 a단 출력
        System.out.println(a + "단:");
        for (int i = 1; i <= 9; i++) { // i=1이고 i가 0보다 작거나 같으면 1씩 증가
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
}
public class Week05_Mentoring01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner 객체생성
        CalculatorSet calculator = new CalculatorSet(); // calculator 객체 생성

        System.out.println("메뉴 : 1. 덧셈 2. 뺄셈");
        System.out.print("메뉴 선택 : ");
        int menu = scanner.nextInt(); // 숫자인 메뉴가 값을 입력받음

        switch (menu) { //switch
            case 1: // 1에 해당하는 메뉴 실행 코드
                System.out.print("두 수 입력 : ");
                int num1 = scanner.nextInt(); // 첫 번째 숫자 입력받음
                int num2 = scanner.nextInt(); // 두 번째 숫자 입력받음
                int sum = calculator.add(num1, num2); // 합
                System.out.println("결과값 : " + sum); // 합 출력
                calculator.for_ququ(sum); // 결과값에 대한 구구단 출력
                break; //빠져나옴
            case 2: // 2에 해당하는 메뉴 실행 코드
                System.out.print("두 수 입력 : ");
                int num3 = scanner.nextInt(); // 첫 번째 숫자 입력받음
                int num4 = scanner.nextInt(); // 두 번째 숫자 입력받음
                int difference = calculator.subtract(num3, num4); //차
                System.out.println("결과값 : " + difference); // 차 출력
                calculator.for_ququ(difference);
                break;
            default: // 1과 2에 해당하지 않으면
                System.out.println("메뉴가 없습니다.");
                break;
        }

        scanner.close();
    }
}

