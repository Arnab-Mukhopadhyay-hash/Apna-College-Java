package Lec3;

import java.util.Scanner;

public class Checking_Age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = scan.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not an Adult");
        }
        scan.close();
    }
}
