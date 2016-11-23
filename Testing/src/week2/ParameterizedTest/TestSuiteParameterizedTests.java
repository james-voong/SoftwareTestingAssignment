package week2.ParameterizedTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IndexOfParameterizedTest.class, TokenizerIntegrationParameterizedTest.class })
public class TestSuiteParameterizedTests {

}
