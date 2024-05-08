package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week04_Ex02 {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>(Arrays.asList(
                new User("james", 10, 3000),
                new User("alice", 20, 4000),
                new User("thomas", 15, 3500)
        ));

        System.out.println("[user name]");
        users.stream()
                .map(User::getName)
                .forEach(System.out::println);

        System.out.println("\n[user power 합계]");
        int totalPower = users.stream()
                .mapToInt(User::getPower)
                .sum();
        System.out.println(totalPower);

        System.out.println("\n[user level 15 이상]");
        users.stream()
                .filter(l -> l.getLevel() >= 15)
                .map(user -> user.getName().toUpperCase())
                .forEach(System.out::println);

    }
}

class User{
    private String name;
    private int level;
    private int power;

    /**
     * 생략되어있는 생성자
     */
    public User() {
    }

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
    public void setName(String name) {
        this.name = name;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
