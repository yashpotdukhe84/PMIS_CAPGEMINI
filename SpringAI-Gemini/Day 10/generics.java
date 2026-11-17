
class Box<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class generics {
    public static void main(String[] args) {
        
        // Box<Integer> b1 = new Box<>();
        // b1.setValue(100);
        // System.out.println(b1.getValue());

        Box<String> b2 = new Box<>();
        b2.setValue("Hello Java");
        System.out.println(b2.getValue());
    }
}
