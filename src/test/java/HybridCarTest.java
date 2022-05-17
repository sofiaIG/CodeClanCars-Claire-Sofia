import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Tyres tyre;

    @Before
    public void before(){
        tyre = new Tyres("Michelin");
        hybridCar = new HybridCar(tyre, 23800, "blue" );
    }

    @Test
    public void hasEngine(){
        assertEquals(EngineType.HYBRID, hybridCar.getEngineType());
    }

    @Test
    public void hasTyre(){
        assertEquals(tyre, hybridCar.getTyres());
    }

    @Test
    public void hasPrice(){
        assertEquals(23800, hybridCar.getPrice(), 0.0);
    }

    @Test
    public void hasColour(){
        assertEquals("blue", hybridCar.getColour());
    }
}
