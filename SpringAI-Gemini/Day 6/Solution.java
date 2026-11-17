import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {

    /*
     * Complete the 'calculateSalary' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER basicSalary
     *  2. INTEGER allowance
     *  3. INTEGER deduction
     */

    public static int calculateSalary(int basicSalary, int allowance, int deduction) {
    // Write your code here
    
     return basicSalary + allowance - deduction;

    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int basicSalary = Integer.parseInt(bufferedReader.readLine().trim());

        int allowance = Integer.parseInt(bufferedReader.readLine().trim());

        int deduction = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.calculateSalary(basicSalary, allowance, deduction);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 