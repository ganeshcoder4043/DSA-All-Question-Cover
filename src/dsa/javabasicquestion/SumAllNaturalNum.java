package dsa.javabasicquestion;

import java.util.Scanner;

public class SumAllNaturalNum {
    public static void main(String[] args) {
        System.out.println("All Natural Number Sum");
        System.out.println("Enter Number");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = 0;
        for (int i=1; i<=n; i++ )
        {
            b=b+i;
        }
        System.out.print(b);
    }
}
