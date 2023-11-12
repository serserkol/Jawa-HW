public class Main2 {
    public static int sum(int n, int m) {
        int s = 0; // переменная для хранения суммы
        for (int i = 1; i <= n; i++) { // цикл от 1 до n
            if (i % m == 0) { // если i делится на m без остатка
                s += i; // добавляем i к сумме
            }
        }
        return s; // возвращаем сумму
    }
    public static int sum(int n, int m) {
        if (n < 1) { // базовый случай: если n меньше 1, то сумма равна 0
            return 0;
        }
        if (n % m == 0) { // если n делится на m без остатка
            return n + sum(n - 1, m); // возвращаем n плюс сумму от n - 1 до 1
        } else { // иначе
            return sum(n - 1, m); // возвращаем сумму от n - 1 до 1
        }
    }

}
