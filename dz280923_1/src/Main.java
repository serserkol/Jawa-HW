import Example.Avto;

public class Main {
    public static void main(String[] args) {
        Avto.Car car = new Avto.Car();
        car.type = Avto.CarType.TRUCK;
        car.model = "Model S";
        car.setEnginePower(500);
        car.setBrand("Tesla");

    }
}
