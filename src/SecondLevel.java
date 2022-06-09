import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter first number a");
        int a = scanner.nextInt();
        System.out.println("Please enter second number b");
        int b = scanner.nextInt();
        System.out.println("Please enter third number c");
        int c = scanner.nextInt();
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Maximum is " + max);
    }
}
