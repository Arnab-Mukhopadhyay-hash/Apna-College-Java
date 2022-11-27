import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b)
            System.out.println("Both the numbers are equal");
        else if (a > b)
            System.out.println("A is greater than B");
        else
            System.out.println("B is greater than A");
        sc.close();
    }

}
