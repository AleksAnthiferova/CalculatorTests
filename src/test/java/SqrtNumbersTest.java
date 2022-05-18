import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtNumbersTest extends BaseTest {

    @Test(dataProvider = "doubleNumbersForTest", groups = "simpleOperationGroup")
    public void squareRootFromNumbers(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");
    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2, 1.4142135623730951},
                {2.5, 1.5811388300841898},
                {6.2, 2.4899799195977463},
                {0.0, 0.0},
                {-3, 1.7320508075688772},
                {2.9, 1.70293863659264},
        };
    }
}
