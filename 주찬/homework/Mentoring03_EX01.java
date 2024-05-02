package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mentoring03_EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성함을 입력해주세요. =>");
        String myName = scanner.nextLine(); //나의 성함을 입력하는 스캐너를 생성

        // 5명의 이름을 입력받아 ArrayList에 저장
        List<String> names = new ArrayList<>(); //List의 names를 ArrayList로 선언
        System.out.println("부원 5명의 이름을 입력해주세요.");
        for (int i = 0; i < 5; i++) { //리스트를 반복,i는 인덱스 값
            String name = scanner.nextLine();
            names.add(name); // 입력한 이름을 뒤에 하나씩 추가
        }

        // 성이 같은 사람 출력
        System.out.println("나와 성이 같은 사람은 다음과 같습니다:");
        List<String> sameNames = new ArrayList<>();
        int count = 0; // 성이 같은 사람의 수를 세기 위한 변수 [] 하나당 하나씩 증가
        for (String name : names) { // names의 리스트를 반복
            if (name.startsWith(myName.substring(0, 1))) { // 입력한 성과 같은 성을 가진 사람 필터링
                sameNames.add("[" + name + "]"); // 대괄호 안에 성이 같은 사람의 이름 추가
                count++; // 성이 같은 사람의 수 증가
            }
        }
        System.out.println(String.join(", ", sameNames)); // sameNames를 ,로 구분
        System.out.println("나와 성이 같은 사람은 총 " + count + "명입니다."); // 성이 같은 사람의 총 수 출력
    }
}
