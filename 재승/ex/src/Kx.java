 class Book {
    String title;
    int price;
    public Book() { }
    public void showPrice() {
        System.out.println(title + "의 가격은" + price + "원 입니다");
    }
}
public class Kx {
    public static void main(String[] args){
        Book[] b = new Book[3];
        for (int i=0; i<b.length; i++) {
            b[i] = new Book();
        }
        b[0].title = "국어책";
        b[0].price = 3000;

        b[1].title = "영어책";
        b[1].price = 4000;

        b[2].title = "수학책";
        b[2].price = 5000;

        for (int i=0; i<b.length; i++) {
            b[i].showPrice();
        }
    }
}