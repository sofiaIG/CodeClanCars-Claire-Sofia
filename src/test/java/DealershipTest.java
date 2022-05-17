import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
     Dealership dealership;
     PetrolCar petrolCar;
     Tyres tyre;
     Customer customer;

     @Before
    public void before(){
         customer = new Customer(50000);
         tyre = new Tyres("Avon");
         dealership = new Dealership(24004);
         petrolCar = new PetrolCar(tyre, 1000, "green");
     }

     @Test
    public void hasTill(){
         assertEquals(24004, dealership.getTill(), 0.0);
     }

     @Test
    public void emptyStock(){
         assertEquals(0, dealership.getStock().size());
     }

     @Test
    public void canBuyCar(){
         dealership.buyCar(petrolCar);
         assertEquals(1, dealership.getStock().size());
         assertEquals(23004, dealership.getTill(), 0.0);
     }

     @Test
    public void canSellCar(){
         dealership.buyCar(petrolCar);
         dealership.sellCar(petrolCar);
         assertEquals(0, dealership.getStock().size());
         assertEquals(24004, dealership.getTill(), 0.0);

     }
}
