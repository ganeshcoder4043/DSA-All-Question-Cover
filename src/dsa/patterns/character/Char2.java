package dsa.patterns.character;

public class Char2 {
    public static void main(String[] args) {

        for(char i='a';i<='e';i++) {
            for(char j='a';j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("-------------------");

        for(char i='a';i<='e';i++) {
            for(char j='a';j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
