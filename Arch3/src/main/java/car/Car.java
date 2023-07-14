package car;

import car.engine.Engine;
import car.transmission.Transmission;

/**
 * Класс для описания абстрактного автомобиля
 */

public abstract class Car implements IFuelFilling {
    protected String brand, model, bodyType, color;
    protected Engine engine;
    protected Transmission transmission;

    protected float fuelTank;


    /**
     * Конструктор для создания автомобиля
     *
     * @param brand        - Марка автомобиля
     * @param model        - Модель
     * @param bodyType     - Тип кузова
     * @param color        - Цвет
     * @param transmission - Коробка передач
     * @param engine       - Двигатель
     */
    public Car(String brand, String model, String bodyType, String color, Transmission transmission, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.transmission = transmission;
        this.engine = engine;
        this.fuelTank = 0;
    }

    /**
     * Метод для движения автомобиля
     */
    public void drive() {
        if (this.fuelTank > 0) {
            engine.start();
        }
    }

    /**
     * Метод для переключения передач
     */
    public void changeGear(int mode) {
        transmission.changeGear(mode);
    }

    /**
     * Метод для переключения фар
     */
    public void switchHeadlights() {

    }

    /**
     * Метод для переключения дворников
     */
    public void switchWipes() {

    }

    /**
     * Метод заправки топливом
     */
    public void refuel() {
        this.fuelTank = 1;
        System.out.println("Бак полон");
    }
}
