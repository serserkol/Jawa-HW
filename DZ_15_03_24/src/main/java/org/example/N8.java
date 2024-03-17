import java.util.Arrays;

public class N8 {
    public static void main(String[] args) {
        // Создаем двумерный массив чисел (3x4) с примерными значениями
        int[][] array2D = {
                {35, 63, 45, 32},
                {54, 92, 4, 65},
                {14, 90, 42, 83}
        };

        // Сортируем каждую строку по отдельности
        for (int i = 0; i < array2D.length; i++) {
            Arrays.sort(array2D[i]);
        }

        // Выводим результат
        System.out.println("Массив после сортировки:");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
