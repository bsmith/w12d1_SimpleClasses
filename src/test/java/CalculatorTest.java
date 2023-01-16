import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator theCalculator;

    @Before
    public void setUp() {
        theCalculator = new Calculator();
    }

    @Test
    public void canAddIntegers() {
        int actual = theCalculator.add(5, 3);
        assertEquals(8, actual);
    }

    @Test
    public void canSubtractIntegers() {
        int actual = theCalculator.subtract(8, 3);
        assertEquals(5, actual);
    }

    @Test
    public void canMultiplyIntegers() {
        int actual = theCalculator.multiply(5, 3);
        assertEquals(15, actual);
    }

    @Test
    public void canDivideNumbers() {
        double actual = theCalculator.divide(15., 2.);
        assertEquals(7.5, actual, 0.0);
    }
}
