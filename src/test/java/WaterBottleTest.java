import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WaterBottleTest {
    private WaterBottle theBottle;

    @Before
    public void setUp() {
        theBottle = new WaterBottle();
    }

    /* The JUnit FAQ suggests not testing very simple accessors that are "too simple to break":
        https://junit.org/junit4/faq.html#best_3
        `volumeFilledPercentage` is acting as getter, but named with a bit more abstraction.
        However, it gets called everywhere so gets tested as part of that.
     */

    @Test
    public void startsFilled() {
        assertEquals(100, theBottle.volumeFilledPercentage());
    }

    @Test
    public void drinkingReducesVolumeFilledBy10Percent() {
        theBottle.drink();
        assertEquals(90, theBottle.volumeFilledPercentage());
    }

    @Test
    public void canBeEmptied() {
        theBottle.empty();
        assertEquals(0, theBottle.volumeFilledPercentage());
    }

    @Test
    public void canBeFilledAfterEmptying() {
        theBottle.empty();
        assertEquals(0, theBottle.volumeFilledPercentage());
        theBottle.fill();
        assertEquals(100, theBottle.volumeFilledPercentage());
    }
}
