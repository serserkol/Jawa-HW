package org.example;

public class N5 {

    public static void main(String[] args) {
        // Создаем двумерный массив чисел (3x3) с примерными значениями
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Вычисляем сумму всех парных элементов массива
        int evenSum = 0;
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] % 2 == 0) {
                    evenSum += array2D[i][j];
                }
            }
        }

        // Выводим результат
        System.out.println("Сумма всех парных элементов в 2D массиве: " + evenSum);
    }
}
