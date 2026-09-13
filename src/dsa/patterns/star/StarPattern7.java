package dsa.patterns.star;

public class StarPattern7 {

    void patternWayOne(){
        for (int i=1; i<=5; i++){
            for (int s=4; s>=i; s--){
                System.out.print(" ");
            }
            for (int k=2; k<=i; k++){
                System.out.print("*");
            }

            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void patternWayTwo(){
        for (int i=1; i<=5; i++){
            for (int s=4; s>=i; s--){
                System.out.print(" ");
            }
            for (int j=1; j<=(i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        StarPattern7 starPattern7 = new StarPattern7();
        starPattern7.patternWayOne();
        starPattern7.patternWayTwo();

    }
}
