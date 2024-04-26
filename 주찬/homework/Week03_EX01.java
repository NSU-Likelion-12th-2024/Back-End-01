package homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Board {
     String name;
     int level;
     int power;


   public Board(String name, int level, int power) {
        this.name = name;
        this.level = level;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public int getPower() {
        return this.power;
    }

    public static class Week03_EX01 {
        public static void main(String[] args) {
            List<Board> boards = new ArrayList<>(Arrays.asList(
                    new Board("James", 10, 3000),
                    new Board("Alice", 20, 4000),
                    new Board("Thomas", 15, 3500)
            ));

            System.out.println("[user name]");
            boards.stream().map(Board::getName).forEach(System.out::println);
            System.out.println();

            System.out.println("[user power 합계]");
            int powerSum = boards.stream().mapToInt(Board::getPower).sum();
            System.out.println(powerSum);
            System.out.println();
            
            System.out.println("[user level 15 이상]");
            boards.stream()
                    .filter(t -> t.getLevel() >= 15)
                    .map(Board::getName)
                    .map(String::toUpperCase) //대문자 전환
                    .sorted() //정렬
                    .forEach(System.out::println);
        }
    }
}
