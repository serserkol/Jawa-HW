package org.example;

public class N6 {

        public static void main(String[] args) {
            // Создаем двумерный массив чисел (3x3) с примерными значениями
            int[][] array2D = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Значение, которое мы ищем
            int targetValue = 5;

            // Ищем значение в массиве
            int[] index = findValueIn2DArray(array2D, targetValue);

            if (index != null) {
                System.out.println("Значение " + targetValue + " найдено в индексе [" + index[0] + "][" + index[1] + "]");
            } else {
                System.out.println("Значение " + targetValue + " не найдено в двумерном массиве.");
            }
        }

        public static int[] findValueIn2DArray(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }