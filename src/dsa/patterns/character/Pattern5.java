package dsa.patterns.character;

public class Pattern5 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            for (int s=1; s<=i; s++){
                System.out.print(" ");
            }
            for (int j=5; j>=i;j--){
                System.out.print("a");
            }
            System.out.println();
        }
    }
}
