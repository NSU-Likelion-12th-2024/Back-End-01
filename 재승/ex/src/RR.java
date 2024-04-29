import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Week03_Ex01 {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("james", 10, 3000),
                new User("Alice", 20, 4000),
                new User("Thomas", 15, 3500)
        );
        System.out.println("[user name]");
        users.stream()
                .map(User::getName)
                .forEach(System.out::println);

        System.out.println("[user power 합계]");
        int totalPower = users.stream()
                .mapToInt(User::getPower)
                .sum();
        System.out.println(totalPower);

        System.out.println("[user level 15 이상]");
        List<String> namesInUpper = users.stream()
                .filter(user -> user.getLevel() >= 15)  // level이 15 이상인 user 필터링
                .map(user -> user.getName().toUpperCase())  // 이름을 대문자로 변환
                .collect(Collectors.toList());  // 결과를 리스트로 수집
        for (int i = 0; i  < namesInUpper.size(); i++){
            System.out.println(namesInUpper.get(i));
        }
    }
}
class User {

    private String name;
    private int level;
    private int power;


    public User(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }
    public String getName() {
        return name;
    }
    public int getLevel() {
        return level;
    }
    public int getPower() {
        return power;
    }
}