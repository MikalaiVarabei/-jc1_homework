package homework.five.vehicle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        System.out.println("Задание 38.");
        System.out.println("Введите название автомобиля");
        String name = getInputData();
        carGarage.setVehicle(new Car(name));

        System.out.println("Введите название мотоцикла");
        name = getInputData();
        motorcycleGarage.setVehicle(new Motorcycle(name));

        System.out.println(carGarage.getVehicle().getName());
        System.out.println(motorcycleGarage.getVehicle().getName());
    }

    private static  String getInputData() {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        return data;
    }
}
