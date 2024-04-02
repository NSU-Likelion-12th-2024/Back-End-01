import java.util.Scanner;
public class week01_Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(" 숫자: ");
        int num = sc.nextInt() ;
        System.out.println("=====" + num + "단" + "=====");
        for(int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %02d  ", num, i, num * i);
            }
            System.out.println();
    }
}
