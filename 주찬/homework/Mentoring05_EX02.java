package homework;

public class Mentoring05_EX02 {
    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) { //1~5까지
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) { // 별 개수
            for (int j = 1; j <= i; j++) { // j가 i보다 작거나 같을때만 * 출력
                System.out.print("*");
            }
            System.out.println(); // 줄 띄우기
        }
    }
}
