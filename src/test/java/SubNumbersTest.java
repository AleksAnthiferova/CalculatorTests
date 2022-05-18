import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubNumbersTest extends BaseTest {

    @Test(dataProvider = "longNumbersForTest", groups = "simpleOperationGroup")
    public void subtractionLongNumbers(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @Test(dataProvider = "doubleNumbersForTest", groups = "simpleOperationGroup")
    public void subtractionDoubleNumbers(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @DataProvider(name = "longNumbersForTest", parallel = true)
    public Object[][] valuesForLongNumbers() {
        return new Object[][]{
                {2, 2, 0},
                {10, 5, 5},
                {256, -6, 262},
                {0, 0, 0},
                {-1, -1, 0},
                {2, -1, 3},
        };
    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2.5, 2.5, 0},
                {10.8, 15.2, -4.399999999999999},
                {256.7, -6.8, 263.5},
                {0.0, 0.0, 0.0},
                {-3.8, -2.5, -1.2999999999999998},
                {2.9, -1.2, 4.1},
        };
    }
}
