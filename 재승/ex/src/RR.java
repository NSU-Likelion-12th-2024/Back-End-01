import java.util.ArrayList;
import java.util.List;

public class RR {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("리스트의 크기: " + fruits.size());

        String fruit = fruits.get(1);
        System.out.println("인덱스 1의 과일: " + fruit);

        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Banana가 리스트에 포함되어 있는가? " + containsBanana);

        fruits.remove("Orange");
        System.out.println("Orange 요소 제거 후; " + fruits);

        fruits.clear();
        System.out.println("모든 요소 제거후; " + fruits);
    }
}
