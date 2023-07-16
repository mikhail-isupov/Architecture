package car;

import car.engine.OkaEngine;
import car.transmission.OkaTransmission;

/**
 * Класс для описания Оки
 */
public class OkaCar extends Car {
    public OkaCar() {
        super("ВАЗ", "1111", "Седан", "Красный", new OkaTransmission(), new OkaEngine());
    }
}
