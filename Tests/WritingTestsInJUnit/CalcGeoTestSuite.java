package WritingTestsInJUnit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({CalculationsTest.class, GeometryTest.class})
public class CalcGeoTestSuite {
}
