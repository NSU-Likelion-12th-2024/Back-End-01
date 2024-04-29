

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