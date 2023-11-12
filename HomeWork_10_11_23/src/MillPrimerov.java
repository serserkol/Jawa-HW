import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MillPrimerov {

        public static void main(String[] args) {
            // Создаем лист и наполняем его 10 миллионами элементов
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10000000; i++) {
                list.add(i);
            }

            // Замеряем время выполнения различных вариантов обхода листа
            long startTime, endTime, duration;

            // 1. Перебираем for-each loop
            startTime = System.currentTimeMillis();
            for (int i : list) {
                int temp = i;
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Время выполнения for-each loop: " + duration + " мс");

            // 2. Перебираем classic for и вызываем list.size() внутри каждой итерации
            startTime = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                int temp = list.get(i);
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Время выполнения classic for с list.size(): " + duration + " мс");

            // 3. Перебираем classic for, но list.size() внутри каждой итерации присваиваем в переменную
            startTime = System.currentTimeMillis();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                int temp = list.get(i);
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Время выполнения classic for с переменной size: " + duration + " мс");

            // 4. Перебираем classic for, list.size() внутри каждой итерации присваиваем в переменную, перебираем с конца (i--)
            startTime = System.currentTimeMillis();
            size = list.size();
            for (int i = size - 1; i >= 0; i--) {
                int temp = list.get(i);
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Время выполнения classic for с переменной size и обратным порядком: " + duration + " мс");

            // 5. Тоже самое (list.size() внутри каждой итерации присваиваем в переменную) используя Iterator
            startTime = System.currentTimeMillis();
            size = list.size();
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                int temp = iterator.next();
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Время выполнения Iterator с переменной size: " + duration + " мс");

            // 6. Тоже самое (list.size() внутри каждой итерации присваиваем в переменную) используя ListIterator
            startTime = System.currentTimeMillis();
            size = list.size();
            ListIterator<Integer> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                int temp = listIterator.next();
            }
            endTime = System.currentTimeMillis();
            duration = endTime - startTime;
            System.out.println("Время выполнения ListIterator с переменной size: " + duration + " мс");
        }
    }