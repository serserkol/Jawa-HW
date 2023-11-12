import java.util.List;

public class StringStroka {
    public static String concatenate(List<String> values) {
        // Создаем StringBuilder для эффективного объединения строк
        StringBuilder sb = new StringBuilder();
        // Проходим по всем значениям в списке
        for (String value : values) {
            // Добавляем значение к StringBuilder
            sb.append(value);
        }
    // Возвращаем строковое представление StringBuilder
            return sb.toString();
}