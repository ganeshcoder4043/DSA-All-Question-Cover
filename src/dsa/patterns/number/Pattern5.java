package dsa.patterns.number;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int s=1; s<=i; s++){
                System.out.printf(" ");
            }
            for (int j=5;j>=i;j--){
                System.out.printf("1");
            }
            System.out.println();
        }
    }
}
