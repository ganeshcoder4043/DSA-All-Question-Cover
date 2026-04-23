package dsa.javabasicquestion;

import java.util.Arrays;
import java.util.List;

public class AddAllEvenNatNum {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        int totalSum = list.stream().mapToInt(Integer::intValue).sum();
        long count = list.stream().count();
        System.out.println(count);
        System.out.println(totalSum);

        int[] nums = {45, 12, 89, 34, 67, 23, 56, 78, 91, 5};
        int sum = Arrays.stream(nums).sum();
        System.out.println(sum);

    }
}
