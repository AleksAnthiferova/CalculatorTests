import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CatangensTest extends BaseTest {

    @Test(dataProvider = "doubleNumbersForTest", groups = "geometricsOperationGroup")
    public void cathanceCalculation(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(expectedResult, result, "Incorrect result of operation!");

    }

    @DataProvider(name = "doubleNumbersForTest", parallel = true)
    public Object[][] valuesForDoubleNumbers() {
        return new Object[][]{
                {2, -0.457657554360286},
                {10.8, 0.19810656442178956},
                {2.7, -2.1153830206569895},
                {20.3, 0.12093672221043263},
                {-3.8, -1.2927310795906133},
                {2.9, -4.058352716555265}
        };
    }
}
