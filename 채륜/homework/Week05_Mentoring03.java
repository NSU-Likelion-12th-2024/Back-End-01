package homework;

public class Week05_Mentoring03 {
    double width;
    double length;
    Week05_Mentoring03(double width, double length){
        this.width=width; this.length=length;
    }
    double getArea() { // 면적 (가로*세로)
        return this.width * this.length;
    }
    double getCircumference() { // 둘레 (가로+높이)*2
        return (this.width+this.length)*2 ;
    }
    public static void main(String[] args) {
        // 사각형의 가로와 세로로 객체를 생성하는 생성자
        // 면적을 반환하는 메소드 getArea(),
        // 둘레를 반환하는 메소드 getCircumference(),
        // 다음과 같이 클래스 Rectangle 이용
        // Rectangle rc = new Rectangle(3.82, 8.65);
//		System.out.println("면적 : "+rc.getArea());
//		System.out.println("둘레 : "+rc.getCircumference());
        Week05_Mentoring03 rc = new Week05_Mentoring03(3.82,8.65);
        System.out.println("가로:3.82, 세로: 8.65");
        System.out.println("면적 : "+rc.getArea());
        System.out.println("둘레 : "+rc.getCircumference());

    }
}
