package car.transmission;

/**
 * Класс для описания абстрактной коробки передач
 */
public abstract class Transmission {
    protected String transmissionType;

    /**
     * Конструктор для создания коробки передач
     *
     * @param transmissionType - тип коробки передач
     */
    public Transmission(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    /**
     * Метод для переключения передач
     */
    public abstract void changeGear(int mode);

}
