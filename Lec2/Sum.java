package Lec2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("sum"); // this will print the string sum
        System.out.println(sum);
        scan.close();
    }

}
