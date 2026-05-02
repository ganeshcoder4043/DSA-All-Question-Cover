package dsa.patterns.pyramid;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // number of rows for the upper half

        // upper half of the diamond
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // print spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
