import java.util.HashMap;
import java.util.Map;

public class Ex03_01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("김씨", "어부");
        map.put("이씨", "광부");
        map.put("최씨", "농부");
        map.put("김씨", "무직");

        for (String key : map.keySet()){
            System.out.println(key+": " +map.get(key));
        }
    }
}
