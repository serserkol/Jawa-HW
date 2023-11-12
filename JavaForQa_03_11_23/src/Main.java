import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        public static List<String> removeDuplicates boolean values;
        (List<String> values) {
            // Создаем новый список для хранения уникальных значений
            List<String> result = new ArrayList<>();
            // Создаем множество для хранения уже встреченных значений
            Set<String> seen = new HashSet<>();
            // Проходим по всем значениям в списке
            for (String value : values) {
                // Проверяем, что текущее значение не содержится в множестве
                if (!seen.contains(value)) {
                    // Добавляем значение в новый список и в множество
                    result.add(value);
                    seen.add(value);
                }
            }
            // Возвращаем новый список
            return result;
        }

    }
            }