package week1.TestingTerminology;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoundTest {

	@Test
	public void RoundingPositiveDoubleDown() {
		double x = 50.49;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 50);
	}

	@Test
	public void RoundingPositiveDoubleUp() {
		double x = 50.6;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 51);
	}

	@Test
	public void RoundingPositiveDoubleUpFromMidpoint() {
		double x = 50.5;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 50);
	}

	@Test
	public void RoundingNegativeDoubleDown() {
		double x = -50.4;
		double y = Round.roundHalfDown(x);
		assertTrue(y == -50);
	}

	@Test
	public void RoundingNegativeDoubleUp() {
		double x = -50.6;
		double y = Round.roundHalfDown(x);
		assertTrue(y == -51);
	}

	@Test
	public void RoundingNegativeDoubleUpFromMidpoint() {
		double x = -50.5;
		double y = Round.roundHalfDown(x);
		assertTrue(y == -50);
	}

	@Test
	public void RoundingZero() {
		double x = 0;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 0);
	}

	@Test
	public void RoundToZero() {
		double x = 0.49999999999999994;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 0);
	}

	@Test
	public void RoundToZeroFromMidpoint() {
		double x = 0.5;
		double y = Round.roundHalfDown(x);
		assertTrue(y == 0);
	}

}
