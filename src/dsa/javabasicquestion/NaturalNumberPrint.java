package dsa.javabasicquestion;

import java.util.Scanner;

public class NaturalNumberPrint {
    public static void main(String[] args) {
        System.out.println("Natural Number Print");
        System.out.println("Enter Number");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=1; i<=n; i++ )
        {
            System.out.println(i);
        }
    }
}
