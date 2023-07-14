package car.engine;

/**
 * Класс для описания абстрактного ДВС
 */
public abstract class Engine {
    protected String fuel;
    protected int enginePower;
    protected float engineVol;

    /**
     * Конструктор для создания двигателя:
     *
     * @param fuel        - тип топлива
     * @param engineVol   - объем двигателя, л.
     * @param enginePower - мощность двигателя, л.с.
     */
    public Engine(String fuel, float engineVol, int enginePower) {
        this.fuel = fuel;
        this.engineVol = engineVol;
        this.enginePower = enginePower;
    }

    /**
     * Метод для запуска двигателя
     */
    public abstract void start();
}