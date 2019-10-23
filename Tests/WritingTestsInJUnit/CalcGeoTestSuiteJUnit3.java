package WritingTestsInJUnit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalcGeoTestSuiteJUnit3 extends TestCase {
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new CalculationsTestJUnit3("testAdd"));
        suite.addTest(new GeometryTestJUnit3("testCalcCircleArea"));
        return suite;
   }
}
