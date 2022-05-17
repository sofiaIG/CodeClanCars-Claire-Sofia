import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before(){
        customer = new Customer(12900);
    }

    @Test
    public void hasMoney(){
        assertEquals(12900, customer.getMoney(), 0.0);
    }

    @Test
    public void hasEmptyVehicles(){
        assertEquals(0, customer.getCarsOwned().size());
    }
}
