package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week04_Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String memberName = "";
        int count = 0;
        List<String> memberList = new ArrayList<>();
        System.out.println("성함을 입력해주세요. => ");
        memberName = sc.nextLine();

        System.out.println("부원 5명의 이름을 입력해주세요.>> ");

        for (int i = 0; i <= 4; i++) {
            memberList.add(sc.nextLine());
        }
        for (int i = 0; i <= memberList.size() - 1; i++) {
            String member = memberList.get(i);
            if (memberName.substring(0, 1).equals(member.substring(0, 1))){
                System.out.print("[" + memberList.get(i) + "] ");
                count++;
            }
        }
        System.out.println();
        System.out.println("나와 성이 같은 사람은 총 " + count + "명입니다.");
    }

}
