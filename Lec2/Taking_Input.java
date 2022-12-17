package Lec2;

import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = scan.nextInt();
        System.out.println("The number given input is --> " + n);
        scan.close();
    }
}
