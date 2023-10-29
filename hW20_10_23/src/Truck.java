// Базовый класс для всех грузовиков. Он абстрактный, потому что мы не создаем экземпляры Truck напрямую.
abstract class Truck {
    protected Product[] products; // Массив продуктов, которые грузовик перевозит.

    // Конструктор класса Truck.
    Truck(Product[] products) {
        this.products = products; // Инициализация массива продуктов.
    }

    public Product[] getProducts() {
        return products; // Геттер для получения массива продуктов.
    }

    public abstract void loadProducts(); // Абстрактный метод загрузки продуктов. Реализация будет в подклассах.
}
