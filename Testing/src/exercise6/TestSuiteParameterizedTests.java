package exercise6;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import exercise5.IndexOfParameterizedTest;
import exercise5.TokenizerIntegrationParameterizedTest;

@RunWith(Suite.class)
@SuiteClasses({ IndexOfParameterizedTest.class, TokenizerIntegrationParameterizedTest.class })
public class TestSuiteParameterizedTests {

}
