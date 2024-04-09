package week03;

public class MyExceptionEx {
    public static void main(String[] args) {
        try {
            myException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("error code: " + e.getErrCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void myException() throws Exception {
        throw new MyException("MyException 예외가 발생하였습니다.", 500);
    }
}