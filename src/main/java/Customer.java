import java.util.ArrayList;

public class Customer implements ITransact {

    private double money;
    private ArrayList<Car> carsOwned;

    public Customer(double money){
        this.money = money;
        this.carsOwned = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Car> getCarsOwned() {
        return carsOwned;
    }

    public void addCar(Car car){
        this.carsOwned.add((car));
    }

    public void removeCar(Car car){
        this.carsOwned.remove(car);
    }

    public void reduceMoney(double amount){
        this.money -= amount;
    }

    public void increaseMoney(double amount){
        this.money += amount;
    }

    public void buyCar(Car car){
        addCar(car);
        reduceMoney(car.getPrice());
    }

    public void sellCar(Car car){
        removeCar(car);
        increaseMoney(car.getPrice());
    }
}
