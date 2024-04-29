public class JJ {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("김하나", "학생");
        String name = container1.getKey();
        String job = container1.getValue();

        Container<String, Integer> container2 = new Container<>();
        container2.set("나이",22);
        String age  = container2.getKey();
        int intAge  = container2.getValue();

        System.out.println(container1.getKey()+":"+container1.getValue());
        System.out.println(container2.getKey()+":"+container2.getValue());
    }
}
class
Container<K, V>{
    private K key;
    private V value;

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    public void set(K key, V value) {
        this.key = key;
        this.value=value;
    }
}