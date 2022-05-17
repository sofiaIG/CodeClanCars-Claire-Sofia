import java.util.ArrayList;

public class Customer {

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
}
