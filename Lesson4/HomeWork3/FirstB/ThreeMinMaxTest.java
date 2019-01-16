package SoftServe.Lesson4.HomeWork3.FirstB;

import junit.framework.TestCase;
import junit.framework.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ThreeMinMaxTest extends TestCase {

//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void testGetMin() {
        ThreeMinMax getTest1 = new ThreeMinMax(1, 2, 3);
        int expected = 1;
        int actual = getTest1.getMin();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetMax() {
        ThreeMinMax getTest1 = new ThreeMinMax(1, 2, 3);
        int expected = 3;
        int actual = getTest1.getMax();
        assertEquals(expected, actual);
    }
}