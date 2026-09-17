package dsa.javabasicquestion;

import java.util.Scanner;

public class OddNaturalNum {
    public static void main(String[] args) {
        System.out.println("All Natural Number Sum");
        System.out.println("Enter Number");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=1; i<=n; i=i+2 )
        {
            System.out.println(i);
        }
    }
}
