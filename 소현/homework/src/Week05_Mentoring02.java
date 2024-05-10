public class Week05_Mentoring02 {
    public static void main(String[] args) {
        // n=5는 *의 최대갯수를 설정함
        int n = 5;

        // 위쪽 삼각형 출력
        for (int i = 1; i <= n; i++) { // i=1이고 i가 n(=5)보다 작거나 같으면 1씩 증가
            for (int j = 1; j <= i; j++) { // j=1이고 j가 i보다 작거나 같으면 1씩 증가
                System.out.print("*"); // * 출력
            }
            System.out.println(); // 다음 줄로 넘어감
        }

        // 아래쪽 역삼각형 출력
        for (int i = n - 1; i > 0; i--) { // i=n-1이고 i가 0보다 크면 1씩 증가
            for (int j = 1; j <= i; j++) { // j=1이고 j가 i보다 작거나 같으면 1씩 증가
                System.out.print("*"); // * 출력
            }
            System.out.println();
        }
    }
}

