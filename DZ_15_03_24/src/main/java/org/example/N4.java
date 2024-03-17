package org.example;
// Создайте массив чисел. Создайте его копию, которая будет содержать только отрицательные значения
// из первого массива.
public class N4 {

        public static void main(String[] args) {
            // Создаем одномерный массив чисел
            int[] originalArray = {10, -5, 20, -15, 30, -25};

            // Создаем копию массива, содержащую только отрицательные значения
            int[] negativeArray = new int[originalArray.length];
            int negativeCount = 0;

            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] < 0) {
                    negativeArray[negativeCount] = originalArray[i];
                    negativeCount++;
                }
            }

            // Выводим результат
            System.out.print("Массив после замены: ");
            for (int i = 0; i < negativeCount; i++) {
                System.out.print(negativeArray[i] + " ");
            }
        }
    }
