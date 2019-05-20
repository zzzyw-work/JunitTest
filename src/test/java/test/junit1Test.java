package test;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class junit1Test extends TestCase {

    @Before
    public void setUp() throws Exception {
    }
     @Test
    void standardAssertions(){
        assertEquals(2, 2);
    }

    @After
    public void tearDown() throws Exception {
    }
}