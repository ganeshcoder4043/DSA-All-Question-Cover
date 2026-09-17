package dsa.javabasicquestion;

import java.util.Scanner;

public class EvenNaturalNumPrint {
    public static void main(String[] args) {
        System.out.println("All Natural Number Sum");
        System.out.println("Enter Number");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0; i<=n; i=i+2 )
        {
            System.out.println(i);
        }
    }
}
