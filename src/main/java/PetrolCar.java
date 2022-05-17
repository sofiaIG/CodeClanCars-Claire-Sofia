public class PetrolCar extends Car{

    private EngineType engineType;

    public PetrolCar(Tyres tyres, double price, String colour) {
        super(tyres, price, colour);
        this.engineType = EngineType.PETROL;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
