package homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Board {
     String name; //이름을 받는 멤버변수
     int level; // 레벨을 받는 멤버변수
     int power; // 파워를 받는 멤버변수


   public Board(String name, int level, int power) { //생성자 선언 생성자는 클래스 이름이랑 동일
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName() {
        return this.name; // 이름 반환
    }

    public int getLevel() {
        return this.level; // 레벨 반환
    }

    public int getPower() {
        return this.power; // 파워 반환
    }

    public static class Week03_EX01 {
        public static void main(String[] args) {
            List<Board> boards = new ArrayList<>(Arrays.asList(
                    new Board("James", 10, 3000),
                    new Board("Alice", 20, 4000),
                    new Board("Thomas", 15, 3500)
            ));

            System.out.println("[user name]");
            boards.stream().map(Board::getName).forEach(System.out::println); //리스트를 스트림으로 변환 후 이름을 받아와 매핑한뒤 출력
            System.out.println();

            System.out.println("[user power 합계]");
            int powerSum = boards.stream().mapToInt(Board::getPower).sum();
            System.out.println(powerSum);
            System.out.println();
            
            System.out.println("[user level 15 이상]");
            boards.stream()
                    .filter(t -> t.getLevel() >= 15) //t 는 각 요소를 나타내는 변수
                    .map(Board::getName)
                    .map(String::toUpperCase) //대문자 전환
                    .sorted() //정렬
                    .forEach(System.out::println);
        }
    }
}
