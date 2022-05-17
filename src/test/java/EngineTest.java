
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(1.4);
    }

    @Test
    public void hasSize(){
        assertEquals(1.4, engine.getSize(), 0.0);
    }
}
