package exercise10Test;

import static org.junit.Assert.*;
import org.junit.Test;
import euclideanDivision.EuclideanDivision;

/**
 * The test name describes what is being tested. Tests that fail are noted as
 * such at the end of its comment
 */
public class TestEuclideanDivision {

	/**
	 * This tests to see if the library can do Euclidean Division correctly when
	 * the integers are low and there is no expected remainder for both integers
	 * being positive
	 * 
	 * PASS
	 */
	@Test
	public void HigherIntDividedByLowerIntWithNoRemainderForBothPositiveInts() {
		int x = 6, y = 2;
		assertTrue(EuclideanDivision.divide(x, y) == 3);
		int a = 25000000, b = 50000;
		assertTrue(EuclideanDivision.divide(a, b) == 500);
	}

	/**
	 * Test to see if it divides correctly with low integers and a remainder is
	 * expected for both integers being positive
	 * 
	 * PASS
	 */
	@Test
	public void HigherIntDividedByLowerIntWithRemainderForBothPositiveInts() {
		int x = 7, y = 2;
		assertTrue(EuclideanDivision.divide(x, y) == 3);
		int a = 25000456, b = 50000;
		assertTrue(EuclideanDivision.divide(a, b) == 500);
	}

	/**
	 * This tests to see if the library can do Euclidean Division correctly when
	 * the integers are low and there is no expected remainder for both integers
	 * being negative
	 * 
	 * PASS
	 */
	@Test
	public void HigherIntDividedByLowerIntWithNoRemainderForBothNegativeInts() {
		int x = -6, y = -2;
		assertTrue(EuclideanDivision.divide(x, y) == 3);
		int a = -25000000, b = -50000;
		assertTrue(EuclideanDivision.divide(a, b) == 500);
	}

	/**
	 * Test to see if it divides correctly with low integers and a remainder is
	 * expected for both integers being negative
	 * 
	 * FAIL
	 */
	@Test
	public void HigherIntDividedByLowerIntWithRemainderForBothNegativeInts() {
		int x = -7, y = -2;
		assertTrue(EuclideanDivision.divide(x, y) == 3);
		int a = -2500056, b = -50000;
		assertTrue(EuclideanDivision.divide(a, b) == 500);
	}

	/**
	 * This tests to see if the library can do Euclidean Division correctly when
	 * the integers are low and there is no expected remainder for dividing one
	 * positive integer with a negative integer
	 * 
	 * FAIL
	 */
	@Test
	public void PositiveHigherIntDividedByLowerNegativeIntWithNoRemainder() {
		int x = 6, y = -2;
		assertTrue(EuclideanDivision.divide(x, y) == -3);
		int a = 25000000, b = -50000;
		assertTrue(EuclideanDivision.divide(a, b) == -500);
	}

	/**
	 * Test to see if it divides correctly with low integers and a remainder is
	 * expected for dividing one positive integer with a negative integer
	 * 
	 * FAIL
	 */
	@Test
	public void PositiveHigherIntDividedByNegativeLowerIntWithRemainder() {
		int x = 7, y = -2;
		assertTrue(EuclideanDivision.divide(x, y) == -3);
		int a = 25000001, b = -50000;
		assertTrue(EuclideanDivision.divide(a, b) == -500);
	}

	/**
	 * This tests to see if the library can do Euclidean Division correctly when
	 * the integers are low and there is no expected remainder for dividing one
	 * negative integer with a positive integer
	 * 
	 * FAIL
	 */
	@Test
	public void NegativeHigherIntDividedByPositiveLowerIntWithNoRemainder() {
		int x = -6, y = 2;
		assertTrue(EuclideanDivision.divide(x, y) == -3);
		int a = 25000001, b = 50000;
		assertTrue(EuclideanDivision.divide(a, b) == -500);
	}

	/**
	 * Test to see if it divides correctly with low integers and a remainder is
	 * expected for dividing one positive integer with a negative integer
	 * 
	 * FAIL
	 */
	@Test
	public void NegativeHigherIntDividedByPositiveLowerIntWithRemainderForOnePositiveIntAndOneNegativeInt() {
		int x = -7, y = 2;

		/*
		 * From what I understand of EuclideanDivision of negative numbers, the
		 * remainder must always be positive. So -7 / 2 should equal -4
		 * remainder 1
		 */
		assertTrue(EuclideanDivision.divide(x, y) == -4);
		int a = -70000, b = 200;
		assertTrue(EuclideanDivision.divide(a, b) == -400);
	}

	/**
	 * Test to see if dividing a low int with a higher int returns the correct
	 * value for positive ints
	 * 
	 * FAIL
	 */
	@Test
	public void LowerIntDividedByHigherIntForPositiveValues() {
		int x = 100, y = 1000;
		assertTrue(EuclideanDivision.divide(x, y) == 0);
	}

	/**
	 * Test to see if dividing a low int with a higher int returns the correct
	 * value for negative ints
	 * 
	 * FAIL
	 */
	@Test
	public void LowerIntDividedByHigherIntForNegativeValues() {
		int x = -100, y = -1000;
		assertTrue(EuclideanDivision.divide(x, y) == 0);
	}

	/**
	 * Test to see if dividing zero by a positive int works, expected result is
	 * zero
	 * 
	 * FAIL
	 */
	@Test
	public void DividingZeroByPositiveInt() {
		int x = 0, y = 100;
		assertTrue(EuclideanDivision.divide(x, y) == 0);
	}

	/**
	 * Test to see if dividing zero by a negative int works, expected result is
	 * zero
	 * 
	 * FAIL
	 */
	@Test
	public void DividingZeroByNegativeInt() {
		int x = 0, y = -100;
		assertTrue(EuclideanDivision.divide(x, y) == 0);
	}

	/**
	 * Test to see if dividing a positive int by zero throws an arithmetic
	 * exception
	 * 
	 * FAIL
	 */
	@Test(expected = ArithmeticException.class)
	public void DividingPositiveIntByZero() {
		int x = 100, y = 0;
		EuclideanDivision.divide(x, y);
	}

}