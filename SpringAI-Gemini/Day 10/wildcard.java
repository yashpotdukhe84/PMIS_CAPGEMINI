
import java.util.*;

public class wildcard {

    static double calculateSum(List<? extends Number> list) {
        double sum = 0;

        for (Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(10, 20, 30);
        List<Double> numbers2 = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println(calculateSum(numbers1));
        System.out.println(calculateSum(numbers2));
    }
}
