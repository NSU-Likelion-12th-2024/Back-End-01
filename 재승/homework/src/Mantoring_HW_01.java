public class Mantoring_HW_01 {
    public static void main(String[] args) {
        SignUp signUp = new SignUp();
        signUp.setPassword("1234");
         signUp.signUp("abcd", signUp.getPassword());
    }
}
 class SignUp {
 public String id;
public String password;

 public void setPassword(String password){

     this.password = password;
 }
     public String getPassword() {
         return password;
     }
     public void signUp(String id, String password) {
         System.out.println("비밀번호가 설정되었습니다.");
         System.out.println("아이디는 " + id + " 비밀번호는 "+ password);

     }
 }
