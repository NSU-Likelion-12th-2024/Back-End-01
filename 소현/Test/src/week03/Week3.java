//package week03;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Week3 {
//    public static void main(String[] args) {
//        List<Board>boards = new ArrayList<>(Arrays.asList(
//                new Board("오늘의 날씨","오늘은 맑습니다",30),
//                new Board("오늘의 노래", "뉴진스의 하입보이",40),
//                new Board("오늘의 게임", "리그오브레전드",100),
//                new Board("오늘의 운세", "금전운이 좋네요",20)
//        ));
//        List<String> top3=
//                boards.stream()
//                        .sorted(Comparator.comparing(Board::getHit).reversed())
//                        .limit(3)
//                        .map()
//        }
//    }
//}
//package week03;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Week3 {
//    public static void main(String[] args) {
//        List<String> names = Arrays.asList("김코딩", "이자바", "김자바", "김코딩");
//        names.stream()
//                .distinct() //중복제거
//                .forEach(n-> System.out.println(n));  //최종연산, 란다식
//        System.out.println();
//
//        names.stream()      //새로운 스트림 생성
//                .filter(n->n.startsWith("김")) //"김"으로 시작되는 글자 필터링
//                .forEach(System.out::println);  //최종연산
//    }
//}
//package week03;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class Week3 {
//    public static void main(String[] args) {
//        class Board{
//            private String title;
//            private String content;
//            private int hit;
//
//            Board(String title, String content, int hit){   //생성자
//                this.title = title;
//                this.content = content;
//                this.hit = hit;
//            }
//            public String getTitleAndContent(){return this.title + ":" + this.content;}
//            public int getHit(){return this.hit;}
//        }
//    }
//}