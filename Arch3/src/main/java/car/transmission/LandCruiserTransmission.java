package car.transmission;

public class LandCruiserTransmission extends Transmission {
    public LandCruiserTransmission() {
        super("Автомат");
    }

    @Override
    public void changeGear(int mode) {
        System.out.println(String.format("Коробка передач в режиме %d", mode));
    }
}
