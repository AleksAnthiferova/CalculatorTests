import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivNumbersTest extends BaseTest {


    @Test(dataProvider = "longNumbersForTest", groups = "simpleOperationGroup")
    public void disposingLongNumbers(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @Test(dataProvider = "doubleNumbersForTest", groups = "simpleOperationGroup")
    public void disposingDoubleNumbers(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @DataProvider(name = "longNumbersForTest", parallel = true)
    public Object[][] valuesForLongNumbers() {
        return new Object[][]{
                {2, 2, 1},
                {10, 5, 2},
                {256, -6, -42},
                {5, 0, 0},
                {-1, -1, 1},
                {2, -1, -2},
        };
    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2.5, 2.5, 1.0},
                {10.8, 15.2, 0.7105263157894738},
                {256, -6, -42.666666666666664},
                {20.3, 0.0, 0.0},
                {-3.8, -2.5, 1.52},
                {2.9, -1.2, -2.4166666666666665},
        };
    }
}
