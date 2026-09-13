package dsa.patterns.character;

public class Char5 {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'e'; i++) {
            for (int s = 0; s <= i-'a'; s++) {  // <--
                System.out.print(" ");
            }
            for (char j = 'e'; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }


        System.out.println("----------------------");


        for (char i = 'a'; i <= 'e'; i++) {
            for (int s = 0; s <= i-'a'; s++) {  // <--
                System.out.print(" ");
            }
            for (char j = 'e'; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }


        System.out.println("=================");

        for(char i='a';i<='e';i++) {
            for(char j='a';j<='e';j++) {
                if(i=='a' || i=='e' || j=='a' || j=='e') {
                    System.out.print(j);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");

        }
    }
}
