package week2.ParameterizedTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import week2.Tokenizer.Tokenizer;

@RunWith(value = Parameterized.class)
public class IndexOfParameterizedTest {

	@Parameter(value = 0)
	public String phrase;

	@Parameter(value = 1)
	public char separator;

	@Parameter(value = 2)
	public int result;

	@Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { "James", 'm', 2 }, { "MUKESH", 'E', 3 } };
		return Arrays.asList(data);
	}

	@Test
	public void ParameterizedTestOfIndexOf() {
		assertTrue(Tokenizer.indexOf(phrase, separator) == result);

	}

}
