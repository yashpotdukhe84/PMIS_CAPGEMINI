
import java.util.*;
import java.util.stream.*;

public class map{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 4);

        List<Integer> result = nums.stream()
                .map(n -> n * n)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original List: " + nums);
        System.out.println("Result: " + result);
    }
}
