package JUnitTestPackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestAddNumbers.class, TestAddNumbersFalse.class, TestAddStrings.class, TestAddStringsFalse.class })
public class AllTests {

}
