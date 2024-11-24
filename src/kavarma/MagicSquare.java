package kavarma;

import java.util.Random;

public class MagicSquare {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
            }
        }
        System.out.println("Матриця:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }

        int evenRowSum = 0;
        int oddRowSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0) {
                    evenRowSum += matrix[i][j];
                } else {
                    oddRowSum += matrix[i][j];
                }
            }
        }
        System.out.println("Сума елементів парних рядків: " + evenRowSum);
        System.out.println("Сума елементів непарних рядків: " + oddRowSum);

        int evenColumnMult = 1;
        int oddColumnMult = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i % 2 == 0) {
                    evenColumnMult *= matrix[i][j];
                } else {
                    oddColumnMult *= matrix[i][j];
                }
            }
        }
        System.out.println("Добуток елементів парних стовпців: " + evenColumnMult);
        System.out.println("Добуток елементів непарних стовпців: " + oddColumnMult);
        boolean isMagicSquare = checingMagicSquare(matrix);
        System.out.println("Матриця є магічним квадратом " + isMagicSquare);
    }

    private static boolean checingMagicSquare(int[][] matrix) {
        int size = matrix.length;
        int magicSum = 0;
        for (int j = 0; j < size; j++) {
            magicSum += matrix[0][j];
        }
        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                return false;
            }
        }
        for (int j = 0; j < size; j++) {
            int columnSum = 0;
            for (int i = 0; i < size; i++) {
                columnSum += matrix[i][j];
            }
            if (columnSum != magicSum) {
                return false;
            }
        }
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        for (int i = 0; i < size; i++) {
            firstDiagonalSum += matrix[i][i];
            secondDiagonalSum += matrix[i][size - i - 1];
        }
        return firstDiagonalSum == magicSum && secondDiagonalSum == magicSum;
    }

    public static void calculateSum(int evenRowSum, int oddRowSum, int [][] matrix ) {


    }
}










