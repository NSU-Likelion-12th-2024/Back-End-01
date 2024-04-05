package homework;

public class Week02_EX01 {
    public static void main(String[] args) {
        String name = "박교수";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름:" + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

    public static String getHiddenData(String data, int index) { //name,id,phone이 string data, 가려지는 문자열의 범위가 int data
        String hiddenData = data.substring(0, index) + "*".repeat(data.length()-index); //substring 일부를 자르는 메소드

        return hiddenData; //hiddenData에 들어간 값을 반환
    }
}