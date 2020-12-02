package epsi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for MultiplicationTest.
 */
public class MultiplicationTest {

    /**
     * Test to multiply two numbers.
     */
    @Test
    public void shouldMulTwoNumbers()
    {
        assertEquals("2 * 3 should be 6", 6, Multiplication.mul(2, 3));
    }
}
