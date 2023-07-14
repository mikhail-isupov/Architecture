package car;

import car.engine.LandCruiserEngine;
import car.transmission.LandCruiserTransmission;

/**
 * Класс для описания Land Cruiser
 */
public class LandCruiserCar extends Car {
    public LandCruiserCar() {
        super("Toyota", "Land Cruiser 300", "Универсал", "Черный", new LandCruiserTransmission(), new LandCruiserEngine());
    }
}
