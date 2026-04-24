package dsa.patterns.star;

public class AllPatterns {

    public static void main(String[] args) {

        for(int i=1; i<=5;i++){ // row ( horizontal line )
            for(int j=1; j<=5;j++){  // column (Vertical line)
                System.out.print("*");
            }
            System.out.println();
        }

        // Triangle 1
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Triangle 2
        for(int i=1; i<=5;i++){
            for (int j=5; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=5;i++){
            for (int s=4; s>=i; s--){   // space
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=1; i<=5;i++){
            for (int s=1; s<i;s++){   // space
                System.out.print(" ");
            }
            for (int j=5; j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
