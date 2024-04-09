class SingUp{  //SingUp 클래스 정의
    public String password;  //password라는 이름의 변수 정의, 이때 SingUp클래스 내부에서만 접근 가능
    public void setPassword(String newpassword) { //setPassword 정의. newpassword가 매개변수
        this.password = newpassword; //newpassword가 password에 저장됨
        System.out.println("비밀번호가 설정되었습니다"); //출력문
    }
    public String getPassword() {  //getPassword 정의
        return this.password;  //설정된 비밀번호 반환
    }
    public void singUp(String id, String password) {   //singUp 메서드 정의
        System.out.println("아이디는 " + id + " 비밀번호는 " + password);  //출력문
    }
}

    public class Week03_Mentoring {  //메인클래스 정의
        public static void main(String[] args) {
            SingUp singUp = new SingUp();  //SingUp 클래스의 객체 생성 -> 메서드와 변수 사용
            singUp.setPassword("1234");  //setPassword를 이용해 비밀번호 설정
            singUp.singUp("abcd", singUp.getPassword());  //singUp을 이용해 회원가입, abcd라는 아이디와 setPassword에서 설정된 비밀번호를 getPassword를 통해 가져옴
    }
}
