package car.transmission;

public class OkaTransmission extends Transmission {
    public OkaTransmission() {
        super("Ручная коробка передач");
    }

    @Override
    public void changeGear(int mode) {
        System.out.println("Хрррясть");
    }
}
