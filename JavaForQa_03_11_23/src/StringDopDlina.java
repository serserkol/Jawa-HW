import java.util.ArrayList;
import java.util.List;

public class StringDopDlina {
    public static List<String> filterByLength(List<String> values, int length) {
        // Создаем новый список для хранения отфильтрованных значений
        List<String> result = new ArrayList<>();
        // Проходим по всем значениям в списке
        for (String value : values) {
            // Проверяем, что длина текущего значения равна заданной длине
            if (value.length() == length) {
                // Добавляем значение в новый список
                result.add(value);
            }
        }
        // Возвращаем новый список
        return result;
    }

}
