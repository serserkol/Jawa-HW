import java.util.List;

public class IntMaxMin {
    public static int maxOrMin(List<Integer> values, boolean max) {
        // Проверяем, что список не пустой
        if (values.isEmpty()) {
            // Бросаем исключение
            throw new IllegalArgumentException("Список не может быть пустым");
        }
        // Инициализируем результат первым значением в списке
        int result = values.get(0);
        // Проходим по остальным значениям в списке
        for (int i = 1; i < values.size(); i++) {
            // Получаем текущее значение
            int value = values.get(i);
            // Сравниваем его с результатом в зависимости от параметра max
            if (max && value > result) {
                // Если ищем максимум и значение больше результата, обновляем результат
                result = value;
            } else if (!max && value < result) {
                // Если ищем минимум и значение меньше результата, обновляем результат
                result = value;
            }
        }
        // Возвращаем результат
        return result;
    }
}
