import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Matoring_HW_02 {
    public static void main(String[] args) {
        // 스캐너를 사용하여 사용자 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);

        // 처음 입력받은 이름을 입력받습니다.
        System.out.print("성함을 입력해주세요. => ");
        String firstName = scanner.nextLine();

        // 처음 입력받은 이름의 성을 추출합니다.
        String firstSurname = firstName.substring(0, 1);

        // 다음 5명의 이름을 저장할 리스트를 만듭니다.
        List<String> names = new ArrayList<>();

        // 다음 5명의 이름을 각 줄에 입력받습니다.
        System.out.println("다음 5명의 이름을 입력하세요:");
        for (int i = 0; i < 5; i++) {
            String name = scanner.nextLine();
            names.add(name);
        }

        // 같은 성을 가진 이름들을 저장할 리스트를 만듭니다.
        List<String> sameSurnameNames = new ArrayList<>();

        // 입력받은 5명의 이름을 반복하면서 처음 입력받은 이름과 같은 성을 가진 이름을 찾습니다.
        for (String name : names) {
            // 입력받은 이름이 처음 입력받은 이름의 성(firstSurname)으로 시작하는지 확인합니다.
            if (name.startsWith(firstSurname)) {
                sameSurnameNames.add(name);
            }
        }

        // 같은 성을 가진 이름들을 출력합니다.
        System.out.println();
        for (String name : sameSurnameNames) {
            System.out.println(name);
        }

        // 같은 성을 가진 이름의 수를 출력합니다.
        System.out.println("나와 성이 같은 사람은 총 " + sameSurnameNames.size() + "명 입니다.");
    }
}
