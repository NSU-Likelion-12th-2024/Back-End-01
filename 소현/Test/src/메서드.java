import java.sql.SQLOutput;

//public class 메서드 {
//    static int mod(int a, int b){
//        int result = a%b;
//        return result;
//    }
//    static void printNum(int a){
//        System.out.println(a);
//    }
//    static String greeting(){
//        return "Hello";
//    }
//    static void greeting_2(){
//        System.out.println("Hello!");
//    }
//    public static void main(String[] args) {
//        int a = 3;
//        int b = 2;
//        int mod_result = mod( 3,  2);
//
//        System.out.println(mod_result);
//        printNum( 10);
//
//        String str = greeting();
//        System.out.println(str);
//
//        greeting_2();
//        }
//}
//class Tv{
//    String color;
//    boolean power;
//    int channel;
//
//    Tv(){}  //기본 생성자
//    Tv(String color, boolean power, int channel){    //생성자를 만들어서 윗줄의 생성자가 사라짐
//        this.color = color;       // class에 있는 컬러, 파워, 채널을 지칭하는게 this.컬러, 채널, 파워이고 = 뒤에 나오는 것들이 37번째 값들을 매칭
//        this.power = power;
//        this.channel = channel;
//    }
//
//    void Power(){power = !power;}
//    void ChannelUp() {channel++;}
//    void ChannelDown() {channel--;}
//}
//
//public class 메서드 {
//    public static void main(String[] args) {
//        Tv LgTv = new Tv();  //기본 생성자가 없어도 Tv(){}new Tv("red",false,3)으로 작성시 코드가 돌아감
//        Tv SamsungTv = new Tv();
//        Tv AppleTv = new Tv();
//
//       SamsungTv.Power();
//    }
//}
//class Overloading{
//    void cat(){System.out.println("나는 냐옹이다옹");}
//    void cat(String bark){System.out.println("고양이는"+bark+"라고 짖는다옹");}
//    void cat(int num){System.out.println("고양이는"+num+"마리 있다옹");}
//}
//
//public class 메서드 {
//    public static void main(String[] args) {
//        Overloading Cat = new Overloading();  // 클래스를 Cat로 선언
//        Cat.cat();              // 메소드랑 함수 같이 선언, void cat에 있는 함수들을 실행시키는 과정
//        Cat.cat("냐용");
//        Cat.cat(3);
//    }
//}
//class Phone{
//    void message(){System.out.println("일반 메시지 입니다.");}
//}
//class SmartPhone extends Phone{            //스마트폰이 폰을 상속받음. 메시지를 다시 가져와서 오버라이딩 메시지로 재정리함
//    void message(){System.out.println("오버라이딩 된 메시지 입니다.");}
//}
//
//public class 메서드 {
//    public static void main(String[] args) {
//    Phone phone = new Phone();
//    SmartPhone smartPhone = new SmartPhone();
//    phone.message();           //폰 메시지 출력
//    smartPhone.message();      // 스마트폰 메시지 출력
//    }
//}
interface Animal{
    public static final String name = "동물";
    public abstract void move();
    public abstract void bark();
}

class Dog implements Animal{
    public void move(){
        System.out.println("타다다닥");
    }
    public void bark(){
        System.out.println("왈왈");
    }
}

class Horse implements Animal{
    public void move(){
        System.out.println("다그닥다그닥");
    }
    public void bark(){
        System.out.println("히이이잉");
    }
}

public class 메서드 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        dog.move();
        dog.bark();
        horse.move();
        horse.bark();
    }
}