package Example;

public class Avto {
    // Создаем перечисление для типа автомобиля
    public enum  CarType {
        TRUCK,
        SPORTS_CAR,
        PASSENGER_CAR
    }
    // Создаем класс Автомобиль
    public class Car{
        public CarType type;
        public String model;
        private int enginePower;
        private String brand;

        // Геттеры и сеттеры для приватных полей
        public int getEnginePower() {
            return enginePower;
        }
        public void setEnginePower(int enginePower) {
            this.enginePower = enginePower;
        }
        public String getBrand() {
            return brand;
        }
        public void  setBrand(String brand){
            this.brand = brand;
        }

    }
}
