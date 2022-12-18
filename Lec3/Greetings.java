package Lec3;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press a button:\n1\t2\t3"); // \t is for giving tabs while printing
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }
        scan.close();
    }
}
