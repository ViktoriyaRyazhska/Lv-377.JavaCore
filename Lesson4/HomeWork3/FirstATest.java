package SoftServe.Lesson4.HomeWork3;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstATest extends TestCase {

    @Test
    public void testAreInRange() {
        assertEquals(true, FirstA.areInRange(-5f, 0, 5));
        assertEquals(false, FirstA.areInRange(-5.1f, 0, 5));
        assertEquals(false, FirstA.areInRange(-5f, 0, 5.1f));
        assertEquals(false, FirstA.areInRange(-5f, 5.1f, 5f));
    }
}