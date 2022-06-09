import java.text.DecimalFormat;
import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter task number 1-3");
        int task = scanner.nextInt();
        switch (task) {
            case 1, 2:
                System.out.println("Please, enter month number");
                int num = scanner.nextInt();
                monthName(num);
                season(num);
                break;
            case 3:
                System.out.println("You can get the BestWowSomething by the price 89.99$.\nBut if you buy two articles then you get the discount 10% of all and if you buy three and more the discount will be 15% of all");
                System.out.println("How many articles do you want to buy?");
                int count = scanner.nextInt();
                countPurchase(count);
                break;
            default:
                System.out.println("Wrong task number");
        }


    }

    private static void monthName(int num) {
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("illegal argument");

        }
    }

    private static void season(int num) {
        switch (num) {
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
        }
    }

    private static void countPurchase(int count) {
        double price = 89.99;
        DecimalFormat f = new DecimalFormat("##.00");
        if (count > 0) {
            switch (count){
                case 1:
                    System.out.println("Your purchase amount is " + f.format(count*price) + "$");
                    break;
                case 2:
                    System.out.println("Your purchase amount is " + f.format(count*price*0.9) + "$");
                    break;
                default:
                    System.out.println("Your purchase amount is " + f.format(count*price*0.85) + "$");
            }

        } else {
            System.out.println("It's a pity. See you next time");
        }
    }
}
