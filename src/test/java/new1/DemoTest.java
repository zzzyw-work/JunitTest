package new1;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest extends TestCase {

    @Test
    public void testadd1() {
        assertEquals(1,Demo.add1());
    }

    @Test
    public void testadd2() {
        assertEquals(2,Demo.add2());
    }
}