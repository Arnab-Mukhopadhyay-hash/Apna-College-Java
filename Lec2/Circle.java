package Lec2;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = scan.nextInt();
        final double PI = 3.14;
        double area = PI * r * r;
        double perimeter = 2 * PI * r;
        System.out.println("\nThe area of the circle with given radius is --> " + area); // \n is for a new line while
                                                                                         // printing in terminal.
        System.out.println("The perimeter of the circle with given radius is --> " + perimeter);
        scan.close();
    }
}
