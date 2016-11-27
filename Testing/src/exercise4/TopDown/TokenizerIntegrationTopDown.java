package exercise4.TopDown;

import java.util.ArrayList;

public class TokenizerIntegrationTopDown {

	public static ArrayList<String> tokenize(String phrase, char separator) {

		if (phrase == null)
			return null;

		ArrayList<String> terms = new ArrayList<String>();

		int position = -1;

		do {

			// Stub here, using the built in indexOf method of Java
			position = phrase.indexOf(separator);

			if (position != -1) {

				String term = phrase.substring(0, position);

				terms.add(term);

				phrase = phrase.substring(position + 1, phrase.length());

			}

			if (position == -1) {
				terms.add(phrase);
			}

		} while (position != -1);

		return terms;
	}

}
