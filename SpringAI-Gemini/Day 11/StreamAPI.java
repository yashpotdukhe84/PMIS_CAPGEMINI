
// import java.util.*;

// public class StreamAPI {
//     public static void main(String[] args) {
//         List<Integer> nums = Arrays.asList(1, 2, 3, 4);

//         List<Integer> result = new ArrayList<>();

//         for (int n : nums) {
//             if (n % 2 == 0) {
//                 result.add(n * n);
//             }
//         }

//         System.out.println(result);
//     }
// }

//.............................With StreamApi......................


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        List<Integer> res = nums.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("OG List: " + nums);
        System.out.println("Result: " + res);
    }
}

