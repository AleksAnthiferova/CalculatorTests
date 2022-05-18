import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosinusTest extends BaseTest {

    @Test(dataProvider = "doubleNumbersForTest", groups = "geometricsOperationGroup")
    public void cosinusCalculation(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");

    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {5, 0.28366218546323},
                {105.8, 0.5283416107977321},
                {2.7, -0.9040721420170612},
                {20.3, 0.12006191504242673},
                {-3.8, -0.7909677119144168},
                {2.9, -0.9709581651495905}
        };
    }
}
