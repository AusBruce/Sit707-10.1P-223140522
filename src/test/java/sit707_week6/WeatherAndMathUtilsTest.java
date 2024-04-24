package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {

    @Test
    public void testStudentIdentity() {
        String studentId = "s223140522";
        Assert.assertNotNull("Student ID is null", studentId);
    }

    @Test
    public void testStudentName() {
        String studentName = "yuheng wang";
        Assert.assertNotNull("Student name is null", studentName);
    }

    @Test
    public void testFalseNumberIsEven() {
        Assert.assertFalse("Expected false, but was true", WeatherAndMathUtils.isEven(3));
    }

    @Test
    public void testTrueNumberIsEven() {
        Assert.assertTrue("Expected true, but was false", WeatherAndMathUtils.isEven(4));
    }

    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("Expected CANCEL", "CANCEL", WeatherAndMathUtils.weatherAdvice(71, 7));
        Assert.assertEquals("Expected CANCEL", "CANCEL", WeatherAndMathUtils.weatherAdvice(46, 5));
    }

    @Test
    public void testWarnWeatherAdvice() {
        Assert.assertEquals("Expected WARN", "WARN", WeatherAndMathUtils.weatherAdvice(46, 3.5));
        Assert.assertEquals("Expected WARN", "WARN", WeatherAndMathUtils.weatherAdvice(40, 4.1));
    }

    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("Expected ALL CLEAR", "ALL CLEAR", WeatherAndMathUtils.weatherAdvice(44, 3));
        Assert.assertEquals("Expected ALL CLEAR", "ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30, 2));
    }

    @Test
    public void testIllegalArguments() {
        try {
            WeatherAndMathUtils.weatherAdvice(-1, 0);
            Assert.fail("IllegalArgumentException expected for negative wind speed");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }

        try {
            WeatherAndMathUtils.weatherAdvice(0, -1);
            Assert.fail("IllegalArgumentException expected for negative precipitation");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }

    @Test
    public void testIsPrime() {
        Assert.assertTrue("2 should be prime", WeatherAndMathUtils.isPrime(2));
        Assert.assertFalse("1 should not be prime", WeatherAndMathUtils.isPrime(1));
        Assert.assertFalse("4 should not be prime", WeatherAndMathUtils.isPrime(4));
        Assert.assertTrue("3 should be prime", WeatherAndMathUtils.isPrime(3));
        Assert.assertFalse("16 should not be prime", WeatherAndMathUtils.isPrime(16));
        Assert.assertTrue("13 should be prime", WeatherAndMathUtils.isPrime(13));
    }

    @Test
    public void testEdgeCasesForIsEven() {
        Assert.assertTrue("0 should be even", WeatherAndMathUtils.isEven(0));
        Assert.assertFalse("Negative odd should be false", WeatherAndMathUtils.isEven(-3));
        Assert.assertTrue("Negative even should be true", WeatherAndMathUtils.isEven(-2));
    }

    @Test
    public void testEdgeCasesForIsPrime() {
        Assert.assertFalse("0 should not be prime", WeatherAndMathUtils.isPrime(0));
        Assert.assertTrue("5 should be prime", WeatherAndMathUtils.isPrime(5));
        Assert.assertFalse("Negative number should not be prime", WeatherAndMathUtils.isPrime(-5));
    }


@Test
public void testEvenNumberZero() {
    Assert.assertTrue("0 should be even", WeatherAndMathUtils.isEven(0));
}

@Test
public void testEvenNegativeNumber() {
    Assert.assertTrue("Negative even number should return true", WeatherAndMathUtils.isEven(-2));
    Assert.assertFalse("Negative odd number should return false", WeatherAndMathUtils.isEven(-3));
}

@Test
public void testPrimeZeroAndNegative() {
    Assert.assertFalse("0 should not be prime", WeatherAndMathUtils.isPrime(0));
    Assert.assertFalse("Negative numbers should not be prime", WeatherAndMathUtils.isPrime(-1));
    Assert.assertFalse("Negative numbers should not be prime", WeatherAndMathUtils.isPrime(-5));
}

@Test
public void testPrimeNumbers() {
    Assert.assertTrue("7 should be prime", WeatherAndMathUtils.isPrime(7));
    Assert.assertTrue("11 should be prime", WeatherAndMathUtils.isPrime(11));
    Assert.assertFalse("10 should not be prime", WeatherAndMathUtils.isPrime(10));
    Assert.assertFalse("15 should not be prime", WeatherAndMathUtils.isPrime(15));
}

@Test
public void testBoundaryWeatherAdvice() {
    Assert.assertEquals("Should be WARN at boundary", "WARN", WeatherAndMathUtils.weatherAdvice(WeatherAndMathUtils.CONCERNING_WINDSPEED, 3.9));
    Assert.assertEquals("Should be CANCEL at boundary", "CANCEL", WeatherAndMathUtils.weatherAdvice(WeatherAndMathUtils.CONCERNING_WINDSPEED + 0.1, WeatherAndMathUtils.CONCERNING_RAINFALL + 0.1));
    Assert.assertEquals("Should be ALL CLEAR at boundary", "ALL CLEAR", WeatherAndMathUtils.weatherAdvice(WeatherAndMathUtils.CONCERNING_WINDSPEED - 0.1, WeatherAndMathUtils.CONCERNING_RAINFALL - 0.1));
}
}

