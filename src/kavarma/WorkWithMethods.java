package kavarma;

import java.util.Scanner;

public class WorkWithMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть ціле число: ");

        int number = scanner.nextInt();

        System.out.println("Квадрат числа " + number + " дорівнює " + calculateSquare(number) + ".");


        System.out.print("\nВведіть радіус циліндра: ");

        double radius = scanner.nextDouble();

        System.out.print("Введіть висоту циліндра: ");

        double height = scanner.nextDouble();

        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height +

                " дорівнює " + calculateCylinderVolume(radius, height) + ".");


        int[] array = {10, 20, 30, 40, 50};

        System.out.println("\nМасив чисел: [10, 20, 30, 40, 50]");

        System.out.println("Сума всіх елементів масиву дорівнює " + calculateArraySum(array) + ".");


        System.out.print("\nВведіть рядок: ");

        scanner.nextLine(); // Зчитуємо залишок після nextInt/nextDouble

        String text = scanner.nextLine();

        System.out.println("Рядок в зворотньому порядку: " + reverseString(text));


        System.out.print("\nВведіть a: ");

        int a = scanner.nextInt();

        System.out.print("Введіть b: ");

        int b = scanner.nextInt();

        System.out.println("Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".");


        System.out.print("\nВведіть ціле число n: ");

        int n = scanner.nextInt();

        System.out.print("Введіть текстовий рядок: ");

        scanner.nextLine();

        String repeatText = scanner.nextLine();

        System.out.println();

        repeatTextNTimes(n, repeatText);


        scanner.close();

    }


    public static int calculateSquare(int number) {

        return number * number;

    }


    public static double calculateCylinderVolume(double radius, double height) {

        return Math.PI * radius * radius * height;

    }


    public static int calculateArraySum(int[] array) {

        int sum = 0;

        for (int num : array) {

            sum += num;

        }

        return sum;

    }


    public static String reverseString(String text) {

        StringBuilder reversed = new StringBuilder(text);

        return reversed.reverse().toString();

    }


    public static int power(int a, int b) {

        return (int) Math.pow(a, b);

    }


    public static void repeatTextNTimes(int n, String text) {

        for (int i = 0; i < n; i++) {

            System.out.println(text);

        }

    }

}

