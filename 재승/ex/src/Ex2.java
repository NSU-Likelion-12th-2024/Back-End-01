public class Ex2 {
    static int mod(int a, int b){
        int result = a%b;
        return result;
    }
    static void printNum(int a){
        System.out.println(a);
    }
    static String greeting(){
        return "Hello";
    }
    static void greeting_2(){
        System.out.println("Hello!");
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int mod_result = mod(3, 2);

        System.out.println(mod_result);

        printNum(10);
        String str =greeting();
        System.out.println(str);

        greeting_2();

    }
}
