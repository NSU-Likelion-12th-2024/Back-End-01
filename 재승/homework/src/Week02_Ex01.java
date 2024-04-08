public class Week02_Ex01 {
    public static void main(String[] args) {
        String name = "박교수";
        String id = "123456-1234567";
        String phone = "010-1234-5678";





        System.out.println("이름: " + getHiddenData(name,1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8 ));
        System.out.println("전화번호: " + getHiddenData(phone, 9 ));
    }


    public static String getHiddenData(String personalId, int index) {

        String lastDigits = personalId.substring(index);
        // 가져온 데의터의 인덱스까의 이후 길이를 계산
        int length = lastDigits.length();
        // '*'로 대체하여 가려줌
        String cola = "*".repeat(length);
        // 가려진 뒷자리를 기존 데이터와 합쳐서 반환
        return personalId.substring(0, index) + cola;

    }


}