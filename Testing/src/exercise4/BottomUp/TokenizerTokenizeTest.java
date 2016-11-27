package exercise4.BottomUp;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class TokenizerTokenizeTest {

	String phrase;

	@Before
	public void initialise() {
		phrase = "Hello,world";
	}

	/**
	 * indexOf was tested earlier so will not be repeating the tests, have
	 * replaced the indexOf method with my debugged version
	 */

	/** Give a null phrase and assert that the returned ArrayList is empty */
	@Test
	public void NullInputGiven() {
		ArrayList<String> myArray = Tokenizer.tokenize(null, 'a');
		assertTrue(myArray == null);
	}

	/**
	 * Give an empty string as phrase and assert that it returns an empty array
	 */
	@Test
	public void EmptyStringGiven() {
		ArrayList<String> myArray = Tokenizer.tokenize("", 'a');
		assertTrue(myArray.size() == 1);
		assertTrue(myArray.get(0).equals(""));
	}

	/** Test to see if it can handle two words */
	@Test
	public void TokenizeOnTwoWords() {
		ArrayList<String> myArray = Tokenizer.tokenize(phrase, ',');
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
		ArrayList<String> myArray = Tokenizer.tokenize(myString, ',');
		// System.out.println(myArray);
		assertTrue(myArray.size() == 3);
		assertTrue(myArray.get(0).equals("Hello"));
		assertTrue(myArray.get(1).equals("there"));
		assertTrue(myArray.get(2).equals("world"));

	}

	/** Only one word in the arrayList */
	@Test
	public void TokenizeOnOneWord() {
		ArrayList<String> myArray = Tokenizer.tokenize("Hello", ',');
		// System.out.println(myArray);
		assertTrue(myArray.size() == 1);
		assertTrue(myArray.get(0).equals("Hello"));
	}

	/** Test for case sensitivity */
	@Test
	public void TestCaseSensitivity() {
		String myString = "TEST";
		ArrayList<String> myArray = Tokenizer.tokenize(myString, 'e');
		assertTrue(myArray.size() == 1);
		assertTrue(myArray.get(0).equals("TEST"));
	}

	/** Test the connection between tokenize and indexOf */
	@Test
	public void TestIndexOfConnection() {
		int index = Tokenizer.indexOf(phrase, ',');
		assertTrue(index == 5);
	}

}
