// BookProduct - это подкласс Product. Он наследует все свойства и методы класса Product.
class BookProduct extends Product {
    // Конструктор класса BookProduct.
    BookProduct(String name) {
        super(name); // Вызов конструктора суперкласса (Product) для инициализации имени.
    }
}
