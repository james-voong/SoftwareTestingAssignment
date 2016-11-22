package week2.TokenizerIntegration;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TokenizerIntegrationTopDownTest {

	String phrase;

	@Before
	public void initialise() {
		phrase = "Hello,world";
	}

	/**
	 * indexOf is the built in java method
	 */

	/** Give a null phrase and assert that the returned ArrayList is empty */
	@Test
	public void NullInputGiven() {
		ArrayList<String> myArray = TokenizerIntegrationTopDown.tokenize(null, 'a');
		assertTrue(myArray == null);
	}

	/**
	 * Give an empty string as phrase and assert that it returns an empty array
	 */
	@Test
	public void EmptyStringGiven() {
		ArrayList<String> myArray = TokenizerIntegrationTopDown.tokenize("", 'a');
		assertTrue(myArray.size() == 1);
		assertTrue(myArray.get(0).equals(""));
	}

	/** Test to see if it can two words */
	@Test
	public void TokenizeOnTwoWords() {
		ArrayList<String> myArray = TokenizerIntegrationTopDown.tokenize(phrase, ',');
		// System.out.println(myArray);
		assertTrue(myArray.size() == 2);
		assertTrue(myArray.get(0).equals("Hello"));
		assertTrue(myArray.get(1).equals("world"));
	}

	/**
	 * Test to see if more than two words that require separating can be handled
	 */
	@Test
	public void TokenizeOnMoreThanTwoWords() {
		String myString = "Hello,there,world";
		ArrayList<String> myArray = TokenizerIntegrationTopDown.tokenize(myString, ',');
		// System.out.println(myArray);
		assertTrue(myArray.size() == 3);
		assertTrue(myArray.get(0).equals("Hello"));
		assertTrue(myArray.get(1).equals("there"));
		assertTrue(myArray.get(2).equals("world"));

	}

	/** Only one word in the arrayList */
	@Test
	public void TokenizeOnOneWord() {
		ArrayList<String> myArray = TokenizerIntegrationTopDown.tokenize("Hello", ',');
		// System.out.println(myArray);
		assertTrue(myArray.size() == 1);
		assertTrue(myArray.get(0).equals("Hello"));
	}

	/** Test for case sensitivity */
	@Test
	public void TestCaseSensitivity() {
		String myString = "TEST";
		ArrayList<String> myArray = TokenizerIntegrationTopDown.tokenize(myString, 'e');
		assertTrue(myArray.size() == 1);
		assertTrue(myArray.get(0).equals("TEST"));
	}

}
