package homework;

import java.util.Scanner;

public class Week01_EX01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 :");
        int i = sc.nextInt();
        System.out.println("====="+i+"단"+"=====");
        for (int j = 1; j < 10; j++) {
            System.out.println(i + "*" + j + "=" + i * j);
        }
    }
}