import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
    Tyres tyre;

    @Before
    public void before(){
        tyre = new Tyres("Avon");
        electricCar = new ElectricCar(tyre, 23900, "silver");
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, electricCar.getTyres());
    }

    @Test
    public void hasPrice(){
        assertEquals(23900, electricCar.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("silver", electricCar.getColour());
    }
}
