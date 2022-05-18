import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NegativeMethodTest extends BaseTest {

    @Test(dataProvider = "longNumbersForTest")
    public void negativeNumbers(long a, boolean expectedResult) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");

    }

    @DataProvider(name = "longNumbersForTest", parallel = true)
    public Object[][] valuesForLongNumbers() {
        return new Object[][]{
                {-5, true},
                {105, false},
                {0, false},
                {20, false},
                {-3, true},
                {2, false}
        };
    }
}
