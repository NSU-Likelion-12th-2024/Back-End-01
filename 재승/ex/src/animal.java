interface animal1 {
    public static final String name= "동물";
    public abstract void move();
    public abstract void bark();
}
class Dog implements animal1 {
    public void move(){
        System.out.println("타다다닥");
    }
    public void bark(){
        System.out.println("왈왈");
    }
}
class Horse implements animal1 {
    public void move() {
        System.out.println("다그닥다그닥");
    }
    public void bark(){
        System.out.println("히이잉잉");
    }
}
public class animal{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Horse horse = new Horse();
        dog.move();
        dog.bark();
        horse.move();
        horse.bark();
    }
}