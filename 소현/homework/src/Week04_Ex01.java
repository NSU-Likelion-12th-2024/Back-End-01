import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Week04_Ex01 {
    private static class User {      // User 클래스 생성, name,level,power 필드 가짐
        private String name;
        private int level;
        private int power;

        public User(String name, int level, int power) {  //user 클래스 생성자 name, level, power
            this.name=name;
            this.level=level;
            this.power=power;
        }
        public String getName() {   //이름 필드의 getter 기능
            return name;
        }
        public int getLevel() {   //레벨 필드의 getter 기능
            return level;
        }
        public int getPower() {   //파워 필드의 getter 기능
            return power;
        }
    }
    public static void main(String[] args) {
        //1. 유저 네임 전체 출력
        List<User> users = Arrays.asList(          // user 객체들을 리스트로 생성, 각각 새로운 리스트 넣음
                new User("James", 10, 3000),
                new User("Alice", 20, 4000),
                new User("Thomas", 15, 3500)
        );
        List<String> allUser = users.stream()  //user 리스트를 스트림으로 변환
                                        .map(User::getName)  //요소들을 조건에 맞게 변환함, 이름을 가져옴
                                        .collect(Collectors.toList());  //스트림 요소를 수집함, 모든 사용자의 이름을 수집
        System.out.println("[user name]");
        allUser.forEach(System.out::println);  //모든 사용자의 이름을 리스트에서 하나씩 출력함

        //2. Power 총합 출력
        int powerSum = users.stream()   // user 라스트를 스트림으로 변환
                            .mapToInt(User::getPower)  //mapToInt를 사용하여 int 형태로 power를 변환
                            .sum();  //sum기능을 활용해 전투력의 총 합을 계산
        System.out.println("\n[user power 합계]");
        System.out.println(powerSum);

        //3. Level 15이상인 유저 네임을 대문자로 바꾸고 정렬해서 출력
        List<String> levelUser = users.stream()   //user 리스트를 스트림으로 변환
                                    .filter(user -> user.getLevel() >= 15) // 레벨이 15이상인 사용자들을 걸러내는 기능
                                    .map(User::getName) // 걸러낸 사용자 이름을 가져옴
                                    .map(String::toUpperCase) // 대문자로 변환함, toUpperCase가 이름을 대문자로 바꿔주는 기능을 함
                                    .sorted() //스트림 요소를 정렬함
                .collect(Collectors.toList()); //리스트로 수집함
        System.out.println("\n[user level 15 이상]");
        levelUser.forEach(System.out::println);
    }
}
