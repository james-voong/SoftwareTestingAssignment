package exercise9;

/**
 *
 * @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
 *
 */
public class ControlFlowTestingExercise {

	/**
	 * It returns the sum of integers that belong to the interval [0, n].
	 *
	 * @param n
	 *            the right endpoint of the interval
	 * @return the sum of the integers
	 */
	public static int calculateSum(int n) {

		int i = 0, sum = 0;

		// Bug was that statement was i < n
		while (i <= n) {

			// Bug was that n was used instead of i
			sum += i;

			++i;
		}

		return sum;
	}
}
