package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class LoopExamplesTest {

    @Test
    public void testSumNumbers() {
        Assert.assertEquals("Sum from 1 to 5 should be 15", 15, LoopExamples.sumNumbers(5));
        Assert.assertEquals("Sum from 1 to 10 should be 55", 55, LoopExamples.sumNumbers(10));
        Assert.assertEquals("Sum from 1 to 0 should be 0", 0, LoopExamples.sumNumbers(0)); // Edge case for zero limit
    }

    @Test
    public void testCountDivisibles() {
        Assert.assertEquals("Count of numbers divisible by 2 from 1 to 10 should be 5", 5, LoopExamples.countDivisibles(10, 2));
        Assert.assertEquals("Count of numbers divisible by 3 from 1 to 9 should be 3", 3, LoopExamples.countDivisibles(9, 3));
        Assert.assertEquals("Count of numbers divisible by 5 from 1 to 50 should be 10", 10, LoopExamples.countDivisibles(50, 5));
        Assert.assertEquals("Count of numbers divisible by 1 from 1 to 5 should be 5", 5, LoopExamples.countDivisibles(5, 1)); // Testing with divisor as 1
        Assert.assertEquals("Count of numbers divisible by 6 from 1 to 12 should be 2", 2, LoopExamples.countDivisibles(12, 6));
        Assert.assertEquals("Count of numbers divisible by 0 from 1 to 10 should throw exception", IllegalArgumentException.class, Assert.assertThrows(IllegalArgumentException.class, () -> LoopExamples.countDivisibles(10, 0)).getClass()); // Edge case for zero divisor
    }
}