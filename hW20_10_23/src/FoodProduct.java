// FoodProduct - это подкласс Product. Он наследует все свойства и методы класса Product.
class FoodProduct extends Product {
    // Конструктор класса FoodProduct.
    FoodProduct(String name) {
        super(name); // Вызов конструктора суперкласса (Product) для инициализации имени.
    }
}
