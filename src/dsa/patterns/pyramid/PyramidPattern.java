package dsa.patterns.pyramid;

public class PyramidPattern {

    public static void main(String[] args) {
        System.out.println("this is PyramidPattern1");
        for(int i=1;i<=5;i++) {
            for(int s=5;s>=i;s--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print("* ");  // must be space after star
            }
            System.out.println();
        }
    }
}
