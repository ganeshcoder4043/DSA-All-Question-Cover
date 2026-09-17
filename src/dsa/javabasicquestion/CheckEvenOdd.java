package dsa.javabasicquestion;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        System.out.println("check Even Odd Number");
        System.out.println("Enter Your Number");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i%2==0){
            System.out.println("your your number is even");
        }
        else {
            System.out.println("its a odd number");
        }
    }
}
