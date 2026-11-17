
class Locker<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

public class problem {
    public static void main(String[] args) {

        Locker<String> locker1 = new Locker<>();
        
        locker1.put("Java Book");
        System.out.println("Locker has: " + locker1.get());

        Locker<Integer> locker2 = new Locker<>();
        locker2.put(1234);
        System.out.println("Locker has: " + locker2.get());
    }
}
