public class findSingleBinar {
    public static void main(String[] args) {
        // Создаем массив
        int nums[] = {1, 1, 2, 2, 6, 4, 4, 5, 5};
        // Вызываем функцию singleNonDuplicate и выводим результат
        System.out.println("Одиночный элемент в массиве: " + singleNonDuplicate(nums));
    }

    public static int singleNonDuplicate(int[] nums) {
        // Устанавливаем начальные значения для low и high
        int low = 0, high = nums.length - 1;
        // Пока low меньше high
        while (low < high) {
            // Находим середину массива
            int mid = low + (high - low) / 2;
            // Если mid нечетное число, уменьшаем его на единицу
            if (mid % 2 == 1) mid--;
            // Если элемент в середине не равен следующему элементу
            if (nums[mid] != nums[mid + 1]) high = mid; // Одиночный элемент находится слева
            else low = mid + 2; // Одиночный элемент находится справа
        }
        // Возвращаем одиночный элемент
        return nums[low];
    }
}
