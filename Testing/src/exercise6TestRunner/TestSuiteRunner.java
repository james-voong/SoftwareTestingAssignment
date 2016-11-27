package exercise6TestRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import exercise6Test.ParameterizedTokenizerTokenizeTestAndParameterizedTokenizerIndexOfTests;

public class TestSuiteRunner {
	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(ParameterizedTokenizerTokenizeTestAndParameterizedTokenizerIndexOfTests.class);

		if (result.getFailures().isEmpty())
			System.out.println("\nNo failures");

		else
			for (Failure failure : result.getFailures()) {

				System.out.println("\n" + failure.toString());

				// System.err.println( "\n" + failure.getTrace() );
			}
	}
}
