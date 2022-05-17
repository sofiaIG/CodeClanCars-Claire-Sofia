public abstract class Car {

//    private EngineType engine;
    private Tyres tyres;
    private double price;
    private String colour;

    public Car(Tyres tyres, double price, String colour) {
//        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }


    public Tyres getTyres() {
        return tyres;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
