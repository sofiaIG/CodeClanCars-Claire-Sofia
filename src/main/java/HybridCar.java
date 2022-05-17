public class HybridCar extends Car{

    private EngineType engineType;


    public HybridCar(Tyres tyres, double price, String colour) {
        super(tyres, price, colour);
        this.engineType = EngineType.HYBRID;
    }

    public EngineType getEngineType() {
        return engineType;
    }
}
