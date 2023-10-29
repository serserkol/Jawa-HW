// BigTruck - это подкласс Truck. Он наследует все свойства и методы класса Truck.
class BigTruck extends Truck {
    // Конструктор класса BigTruck.
    BigTruck(Product[] products) {
        super(products); // Вызов конструктора суперкласса (Truck) для инициализации массива продуктов.
    }

    @Override
    public void loadProducts() {
        System.out.println("Большой грузовик загружен продуктами.");
        // Реализация метода загрузки продуктов для большого грузовика.
    }
}
