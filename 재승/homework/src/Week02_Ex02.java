import java.sql.SQLOutput;

public class Week02_Ex02 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("------------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();

            System.out.println("---------------------");
        }
        System.out.println("메뉴 준비가 완료 되었습니다.");
    }
}
    class HamBurger {
    String name="햄버거"; //문자열 변수를 햄버거라 선언

    void cook(){ //cook이라는 메서드의 기능들의 반환값이 없다.

        System.out.println(name+"를 만듭니다");
        System.out.println("빵 사이에 들어간느 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

    class CheeseBurger extends HamBurger{
        void cook(){
            super.name="치즈버거"; // 부모클래스의 name을 치즈버거로 변경
            super.cook(); //부모클래스의 cook이라는 메서드를 불러옴.

            System.out.println("+ 치즈");
        }
}
    class ShrimpBurger extends HamBurger{
    void cook(){
        super.name="새우버거";
        super.cook();
        System.out.println("+ 새우");
    }
}



