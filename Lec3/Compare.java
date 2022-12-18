package Lec3;

import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a < b) {
            System.out.println("b is greater.");
        } else {
            System.out.println("a is greater.");
        }
        scan.close();
    }
}
