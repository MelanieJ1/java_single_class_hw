import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle();
}

    @Test
    public void hasVolume100(){
        assertEquals(100, waterBottle.hasVolume());
    }

    @Test
    public void drinkMinus10(){
        waterBottle.drink();
        assertEquals(90, waterBottle.hasVolume());
    }

    @Test
    public void emptyVolumeTo0() {
        waterBottle.empty();
        assertEquals(0, waterBottle.hasVolume());
    }

    @Test
    public void fillVolumeTo100(){
        waterBottle.fill();
        assertEquals(100, waterBottle.hasVolume());
    }
}
