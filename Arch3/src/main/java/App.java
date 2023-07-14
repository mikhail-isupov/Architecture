import car.Car;
import car.LandCruiserCar;
import car.OkaCar;

public class App {
    public static void main(String[] args){
        Car oka = new OkaCar();
        Car landCruiser = new LandCruiserCar();
        oka.refuel();
        landCruiser.refuel();
        oka.changeGear(1);
        landCruiser.changeGear(1);
        oka.drive();
        landCruiser.drive();
    }
}
