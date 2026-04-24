package dsa.patterns.star;

public class Pattern1 {

    public static void main (String[] args){

        for(int i=1; i<=5;i++){ // row ( horizontal line )
            for(int j=1; j<=5;j++){  // column (Vertical line)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*output =>

        *****
        *****
        *****
        *****
        *****
*/