package exercise4.TopDown;

import java.util.ArrayList;

public class TokenizerTopDown {

	public static ArrayList<String> tokenize(String phrase, char separator) {

		// Added this 'if' statement in to handle null inputs during debugging
		if (phrase == null)
			return null;

		ArrayList<String> terms = new ArrayList<String>();

		int position = -1;

		do {

			// Stub here using the built in method of java
			position = phrase.indexOf(separator);

			if (position != -1) {

				String term = phrase.substring(0, position);

				terms.add(term);

				phrase = phrase.substring(position + 1, phrase.length());

			}
			// Added this else if statement in to debug
			else if (position == -1) {
				terms.add(phrase);
			}

		} while (position != -1);

		return terms;
	}

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

		/** Buggy version */
		// for (int i = 0; i < phrase.length(); ++i)
		// if (phrase.charAt(phrase.length() - 1) == key)
		// return i;

		if (phrase == null)
			return -1;

		for (int i = 0; i < phrase.length(); ++i)
			// Changed this from if (phrase.charAt(phrase.length() - 1) == key)
			if (phrase.charAt(i) == key)
				return i;

		return -1;
	}

}
