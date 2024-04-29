class  Tv{
    String color;
    boolean power;
    int channel;
    void  Power(){power = !power;}
    void ChannelUp() {channel++;}
    void ChannelDown() {channel--;}
}
public class EX1_1 {
    public static void main(String[] args) {
        Tv LgTv = new Tv();
        Tv SamsungTv =new Tv();
        Tv AppleTv = new Tv();
        SamsungTv.Power();
    }
}
