package kavarma;

import java.util.Random;
import java.util.Scanner;

public class WorkWithArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість елементів в масиві");
        int countElements = sc.nextInt();
        int[] array = new int[countElements];

        Random random = new Random();
        System.out.println("Сгенерованний массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
            System.out.print(array[i] + " ");
        }

        System.out.println();
        insertionSort(array);
        System.out.println("Відсортованний масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Введіть число, яке потрібно знайти у данному масиві:");
        countElements = sc.nextInt();
        int index = binarySearch(array, countElements);
        if (index != -1) {

            System.out.println("Задане число має індекс " + index);
        } else {
            System.out.println("Задане число не знайдено в масиві");
        }
    }


    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int elements = array[i];
            int original = i - 1;

            while (original >= 0 && array[original] > elements) {
                array[original + 1] = array[original];
                original--;
            }
            array[original + 1] = elements;
        }

    }

    public static int binarySearch(int[] array, int countElements) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == countElements) {
                return mid;
            }
            if (array[mid] < countElements) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}

