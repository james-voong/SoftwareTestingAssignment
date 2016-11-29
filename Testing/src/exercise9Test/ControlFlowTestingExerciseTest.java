package exercise9Test;

import static org.junit.Assert.*;

import org.junit.Test;

import exercise9.ControlFlowTestingExercise;

public class ControlFlowTestingExerciseTest {

	@Test
	public void BranchTesting1() {
		System.out.println("Testing branch 1 of 2 where n = 0\n");
		assertTrue(ControlFlowTestingExercise.calculateSum(0) == 0);
	}

	@Test
	public void BranchTesting2() {
		System.out.println("Testing branch 2 of 2 where n != 0\n");
		assertTrue(ControlFlowTestingExercise.calculateSum(2) == 3);
	}

	@Test
	public void StatementTesting() {
		System.out.println("Testing statement 1 of 1 where n != 0\n");
		assertTrue(ControlFlowTestingExercise.calculateSum(2) == 3);
	}

	@Test
	public void LoopTestingMinValue() {
		System.out.println("Testing Loop min. times ie. n = 0");
		assertTrue(ControlFlowTestingExercise.calculateSum(0) == 0);
	}

	@Test
	public void LoopTestingMinPlus1() {
		System.out.println("Testing Loop min. + 1 times ie. n = 1");
		assertTrue(ControlFlowTestingExercise.calculateSum(1) == 1);
	}

	@Test
	public void LoopTestingMidValue() {
		System.out.println("Testing Loop mid value of times ie. n = 3");
		assertTrue(ControlFlowTestingExercise.calculateSum(3) == 6);
	}
	
	@Test
	public void LoopTestingMaxMinus1(){
		System.out.println("Testing Loop max. - 1 times ie. n = 6");
		assertTrue(ControlFlowTestingExercise.calculateSum(6) == 21);
	}
	
	@Test
	public void LoopTestingMaxValue(){
		System.out.println("Testing Loop max. times ie. n = 7");
		assertTrue(ControlFlowTestingExercise.calculateSum(7) == 28);
	}

}
