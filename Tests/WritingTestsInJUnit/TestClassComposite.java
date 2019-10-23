package WritingTestsInJUnit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClassComposite extends TestCase {
    public TestClassComposite(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(CalculationsTestJUnit3.class);
        suite.addTest(CalcGeoTestSuiteJUnit3.suite());
        return suite;
    }
}
