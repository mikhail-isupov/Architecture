package car.engine;

/**
 * Класс для описания двигателя Land Cruiser
 */
public class LandCruiserEngine extends Engine {
    public LandCruiserEngine() {
        super("Дизель", 3.4f, 300);
    }

    @Override
    public void start() {
        System.out.println("Брум-брум-брум");
    }
}
