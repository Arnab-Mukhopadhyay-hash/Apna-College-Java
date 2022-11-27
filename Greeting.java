package ApnaCollege;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // creating a new scanner class to scan
        Scanner sc = new Scanner(System.in);
        // taking input from the user
        int button = sc.nextInt();

        switch (button) { // giving output according to the button pressed 1 for Hello, 2 for Namaste and
                          // 3 for Bonjour else the input is invalid.
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
                System.out.println("Invalid Input");
        }
        sc.close();
    }
}
