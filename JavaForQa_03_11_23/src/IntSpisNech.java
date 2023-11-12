import java.util.ArrayList;
import java.util.List;

public class IntSpisNech {
    public static List<Integer> filterOdd(List<Integer> values) {
        // Создаем новый список для хранения отфильтрованных значений
        List<Integer> result = new ArrayList<>();
        // Проходим по всем значениям в списке
        for (Integer value : values) {
            // Проверяем, что текущее значение нечетное
            if (value % 2 != 0) {
                // Добавляем значение в новый список
                result.add(value);
            }
        }
        // Возвращаем новый список
        return result;
    }

}
