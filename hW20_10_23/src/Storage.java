// Класс для склада, где хранятся продукты после разгрузки грузовика.
class Storage {
    private Product[] products; // Массив для хранения продуктов на складе.

    // Конструктор класса Storage.
    Storage() {
        this.products = new Product[0]; // Инициализация пустого массива продуктов.
    }

    public void unloadTruck(Truck truck) {
        this.products = truck.getProducts(); // Разгрузка продуктов из грузовика на склад.
        System.out.println("Продукты разгружены на складе.");
    }

    public void listProducts() {
        System.out.println("Список продуктов на складе:"); // Вывод списка продуктов на складе.
        for (Product product : products) {
            System.out.println(product.name);
        }
    }
}
