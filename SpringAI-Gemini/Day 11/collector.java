import java.util.*;

public class collector {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        System.out.println("Original: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));

        Collections.sort(numbers);
        System.out.println("Index of 30: " + Collections.binarySearch(numbers, 30));
    }
}