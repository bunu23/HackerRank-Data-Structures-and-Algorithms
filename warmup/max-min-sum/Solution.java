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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long totalSum = 0; // Variable to store the total sum of all integers in the list
        long minSum, maxSum; // Variables to store the minimum and maximum sums

       
        for (int num : arr) {
            totalSum += num;
        }

        
        Collections.sort(arr);

      
        minSum = totalSum - arr.get(arr.size() - 1);

      
        maxSum = totalSum - arr.get(0);

   
        System.out.println(minSum + " " + maxSum);
    }


    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
