import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PositiveMethodTest extends BaseTest {

    @Test(dataProvider = "longNumbersForTest")
    public void positiveNumbers(long a, boolean expectedResult) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");

    }

    @DataProvider(name = "longNumbersForTest", parallel = true)
    public Object[][] valuesForLongNumbers() {
        return new Object[][]{
                {-5, false},
                {105, true},
                {0, false},
                {20, true},
                {-3, false},
                {2, true}
        };
    }
}
