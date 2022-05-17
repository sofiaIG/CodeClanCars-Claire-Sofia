import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Tyres tyre;
    ElectricCar electricCar;
    PetrolCar petrolCar;

    @Before
    public void before(){
        tyre = new Tyres("Avon");
        customer = new Customer(12900);
        petrolCar = new PetrolCar(tyre, 1000, "green");
        electricCar = new ElectricCar(tyre, 2300, "yellow");
    }


    @Test
    public void hasMoney(){
        assertEquals(12900, customer.getMoney(), 0.0);
    }

    @Test
    public void hasEmptyVehicles(){
        assertEquals(0, customer.getCarsOwned().size());
    }

    @Test
    public void canBuy(){
        customer.buyCar(electricCar);
        assertEquals(1, customer.getCarsOwned().size());
        assertEquals(10600, customer.getMoney(), 0.0);
    }

    @Test
    public void canSellCar(){
        customer.addCar(petrolCar);
        customer.sellCar(petrolCar);
        assertEquals(0, customer.getCarsOwned().size());
        assertEquals(13900, customer.getMoney(), 0.0);

    }

}
