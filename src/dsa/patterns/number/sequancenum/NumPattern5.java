package dsa.patterns.number.sequancenum;

public class NumPattern5 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int s=0; s<=i;s++){
                System.out.print(" ");
            }

            for (int j=5; j>=i; j--){
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
