import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultNumbersTest extends BaseTest {

    @Test(dataProvider = "longNumbersForTest", groups = "simpleOperationGroup")
    public void multiplicationLongNumbers(long a, long b, long expectedResult) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @Test(dataProvider = "doubleNumbersForTest", groups = "simpleOperationGroup")
    public void multiplicationDoubleNumbers(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @DataProvider(name = "longNumbersForTest", parallel = true)
    public Object[][] valuesForLongNumbers() {
        return new Object[][]{
                {2, 2, 4},
                {10, 5, 50},
                {256, -6, -1536},
                {0, 0, 0},
                {-1, -1, 1},
                {2, -1, -2},
        };
    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2.5, 2.5, 6.0},
                {10.8, 15.2, 164.0},
                {256, -6.3, -1613.0},
                {0.0, 0.0, 0.0},
                {-3.8, -2.5, 9.0},
                {2.9, -1.2, -4.0},
        };
    }
}
