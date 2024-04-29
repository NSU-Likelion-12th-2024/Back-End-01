package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mentoring03_EX01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("성함을 입력해주세요. =>");
        String myName = scanner.nextLine();

        // 5명의 이름을 입력받아 ArrayList에 저장
        List<String> names = new ArrayList<>();
        System.out.println("부원 5명의 이름을 입력해주세요.");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        // 성이 같은 사람 출력
        System.out.println("나와 성이 같은 사람은 다음과 같습니다:");
        List<String> sameNames = new ArrayList<>();
        int count = 0; // 성이 같은 사람의 수를 세기 위한 변수
        for (String name : names) {
            if (name.startsWith(myName.substring(0, 1))) { // 입력한 성과 같은 성을 가진 사람 필터링
                sameNames.add("[" + name + "]"); // 대괄호 안에 성이 같은 사람의 이름 추가
                count++; // 성이 같은 사람의 수 증가
            }
        }
        System.out.println(String.join(", ", sameNames)); // 성이 같은 사람들을 쉼표로 구분하여 출력
        System.out.println("나와 성이 같은 사람은 총 " + count + "명입니다."); // 성이 같은 사람의 총 수 출력
    }
}
