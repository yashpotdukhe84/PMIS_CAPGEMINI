
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class gen2 {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(101, "Yash");

        System.out.println("Key: " + p1.getKey());
        System.out.println("Value: " + p1.getValue());

        Pair<String, Integer> p2 = new Pair<>("Age", 23);

        System.out.println("Key: " + p2.getKey());
        System.out.println("Value: " + p2.getValue());
    }
}
