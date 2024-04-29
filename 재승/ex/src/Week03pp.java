import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Week03pp {
    public static void main(String[] args) {
        try {
            myException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
            System.out.println("error code: " + e.getERR_CODE());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void myException() throws Exception {
        throw new MyException("MyException에서 예외가 발생하였습니다", 500);
    }
        }
