import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {

    PetrolCar petrolCar;
    Tyres tyre;

    @Before
    public void before(){
        tyre = new Tyres("GoodYear");
        petrolCar = new PetrolCar(tyre, 12000, "red");
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, petrolCar.getTyres());
    }

    @Test
    public void hasPrice(){
        assertEquals(12000, petrolCar.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("red", petrolCar.getColour());
    }


}
