package homework;

public class Week02_Ex01 {
    public static void main(String[] args) {
            String name = "박교수";    //이름
            String id = "990130-1234567";       // 주민번호
            String phone = "010-1234-5678";     // 핸드폰번호

            System.out.println("이름 : " + getHiddenData(name, 1));
            System.out.println("주민등록번호 : " + getHiddenData(id, 8));
            System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

    static String getHiddenData(String data, int index){
        String blur = "*";
        return data.substring(0, index) + blur.repeat(data.length() - index);
    }
}
