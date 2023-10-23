public class findSingle {
    public static void main(String[] args) {
        // Создаем массив
        int arr[] = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int n = arr.length;
        // Вызываем функцию findSingle и выводим результат
        System.out.println("Одиночный элемент в массиве: " + findSingle(arr, n));
    }

    public static int findSingle(int arr[], int n) {
        // Проходим по массиву с шагом 2 (проверяем каждую пару)
        for (int i = 0; i < n; i += 2) {
            // Если мы достигли последнего элемента или текущий элемент не равен следующему
            if (i + 1 == n || arr[i] != arr[i + 1]) {
                // Возвращаем текущий элемент как одиночный
                return arr[i];
            }
        }
        // Если одиночный элемент не найден, возвращаем -1
        return -1;
    }
}
