package new1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest extends TestCase {
    private static Calculator calculator = new Calculator();

    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testadd() {
        calculator.add(3);
        calculator.add(4);
        assertEquals(7, calculator.getResult());

    }

    @Test
    public void testsubstract() {
        calculator.add(10);
        calculator.substract(4);
        assertEquals(6, calculator.getResult());
    }
}