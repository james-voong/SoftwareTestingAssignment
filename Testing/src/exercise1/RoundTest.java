package exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoundTest {

	@Test
	public void RoundingPositiveDoubleDown() {
		double x = 0.4;
		double y = Round.roundHalfDown(x);
		System.out.println("y= " + y);
		assertTrue(y == 0);
	}

	@Test
	public void RoundingPositiveDoubleUp() {
		double x = 0.6;
		double y = Round.roundHalfDown(x);
		System.out.println("y= " + y);
		assertTrue(y == 1);
	}

	@Test
	public void RoundingPositiveDoubleDownFromMidpoint() {
		double x = 0.5;
		double y = Round.roundHalfDown(x);
		System.out.println("y= " + y);
		assertTrue(y == 0);
	}

	@Test
	public void RoundingNegativeDoubleDown() {
		double x = -0.4;
		double y = Round.roundHalfDown(x);
		System.out.println("y= " + y);
		assertTrue(y == 0);
	}

	@Test
	public void RoundingNegativeDoubleUp() {
		double x = -0.6;
		double y = Round.roundHalfDown(x);
		System.out.println("y= " + y);
		assertTrue(y == -1);
	}

	@Test
	public void RoundingNegativeDoubleDownFromMidpoint() {
		double x = -0.5;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 0);
	}
	//
	// @Test
	// public void RoundingZero() {
	// double x = 0;
	// double y = Round.roundHalfDown(x);
	// assertTrue(y == 0);
	// }
	//
	// @Test
	// public void RoundToZero() {
	// double x = 0.49999999999999994;
	// double y = Round.roundHalfDown(x);
	// assertTrue(y == 0);
	// }
	//
	// @Test
	// public void RoundToZeroFromMidpoint() {
	// double x = 0.5;
	// double y = Round.roundHalfDown(x);
	// assertTrue(y == 0);
	// }

}
