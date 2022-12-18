package Lec3;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(
                "Choose among the following:\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division\n5 for modulo operation");
        int op = scan.nextInt();
        switch (op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Input");
        }
        scan.close();
    }
}
