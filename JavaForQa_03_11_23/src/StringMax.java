import java.util.List;

public class StringMax {
    public static int maxLength(List<String> values) {
        // Проверяем, что список не пустой
        if (values.isEmpty()) {
            // Бросаем исключение
            throw new IllegalArgumentException("Список не может быть пустым");
        }
        // Инициализируем результат нулем
        int result = 0;
        // Проходим по всем значениям в списке
        for (String value : values) {
            // Получаем длину текущего значения
            int length = value.length();
            // Сравниваем ее с результатом
            if (length > result) {
                // Если длина больше результата, обновляем результат
                result = length;
            }
        }
        // Возвращаем результат
        return result;
    }

}
