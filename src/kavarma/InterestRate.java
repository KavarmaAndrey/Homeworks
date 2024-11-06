package kavarma;

import java.util.Scanner;

public class InterestRate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть суму доходу:");
        double income = sc.nextDouble();
        double percent;
        double result;
        sc.nextLine();

        if ((income > 0) & (income <= 10000)) {
            percent = income / 100 * 2.5;
            result = (double) Math.round(percent * 100) / 100;
            System.out.println("Відсоткова ставка дорівнює 2.5%: " + result + " грн");
        } else if ((income > 10000) & (income <= 25000)) {
            percent = income / 100 * 4.3;
            result = (double) Math.round(percent * 100) / 100;
            System.out.println("Відсоткова ставка дорівнює 4.3%: " + result + " грн");
        } else if (income > 25000) {
            percent = income / 100 * 6.7;
            result = (double) Math.round(percent * 100) / 100;
            System.out.println("Відсоткова ставка дорівнює 6.7%: " + result + " грн");
        } else if (income <= 0) {
            System.out.println("Працюйте краще, ви нічого не заробили!!!");

        }

    }

}


