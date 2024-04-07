class Week02_Ex01 {
    public static void main(String[] args) {
        String name = "박교수";              // 이름
        String id = "990130-1234567";       // 주민등록번호
        String phone = "010-1234-5678";     // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 이름의 첫 번째 글자만 표시
        System.out.println("주민등록번호 : " + getHiddenData(id, 8)); // 주민등록번호의 여덟 번째 글자까지 표시
        System.out.println("전화번호 : " + getHiddenData(phone, 9)); // 전화번호의 아홉 번째 글자까지 표시
    }

    // 개인정보 비공개 메소드
    public static String getHiddenData(String data, int Index) {     // getHiddenData 변수 선언
        if (data.length() <= Index) {                               // data 길이가 인덱스의 길이보다 작거나 같으면
            return data;                                            // data 반환
        }

        String visible = data.substring(0, Index);    //문자열 data의 시작부터 Index 직전까지의 부분 문자열을 나타냅니다.
        String hidden = "*".repeat(data.length() - Index);   //길이가 data.length() - Index인 문자열 "*"를 repeat() 이용

        return visible + hidden;            // visible + hidden 반환
    }
}



