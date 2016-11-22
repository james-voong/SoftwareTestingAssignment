package week2.Tokenizer;

/**
 *
 * @author Dionysis Athanasopoulos <dionysiscsuoi@gmail.com>
 *
 */
public class Tokenizer {

	/**
	 * It searches for a key in a string of characters and returns the index of
	 * the search key in the string if present, otherwise -1.
	 *
	 * @param phrase
	 *            the string of characters
	 * @param key
	 *            the search key
	 * @return index of the key in the string if present; -1 otherwise
	 */
	public static int indexOf(String phrase, char key) {

		if (phrase == null)
			return -1;

		for (int i = 0; i < phrase.length(); ++i)
			if (phrase.charAt(i) == key)
				return i;

		return -1;
	}
}
