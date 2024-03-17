package org.example;

public class N7 {

        public static void main(String[] args) {
            // Создаем двумерный массив чисел (3x3) с примерными значениями
            int[][] array2D = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            // Меняем местами значения первой строки с последней
            int[] temp = array2D[0];
            array2D[0] = array2D[array2D.length - 1];
            array2D[array2D.length - 1] = temp;

            // Выводим результат
            System.out.println("Массив после замены:");
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {
                    System.out.print(array2D[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
