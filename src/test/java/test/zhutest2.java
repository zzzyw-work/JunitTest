package test;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class zhutest2 extends TestCase{



    @Before
    public void testBefore(){
        System.out.println("Before");
    }
    @After
    public void testAfter(){
        System.out.println("After");
    }
    @Test
    public void test002(){
        System.out.println("test002");
    }

    @Test
    void standardAssertions() {
        assertEquals(2, 2);
    }
    @Test(expected = ArithmeticException.class)
    public void test003(){
        System.out.println("test003");
        int result = 3 / 0;
    }
    @Test(timeout = 2000)
    public void test001() throws Exception{
        Thread.sleep(1900);
        System.out.println("test001");
    }
    @Test(timeout = 1000, expected = ArrayIndexOutOfBoundsException.class)
    public void test004(){
        System.out.println("test004");
        int[] array = new int[3];
        int a = array[3];
    }
}
