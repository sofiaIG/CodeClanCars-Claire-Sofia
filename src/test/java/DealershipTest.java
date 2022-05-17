import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {
     Dealership dealership;

     @Before
    public void before(){
         dealership = new Dealership(24004);
     }

     @Test
    public void hasTill(){
         assertEquals(24004, dealership.getTill(), 0.0);
     }

     @Test
    public void emptyStock(){
         assertEquals(0, dealership.getStock().size());
     }
}
