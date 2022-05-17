import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyresTest {

    Tyres tyre;

    @Before
    public void before(){
        tyre = new Tyres("Avon");
    }

    @Test
    public void getBrand(){
        assertEquals("Avon", tyre.getBrand());
    }
}
