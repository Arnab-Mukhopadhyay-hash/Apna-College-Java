package ApnaCollege;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Creating a new scanner object to take inputs
        Scanner sc = new Scanner(System.in);

        // Taking two numbers as input
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Taking the operator as input
        // 1 for addition
        // 2 for subtraction
        // 3 for multiplication
        // 4 for division
        // 5 for modulo
        int op = sc.nextInt();
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
        }
        sc.close();
    }
}
