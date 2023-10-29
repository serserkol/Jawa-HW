import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создание продуктов
        TechProduct techProduct = new TechProduct("Технический продукт");
        FoodProduct foodProduct = new FoodProduct("Продукт питания");
        BookProduct bookProduct = new BookProduct("Книжный продукт");

        // Ввод типа грузовика с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип грузовика (Big, Medium, Small):");
        String truckType = scanner.nextLine();

        // Создание грузовика в зависимости от введенного типа
        Truck truck;
        switch (truckType) {
            case "Big":
                truck = new BigTruck(new Product[]{techProduct, foodProduct, bookProduct});
                break;
            case "Medium":
                truck = new MediumTruck(new Product[]{techProduct, foodProduct, bookProduct});
                break;
            case "Small":
                truck = new SmallTruck(new Product[]{techProduct, foodProduct, bookProduct});
                break;
            default:
                throw new IllegalArgumentException("Неверный тип грузовика.");
        }

        // Загрузка грузовика
        truck.loadProducts();

        // Разгрузка на складе
        Storage storage = new Storage();
        storage.unloadTruck(truck);

        // Вывод списка продуктов на складе
        storage.listProducts();
    }
}
