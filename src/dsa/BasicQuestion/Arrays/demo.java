package dsa.BasicQuestion.Arrays;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {

        /*int[] arr = {45, 12, 89, 34, 67, 23, 56, 78, 91, 5};

//        Arrays.stream(arr).forEach(System.out::println);
        int[] array = Arrays.stream(arr).filter(i -> i % 2 == 0).toArray();
        System.out.println(Arrays.toString(array));*/

        /*for (int newarr : arr){
            System.out.println(newarr);
        }
        System.out.println();

        for (int i = 0; i<= arr.length; i++){
            System.out.println(i);
        }*/



        int[] arr = {45, 12, 89, 34, 67, 23, 56, 78, 91, 5};

        for (int i=0; i<=arr.length-1;i++){
            if (arr[i] % 2 == 0){
                System.out.println(arr[i]);
            }
        }
    }
}
