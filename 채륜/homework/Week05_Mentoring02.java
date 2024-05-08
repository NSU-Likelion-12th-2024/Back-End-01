package homework;

public class Week05_Mentoring02 {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 5; i++){
            for (j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 4; i > 0; i--){
            for (j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
