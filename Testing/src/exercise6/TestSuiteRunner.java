package exercise6;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestSuiteRunner {
	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(TestSuiteParameterizedTests.class);

		if (result.getFailures().isEmpty())
			System.out.println("\nNo failures");

		else
			for (Failure failure : result.getFailures()) {

				System.out.println("\n" + failure.toString());

				// System.err.println( "\n" + failure.getTrace() );
			}
	}
}
