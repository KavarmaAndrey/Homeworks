package kavarma;

import java.util.Random;

public class WorkWithArrays {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();

        System.out.println("Елементи масиву: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sumNegatyv = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                continue;
            } else if (numbers[i] < 0) {
                sumNegatyv += numbers[i];
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNegatyv);

        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Кількість парних чисел: " + countEven);
        System.out.println("Кількість непарних чисел: " + countOdd);

        int max = 0;
        int maxIndex = 0;
        int min = 0;
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            } else if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");

        int firstNegIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegIndex = i;
                break;
            }
        }
        if (firstNegIndex == -1) {
            System.out.println("Усі числа в масиві позитивні");
        } else {
            int sumAfterFirstNeg = 0;
            int countAfterFirstNeg = 0;
            for (int i = firstNegIndex + 1; i < numbers.length; i++) {
                sumAfterFirstNeg += numbers[i];
                countAfterFirstNeg++;
            }
            if (countAfterFirstNeg > 0) {
                double average = (double) sumAfterFirstNeg / countAfterFirstNeg;
                System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %2.2f", average);
            } else {
                System.out.println("Перше від'ємне число - останнє в масиві");
            }
        }
    }
}





