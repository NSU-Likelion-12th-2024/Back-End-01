package homework;
    class SignUp {

        String id;
        String password;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public void signUp(String id, String password) {
        }
    }
public class Quiz01 {
    public static void main(String[] args) {
        SignUp signUp = new SignUp();
        signUp.setPassword("1234");
        signUp.signUp("abcd",signUp.getPassword());

        System.out.println("비밀번호가 설정되었습니다");
        System.out.println("아이디는 abcd 비밀번호는 1234");
    }
}
