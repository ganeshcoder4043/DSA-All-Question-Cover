package dsa.patterns.pyramid;

public class pyramid1 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++) {
            for (int s=4; s>=i;s--){
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }
        /*for (int i = 4; i >= 1; i--) {
            for (int s = 4; s >= i; s--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }*/

        for (int i = 1; i<=4; i++) {
            for (int s = 1; s <= i; s++) {
                System.out.print(" ");
            }

            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
