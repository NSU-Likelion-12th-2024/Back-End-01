package Week02;

public class Ex1_1 {  //Ex1_1이라는 class 생성
    static int mod(int a, int b){  //입력 o, 출력 o
        int result = a%b;
        return result;
    }
    static void printNum(int a){ //입력 o, 출력 x
        System.out.println(a);
    }
    static String greeting(){ //입력 x, 출력 o
        return "Hello";
    }
    static void greeting_2(){ //입력 x, 출력 x
        System.out.println("Hello!");
    }
    public static void main(String[] args) {
    int a = 3;
    int b = 2;
    int mod_result = mod(3, 2);

    System.out.println(mod_result);

    printNum(10);

    String str = greeting();
    System.out.println(str);
    }
}
