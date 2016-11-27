package exercise3Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exercise3.Tokenizer;

public class TokenizerTest {

	String phrase;

	@Before
	public void initialise() {
		phrase = "James";
	}

	/** Test to see if function can find a char at index 1 */
	@Test
	public void CharFoundAtIndexOtherThanFirstOrLast() {
		assertTrue(Tokenizer.indexOf(phrase, 'a') == 1);
	}

	/** Test where key is not expected to be found */
	@Test
	public void KeyNotFound() {
		assertTrue(Tokenizer.indexOf(phrase, 'o') == -1);
	}

	/**
	 * Test to see if correct value is returned when char is found as first
	 * letter
	 */
	@Test
	public void CharFoundAtIndex0() {
		assertTrue(Tokenizer.indexOf(phrase, 'J') == 0);
	}

	/**
	 * Test to see if correct value is returned when char is found as last
	 * letter
	 */
	@Test
	public void CharFoundAtLastIndex() {
		assertTrue(Tokenizer.indexOf(phrase, 's') == phrase.length() - 1);
	}

	/** Test for if phrase==null */
	@Test
	public void NullInputGiven() {
		assertTrue(Tokenizer.indexOf(null, 'J') == -1);
	}

	/** Test for if phrase is an empty string */
	@Test
	public void EmptyString() {
		assertTrue(Tokenizer.indexOf("", 'J') == -1);
	}

	/**
	 * Test for multiple occurances of the same character and the first index is
	 * returned
	 */
	@Test
	public void MultipleOccurancesOfChar() {
		assertTrue(Tokenizer.indexOf("Jammes", 'm') == 2);
	}

	/** Test to assure that function is case sensitive */
	@Test
	public void CaseSensitive() {
		assertTrue(Tokenizer.indexOf(phrase, 'j') == -1);
	}

}
