// Базовый класс для всех продуктов. Он абстрактный, потому что мы не создаем экземпляры
// Product напрямую.
abstract class Product {
    String name; // Общее свойство для всех продуктов - имя.

    // Конструктор класса Product.
    Product(String name) {
        this.name = name; // Инициализация имени продукта.
    }
}