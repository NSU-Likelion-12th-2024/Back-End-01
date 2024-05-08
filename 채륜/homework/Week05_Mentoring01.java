package homework;

import java.util.Scanner;

interface Caculator{
    int add(int a, int b);
    int subtract(int a, int b);
    void for_gugu(int a);
}

class CalculatorSet implements Caculator{
    public int add(int a, int b){
        return a+b;
    }

    public int subtract(int a, int b){
        return a-b;
    }

    public void for_gugu(int a){
        for (int i = 1; i<10; i++){
            System.out.println(a + " x " + i + " = " + a*i);
        }
    }
}
class Week05_Mentoring01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu_choice = 0;
        System.out.println("메뉴 : 1.덧셈   2.뺄셈");
        System.out.print("메뉴 선택 : ");
        menu_choice = sc.nextInt();
        int x=0, y=0;
        CalculatorSet cal = new CalculatorSet();

        if (menu_choice == 1){
            System.out.print("두 수 입력 : ");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("결과값 : " + cal.add(x, y));
            cal.for_gugu(cal.add(x, y));
        }
        else if (menu_choice == 2){
            System.out.print("두 수 입력 : ");
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println("결과값 : " + cal.subtract(x, y));
            cal.for_gugu(cal.subtract(x, y));
        }
        else {
            System.out.println("메뉴가 없습니다.");
        }
        System.out.println();
    }
}
