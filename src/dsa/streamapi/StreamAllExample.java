package dsa.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamAllExample {
    public static void main(String[] args){
                  /* filter -> filter the data  */
        /*List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
              //-> find even number
        List<Integer> filterList = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(filterList);*/

             /* map -> transform the data */
        /*List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        List<Integer> list1 = list.stream().map(i -> 2 * i).toList();
        System.out.println(list1);*/

        /*
        List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        List<Integer> list1 = list.stream().filter(i -> i > 35).toList();
        List<Integer> list2 = list.stream().filter(i -> i < 35).map(i -> i + 5).toList();
        long countFailedStudent = list.stream().filter(i -> i < 35).count();
        System.out.println("passed student -> " + list1);
        System.out.println("failed student grace num +5 -> " + list2);
        System.out.println("number of failed student -> " + countFailedStudent);
         */

                    /* sorted -> elements sort in ascending order*/
        /*List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        List<Integer> list1 = list.stream().sorted().toList();
        List<Integer> list2 = list.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println("first way -> " +list1);
        System.out.println("second way -> " +list2);*/


               /* descending order*/
       /* List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        List<Integer> list1 = list.stream().sorted((a, b) -> (a < b) ? 1 : (a > b) ? -1 : 0).toList();
        List<Integer> list2 = list.stream().sorted((a, b) -> b.compareTo(a)).toList();
        List<Integer> list3 = list.stream().sorted((a, b) -> -a.compareTo(b)).toList();
        List<Integer> list4 = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reverse Order core fundamental -> " + list1);
        System.out.println("Second way -> " + list2);
        System.out.println("Third way -> " + list3);
        System.out.println("fourth way -> " + list4);*/


//        List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);

                        /* */
//        Q-> sort the element based on the length of the ArrayList

        /*List<String> list = Arrays.asList("AA", "AAA", "FFFFFF", "B", "CCCCC", "DD", "EEEE", "FFF", "GGGGGG", "H");
        List<String> list1 = list.stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(list1);*/


                        /* min(), max()*/

        /*List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        Integer normalworkmin = list.stream().min((a,b) -> Integer.compare(a, b)).get();
        Integer comparetorworkmin = list.stream().min((a,b) -> Integer.compare(b, a)).get(); // descending order mein kr diya hai toh first element min or last element max
        System.out.println(normalworkmin); // 5
        System.out.println(comparetorworkmin); // 91*/

        /*
        1. min() method ka kaam:
Normally, min() method list ka sabse chhota (minimum) element dhundhta hai. Agar aap normal comparison karte:
list.stream().min((a, b) -> Integer.compare(a, b))
Iska output 5 aata.

2. Integer.compare(b, a) ka game changer role:
AapneComparator ke andar b aur a ko swap kar diya: Integer.compare(b, a).
Iska kya matlab hua?

Jab min() method element compare karta hai, toh ab uske liye bada number chhota lag raha hai aur chhota number bada lag raha hai.
Matlab, aapne min() method ko Descending Order (utarta hua order) mein sochne par majboor kar diya.
3. Final Result:
Kyunki ab sorting logic reverse ho gaya hai, toh jab min() method descending order ke hisaab sabse chhota element dhundh raha tha, toh technically wo original list ka sabse bada (maximum) element dhundh kar de raha hai.*/



                                 /* forEach */

        /*List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
        list.stream().forEach(i -> System.out.println(i));
        list.stream().forEach(System.out::println);*/
        // dono way se kr skten hai


                   /* how to convert stream of object into arrays */

        List<Integer> list = Arrays.asList(45, 12, 89, 34, 67, 23, 56, 78, 91, 5);
    }
}
