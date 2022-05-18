import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TangensTest extends BaseTest {

    @Test(dataProvider = "doubleNumbersForTest", groups = "geometricsOperationGroup")
    public void tangensCalculation(double a, double expectedResult) {
        double result = calculator.tg(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");

    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2, -2.185039863261519},
                {10.8, 5.047788309886065},
                {2.7, -0.4727276291030373},
                {20.3, 8.268787029468001},
                {-3.8, -0.7735560905031258},
                {2.9, -0.24640539397196634}
        };
    }
}
