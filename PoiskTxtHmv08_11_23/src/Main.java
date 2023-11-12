// Импортируем классы для работы с файлами и исключениями
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задаем путь к папке
        String path = "C:\\Users\\user\\Documents";

        // Создаем объект File для папки
        File folder = new File(path);

        // Вызываем рекурсивную функцию для поиска и вывода текстовых файлов
        public static void findAndPrintTxtFiles findAndPrintTxtFiles(folder);

        // Определяем рекурсивную функцию, которая принимает объект File в качестве параметра
        (File file){
            // Проверяем, существует ли файл или папка
            if (file.exists()) {
                // Проверяем, является ли файл папкой
                if (file.isDirectory()) {
                    // Получаем список файлов и папок внутри папки
                    File[] files = file.listFiles();
                    // Проходим по всем элементам списка
                    for (File f : files) {
                        // Вызываем функцию рекурсивно для каждого элемента
                        findAndPrintTxtFiles(f);
                    }
                } else {
                    // Проверяем, является ли файл текстовым по расширению
                    if (file.getName().endsWith(".txt")) {
                        // Выводим имя файла
                        System.out.println("Найден текстовый файл: " + file.getName());
                        // Создаем объект Scanner для чтения содержимого файла
                        try {
                            Scanner scanner = new Scanner(file);
                            // Читаем файл построчно и выводим в консоль
                            while (scanner.hasNextLine()) {
                                String line = scanner.nextLine();
                                System.out.println(line);
                            }
                            // Закрываем сканнер
                            scanner.close();
                        } catch (FileNotFoundException e) {
                            // Обрабатываем исключение, если файл не найден
                            System.out.println("Файл не найден: " + e.getMessage());
                        }
                    }
                }
            } else {
                // Выводим сообщение, если файл или папка не существует
                System.out.println("Файл или папка не существует: " + file.getPath());
            }
        }

    }

    private static void findAndPrintTxtFiles(File folder) {
    }
}