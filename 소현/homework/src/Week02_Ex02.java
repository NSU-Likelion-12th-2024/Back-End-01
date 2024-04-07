class HamBurger {  //햄버거 클래스 생성
    protected String name;  //같은 클래스 내, 자손 클래스에서 접근 가능한 문자 타입의 "name" 변수 선언
    public HamBurger(String name){   //HamBurger 클래스의 생성자를 정의. String name 매개변수
        this.name = name;  // name 멤버 변수에 생성자로 전달된 name 매개변수 값 할당
    }
    public void cook(){    // cook 과정
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}
class HamBurger1 extends HamBurger {  //햄버거가
    public HamBurger1() {
        super("햄버거");
    }
}
class CheeseBurger extends HamBurger{   //치즈버거가 햄버거를 상속받음
    public CheeseBurger() {     //치즈버거 클래스 생성자 정의
        super("치즈버거");  //부모클래스인 햄버거 클래스 생성자 호출. 치즈버거라는 이름을 가진
    }
    @Override              //햄버거에서 상속받은 cook을 오버라이드, cook 메소드가 실행되고 +치즈를 출력하도록 함
    public void cook(){
        super.cook();
        System.out.println("+ 치즈");
    }
}
class ShrimpBurger extends HamBurger{   //새우버거가 햄버거를 상속받음
    public ShrimpBurger() {            //새우버거 클래스 생성자 정의
        super("새우버거");        //부모클래스인 햄버거 클래스 생성자 호출. 새우버거라는 이름을 가진
    }    @Override                  //햄버거에서 상속받은 cook을 오버라이드, cook 메소드가 실행되고 +새우를 출력하도록 함
    public void cook(){
        super.cook();
        System.out.println("+ 새우");
    }
}

public class Week02_Ex02 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];   //햄버거 객체를 담는 배열을 선언하고 크기가 3이라고 지정
        hamBurgers[0] = new HamBurger1();             // 각각 객체를 생성함. 햄버거,치즈,새우버거
        hamBurgers[1] = new CheeseBurger();           //HamBurger로 객체 만들면 안돌아가서 뒤에 1 붙였어요...
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다."); //출력함
        System.out.println("--------------------");
        for (HamBurger hamBurger : hamBurgers) {    //햄버거 객체에 대해 cook 실행
            hamBurger.cook();
            System.out.println("----------------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
