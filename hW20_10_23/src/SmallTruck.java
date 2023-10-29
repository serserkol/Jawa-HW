// SmallTruck - это подкласс Truck. Он наследует все свойства и методы класса Truck.
class SmallTruck extends Truck {
    // Конструктор класса SmallTruck.
    SmallTruck(Product[] products) {
        super(products); // Вызов конструктора суперкласса (Truck) для инициализации массива продуктов.
    }

    @Override
    public void loadProducts() {
        System.out.println("Маленький грузовик загружен продуктами."); // Реализация метода загрузки продуктов для маленького грузовика.
    }
}
