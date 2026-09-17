package dsa.javabasicquestion;

import java.util.Scanner;

public class SumAllEvenNum {
    public static void main(String[] args) {
        System.out.println("sum all even num");
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int b =0;

        for (int i=0; i<=num; i=i+2){
            b =b+i;
        }
        System.out.println("sum all even num -> " + b);
    }
}
