package exercise6Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import exercise6.Tokenizer;

@RunWith(Parameterized.class)
public class ParameterizedTokenizerTokenizeTest {

	@Parameter(value = 0)
	public String phrase;

	@Parameter(value = 1)
	public char separator;

	@Parameter(value = 2)
	public ArrayList<String> result;

	@Parameters
	public static Collection<Object[]> data() {
		ArrayList<String> myArray1 = new ArrayList<String>();
		ArrayList<String> myArray2 = new ArrayList<String>();
		ArrayList<String> myArray3 = new ArrayList<String>();
		myArray1.add("James");
		myArray1.add("Mukesh");
		myArray2.add("MUKESH");
		myArray2.add("JAMES");
		myArray2.add("DEBRAH");
		myArray3.add("James");
		Object[][] data = new Object[][] { { "James,Mukesh", ',', myArray1 }, { "MUKESH!JAMES!DEBRAH", '!', myArray2 },
				{ "James", ' ', myArray3 } };
		return Arrays.asList(data);
	}

	@Test
	public void ParameterizedTestTokenizerIntegration() {
		assertTrue(Tokenizer.tokenize(phrase, separator).equals(result));
	}

}
