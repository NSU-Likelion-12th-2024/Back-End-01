package homework;

class Hamburger{
    String fir = "양상추";
    String sec = "패티";
    String thir = "피클";    // 햄버거 기본재료 생성
    String name = "햄버거";    // 버거이름

    void cook(){        // 부모클래스의 cook 메서드 생성
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> "+ fir);
        System.out.println("+ " + sec);
        System.out.println("+ " + thir);
    }
}

class CheeseBurger extends Hamburger{   // 부모클래스 상속받기
    String four = "치즈";
    String name = "치즈버거";      // 자식 멤버변수

    @Override
    void cook() {   // 부모클래스의 cook을 오버라이드 (부모클래스의 메서드를 내용변경해서 쓰는것)
        super.name = this.name;     // super을 통해 부모 메서드의 name(버거이름)을 현재 멤버변수의 이름을 대입 (이 클래스에서만)
        super.cook();               // 부모클래스의 cook 메서드 실행
        System.out.println("+ " + four);        // 추가 재료 출력
    }
}

class ShrimpBurger extends Hamburger{ // 부모클래스 상속받기
    String four = "새우";
    String name = "새우버거";   // 자식 멤버변수

    @Override
    void cook() {   // 부모클래스의 cook을 오버라이드 (부모클래스의 메서드를 내용변경해서 쓰는것)
        super.name = this.name;     // super을 통해 부모 메서드의 name(버거이름)을 현재 멤버변수의 이름을 대입 (이 클래스에서만)
        super.cook();               // 부모클래스의 cook 메서드 실행
        System.out.println("+ " + four);        // 추가 재료 출력
    }
}
public class Week02_Ex02 {
    public static void main(String[] args) {
        Hamburger[] hamburgers = new Hamburger[3];      // Hamburger라는 객체 배열 생성
        hamburgers[0] = new Hamburger();                // Hamburger 객체를 배열 0번째에 넣기
        hamburgers[1] = new CheeseBurger();             // CheeseBurger 객체를 배열 1번째에 넣기
        hamburgers[2] = new ShrimpBurger();             // ShrimpBurger 객체를 배열 2번째에 넣기

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("-----------------");
        // Hamburger 객체 hamburger 생성 후 for each를 통해서 hamburgers 배열을 순회하며 Hamburger 객체 hamburger 에 넣기
        for (Hamburger hamburger : hamburgers){
            hamburger.cook();
            System.out.println("-------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}
