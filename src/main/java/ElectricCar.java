public class ElectricCar extends Car{

    EngineType engineType;

    public ElectricCar(Tyres tyres, double price, String colour) {
        super(tyres, price, colour);
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
