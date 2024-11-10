package kavarma;

public class SumOfNumbers {
    public static void main(String[] args) {
        forDZ6();
        System.out.println();
        whileDZ6();
        System.out.println();
        doWhileDZ6();
    }

    private static void forDZ6() {
        int a;
        int b;
        int sum = 0;

        for (a = 1; a <= 6; a++) {
            b = (a * (a + 1)) / 2;
            System.out.println(a + ") Num is " + a + ", sum is " + b);
            sum += a;
        }
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Sum of numbers is " + sum);
    }


    private static void whileDZ6() {
        int a = 1;
        int b;
        int sum = 0;

        while (a <= 6) {
            b = (a * (a + 1)) / 2;
            System.out.println(a + ") Num is " + a + ", sum is " + b);
            sum += a;
            a++;
        }
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Sum of numbers is " + sum);
    }

    private static void doWhileDZ6() {
        int a = 1;
        int b;
        int sum = 0;

        do {
            b = (a * (a + 1)) / 2;
            System.out.println(a + ") Num is " + a + ", sum is " + b);
            sum += a;
            a++;
        } while (a <= 6);
        System.out.println("- - - - - - - - - - - -");
        System.out.println("Sum of numbers is " + sum);
    }
}



