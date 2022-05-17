import java.util.ArrayList;

public class Dealership implements ITransact{
    private ArrayList<Car> stock;
    private double till;

    public Dealership(double till) {
        this.stock = new ArrayList<>();
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public double getTill() {
        return till;
    }

    public void addCar(Car car){
        this.stock.add((car));
    }

    public void removeCar(Car car){
        this.stock.remove(car);
    }

    public void reduceMoney(double amount){
        this.till -= amount;
    }

    public void increaseMoney(double amount){
        this.till += amount;
    }

    public void sellCar(Car car){
        if (stock.contains(car)){
            removeCar(car);
            increaseMoney(car.getPrice());
        }

    }


    public void buyCar(Car car) {
        addCar(car);
        reduceMoney(car.getPrice());
    }
}
