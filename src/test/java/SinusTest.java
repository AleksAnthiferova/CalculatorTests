import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinusTest extends BaseTest {

    @Test(dataProvider = "doubleNumbersForTest", groups = "geometricsOperationGroup")
    public void sinusCalculation(double a, double expectedResult) {
        double result = calculator.sin(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");

    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {5, -0.9589242746631385},
                {105, -0.9705352835374847},
                {2.7, 0.4273798802338298},
                {20.3, 0.9927664058359071},
                {-3.8, 0.6118578909427189},
                {2.9, 0.23924932921398243}
        };
    }
}
