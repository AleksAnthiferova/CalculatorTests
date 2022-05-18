import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowNumbersTest extends BaseTest {

    @Test(dataProvider = "doubleNumbersForTest", groups = "simpleOperationGroup")
    public void exponentiationDoubleNumbers(double a, double b, double expectedResult) {
        double result = calculator.pow(a, Math.floor(b));
        Assert.assertEquals(expectedResult, Math.floor(result), "Incorrect result of operation!");
    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2, 1.2, 2.0},
                {10.8, 2.5, 116.0},
                {2.7, 6.2, 387.0},
                {20.3, 0.0, 1.0},
                {-3.8, 2.6, 14.0},
                {2.9, 1.2, 2.0},
        };
    }
}
