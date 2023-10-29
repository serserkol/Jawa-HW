// MediumTruck - это подкласс Truck. Он наследует все свойства и методы класса Truck.
class MediumTruck extends Truck {
    // Конструктор класса MediumTruck.
    MediumTruck(Product[] products) {
        super(products); // Вызов конструктора суперкласса (Truck) для инициализации массива продуктов.
    }

    @Override
    public void loadProducts() {
        System.out.println("Средний грузовик загружен продуктами."); // Реализация метода загрузки продуктов для среднего грузовика.
    }
}
