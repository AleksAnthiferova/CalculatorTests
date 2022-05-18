import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumNumbersTest extends BaseTest {

    @Test(dataProvider = "longNumbersForTest", groups = "simpleOperationGroup")
    public void summationLongNumbers(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @Test(dataProvider = "doubleNumbersForTest", groups = "simpleOperationGroup")
    public void summationDoubleNumbers(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2.2, 3.2, 5.4},
                {10.5, 5.3, 15.8},
                {25.6, -6, 19.6},
                {0, 0, 0},
                {-21.5, -5.7, -27.2},
                {2.6, -2.6, 0}
        };
    }


    @DataProvider(name = "longNumbersForTest", parallel = true)
    public Object[][] valuesForLongNumbers() {
        return new Object[][]{
                {2, 2, 4},
                {10, 5, 15},
                {256, -6, 250},
                {0, 0, 0},
                {-1, -1, -2},
                {2, -1, 1},
        };
    }
}

