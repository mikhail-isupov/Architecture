package car.engine;

/**
 * Класс для описания двигателя Оки
 */
public class OkaEngine extends Engine {
    public OkaEngine() {
        super("Бензин", 0.7f, 29);
    }

    @Override
    public void start() {
        System.out.println("Дыр-дыр-дыр");
    }
}
