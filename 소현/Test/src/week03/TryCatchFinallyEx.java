package week03;

public class TryCatchFinallyEx {
    public static void main(String[] args) {
        try {
            int x = 10;
            System.out.printf("10 / %d = %d\n", x, 10/x);

            String str = "try catch";
            int length = str.length();
            System.out.println("length = " + length);

            int[] arr = new int[5];
            arr[5] = 11111;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());   //catch를 연달아 사용 가능
        } catch (Exception e) {  //e는 변수명으로 사용자 지정 가능
            System.out.println("Exception: " + e.getMessage());   //모든 예외들을 잡을 수 있음
        } finally {
            System.out.println("finally: 예외 발생여부와 관계없이 최종적으로 실행되는 문장입니다.");
        }
    }
}
