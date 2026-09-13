package dsa.patterns.star;

public class StarPattern3 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){ // row  left to right
            for (int j=5; j>=i; j--){ // col  up to down
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
