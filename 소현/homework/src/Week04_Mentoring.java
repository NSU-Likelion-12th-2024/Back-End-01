import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week04_Mentoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 성함 입력(문자열), inputMyName은 입력받은 값을 저장하는 변수
        System.out.print("성함을 입력해주세요 => ");
        String inputMyName = scanner.nextLine().trim();

        // 부원들의 이름 한 번에 입력받기, inputNames은 입력받은 값을 저장하는 변수
        System.out.print("부원들의 이름을 입력해주세요 >> ");
        String inputNames = scanner.nextLine().trim();

        // 입력된 이름들을 리스트에 추가
        List<String> names = new ArrayList<>();
        // split는 문자열을 특정 구분자를 기준으로 분리하는 메서드
        // \\s+ 는 공백을 나타냄
        // for문에서 split 메서드에 의해 분리된 이름을 name변수에 할당
        for (String name : inputNames.split("\\s+")) {
            names.add(name); //names리스트에 각 이름들이 추가됨
        }

        scanner.close(); // Scanner 닫기

        // 본인과 같은 성을 가진 부원 검색 및 출력
        String[] myNameParts = inputMyName.split("\\s+");
        String myLastName = myNameParts[0]; // myLastName은 내 성 부분(인덱스 0번째)

        // 본인과 같은 성을 가진 부원 검색 및 출력
        System.out.print("나와 성이 같은 사람은 ");
        int count = 0;
        for (String name : names) {
            // 부원의 성 추출
            String[] nameParts = name.split("\\s+");
            String lastName = nameParts[0]; // 부원의 성 추출
            if (lastName.startsWith(myLastName)) {
                count++;
            }
        }
        System.out.println("총 " + count + "명입니다.");
    }
}
