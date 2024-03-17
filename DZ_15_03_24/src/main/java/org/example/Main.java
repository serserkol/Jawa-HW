package org.example;

// Посчитайте сумму элементов одномерного массива. Массив чисел создайте самостоятельно.

public class Main {
    public static void main(String[] args) {
        // Создаем одномерный массив чисел
        int[] numbers = {10, 20, 30, 40, 50};

        // Вычисляем сумму элементов массива
        int totalSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            totalSum += numbers[i];
        }

        // Выводим результат
        System.out.println("Сумма элементов массива: " + totalSum);
    }
}