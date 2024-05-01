import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week04_Mentoring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 성함 입력(문자열), inputMyName은 입력받은 값을 저장하는 변수
        System.out.print("성함을 입력해주세요 => ");
        String inputMyName = scanner.nextLine().trim(); //trim() 메서드는 입력받은 문자열의 양 끝 공백 제거

        // 부원들의 이름 한 번에 입력받기, inputNames은 입력받은 값을 저장하는 변수
        System.out.print("부원 5명의 이름을 입력해주세요 >> ");
        // 입력된 이름들을 리스트에 추가
        List<String> names = new ArrayList<>();
        // 5번을 반복하는 for문을 통해 부원들의 이름을 입력받음
        for (int i = 0; i<5; i++){
            String name = scanner.nextLine().trim(); //입력받은 이름을 name변수에 저장
            names.add(name); //names리스트에 각 이름들이 추가됨
        }

        scanner.close(); // Scanner 닫기

        // 본인과 같은 성을 가진 부원 검색 및 출력
        System.out.print("나와 성이 같은 사람은 ");
        List<String> sameName = new ArrayList<>(); //같은 성을 가진 부원들의 이름을 저장할 sameName리스트 생성
        int count = 0; //부원 수를 세기 위한 변수 count
        for (String name : names) { //리스트 name에 저장된 각 이름들 for구문 이용해 반복
            // 부원의 성 추출
            if (name.startsWith(inputMyName.substring(0,1))) { //부원의 이름(name)의 첫 글자가 inputMyName에 저장된 첫 글자와 같은지 확인
                sameName.add(name); //같은 성을 가졌다면 추가시킴
                count++; //+1증가
            }
        }
        System.out.println("총 " + count + "명입니다.");
    }
}
