public class Week02_Ex01 {
    public static void main(String[] args) {
        String name = "박교수";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, phone.length() - 4));
    }
    // visibleCount: 출력 문자 가림X 문자 개수
    public static String getHiddenData(String data, int visibleCount) {
        String visiblePart = data.substring(0, visibleCount);
        String hiddenPart = "*".repeat(data.length() - visibleCount);
        return visiblePart + hiddenPart;
    }
}
