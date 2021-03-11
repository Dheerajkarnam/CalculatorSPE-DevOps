import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class TestCases {
    private static final double DELTA = 0.00000005;

    @Test
    public void pos_squareRoot(){
        assertEquals("Positive Test Case: squareRoot, ", 10, Calculator.getSquareRoot(100), DELTA);
        assertEquals("Positive Test Case: squareRoot, ", 0, Calculator.getSquareRoot(0), DELTA);
        assertEquals("Positive Test Case: squareRoot, ",Double.NaN, Calculator.getSquareRoot(-5), DELTA);
    }

    @Test
    public void nov_squareRoot(){
        assertNotEquals("Negative Test Case: squareRoot, ", 5, Calculator.getSquareRoot(20), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 25, Calculator.getSquareRoot(-10), DELTA);
        assertNotEquals("Negative Test Case: squareRoot, ", 10, Calculator.getSquareRoot(60), DELTA);
    }

    @Test
    public void pos_factorial() {
        assertEquals("Positive Test Case: Factorial, ", 720, Calculator.getFactorial(6), DELTA);
        assertEquals("Positive Test Case: Factorial, ", 24, Calculator.getFactorial(4), DELTA);
        assertEquals("Positive Test Case: Factorial, ", Double.NaN, Calculator.getFactorial(-1), DELTA);
    }

    @Test
    public void neg_factorial() {
        assertNotEquals("Negative Test Case: Factorial,", 20, Calculator.getFactorial(1), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 180, Calculator.getFactorial(5), DELTA);
        assertNotEquals("Negative Test Case: Factorial,", 12, Calculator.getFactorial(-25), DELTA);
    }

    @Test
    public void pos_calPow() {
        assertEquals("Positive Test Case: Power, ", 16, Calculator.cal_pow(4, 2), DELTA);
        assertEquals("Positive Test Case: Power,", 0.0625, Calculator.cal_pow(4, -2), DELTA);
        assertEquals("Positive Test Case: Power, ", Double.NaN, Calculator.cal_pow(0, 0), DELTA);
    }


    @Test
    public void neg_calPow() {
        assertNotEquals("Negative Test Case: Power, ", 20, Calculator.cal_pow(6, 3), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 100, Calculator.cal_pow(2, 5), DELTA);
        assertNotEquals("Negative Test Case: Power, ", 8, Calculator.cal_pow(0, 0), DELTA);
    }

    @Test
    public void logPositive() {
        assertEquals("Positive Test Case: Log, ", 2.302585092994, Calculator.getLogarithm(10), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NEGATIVE_INFINITY, Calculator.getLogarithm(0), DELTA);
        assertEquals("Positive Test Case: Log, ", Double.NaN, Calculator.getLogarithm(-7), DELTA);
    }

    @Test
    public void logNegative(){
        assertNotEquals("Negative Test Case: Log, ", 5, Calculator.getLogarithm(4), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 26, Calculator.getLogarithm(45), DELTA);
        assertNotEquals("Negative Test Case: Log, ", 20, Calculator.getLogarithm(-4), DELTA);
    }
}
