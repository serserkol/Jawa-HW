package org.example;
// Посчитайте произведение положительных элементов одномерного массива. Массив создайте самостоятельно.
public class N3 {

        public static void main(String[] args) {
            // Создаем одномерный массив чисел
            int[] numbers = {10, -5, 20, -15, 30, -25};

            // Заменяем отрицательные значения на 0
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    numbers[i] = 0;
                }
            }

            // Выводим результат
            System.out.print("Массив после замены: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }