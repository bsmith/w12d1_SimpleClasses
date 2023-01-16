import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {
    private Printer thePrinter;

    @Before
    public void setUp() {
        thePrinter = new Printer(250, 1000);
    }

    @Test
    public void canPrintShortDocument() {
        boolean retval = thePrinter.print(10, 2);
        assertTrue(retval);
        assertEquals(230, thePrinter.getSheetsOfPaperLeft());
    }

    @Test
    public void cannotPrintLongDocument() {
        boolean retval = thePrinter.print(100, 3);
        assertFalse(retval);
        assertEquals(250, thePrinter.getSheetsOfPaperLeft());
    }
}
