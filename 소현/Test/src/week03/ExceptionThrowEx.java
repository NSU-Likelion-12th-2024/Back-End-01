package week03;

public class ExceptionThrowEx {
    public static void main(String[] args) {
        try {
            myException();            //try에서 mtException 메서드 호출
        } catch (Exception e) {       // catch에서 출력
            System.out.println(e.getMessage());
        }
    }
    public static void myException() throws Exception {  //throws에서 예외 강제 발생
        throw new Exception("myException에서 예외가 발생하였습니다.");
    }
}
