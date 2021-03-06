import cucumber.api.Delimiter;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import java.util.List;

public class MyStepdefs {

    private MatrixCalc calc;
    private int dimension;
    private int[][] operand1;
    private int[][] operand2;
    private boolean result;
    private int[][] arrayResult;

    @Given("^I have my matrix calculator$")
    public void iHaveMyMatrixCalculator(){
        this.calc = new MatrixCalc();
    }

    @When("^I have entered (\\d+) as matrix dimension$")
    public void iHaveEnteredAsMatrixDimension(int arg) {
        this.dimension = arg;
    }
    
    @When("^I have entered (.+) as first operand$")
    public void iHaveEnteredAsFirstOperand(@Delimiter(",") List<Integer> arg) {
        this.operand1 = prs(arg);
    }

    @When("^I have entered (.+) as second operand$")
    public void iHaveEnteredMatrixAsSecondOperand(@Delimiter(",") List<Integer> arg){
        this.operand2 = prs(arg);
    }

    @When("^I press 'CompareMatrix'$")
    public void iPressCompareMatrix(){
        this.result = calc.CompareMatrix(operand1, operand2);
    }

    @Then("^The result should be \"([^\"]*)\"$")
    public void theResulShouldBe(String expected) {
        Assert.assertEquals(Boolean.parseBoolean(expected), this.result);
    }

    public int[][] prs(List<Integer> arg) {
        int i = 0;
        int j = 0;
        int[][] operand = new int[dimension][dimension];
        for (Integer elem: arg) {
            if (j == this.dimension) { j = 0; i++;}
            operand[i][j] = elem;
            j++;
        }
        return operand;
    }

    @Then("^The result of Trans should be (.+)$")
    public void theResultOfTransShouldBe(@Delimiter(",") List<Integer> res) {
        Assert.assertArrayEquals(prs(res), this.arrayResult);
    }

    @And("^I press 'Trans'$")
    public void iPressTrans() {
        this.arrayResult = calc.Trans(operand1);
    }

    @And("^I press 'TwiceTrans'$")
    public void iPressTwiceTrans() {
        this.arrayResult = calc.Trans(calc.Trans(operand1));
    }

    @And("^I press 'Add'$")
    public void iPressAdd(){
        this.arrayResult = calc.Add(operand1, operand2);
    }

    @Then("^The result of Add should be (.+)$")
    public void theResultOfAddShouldBe(@Delimiter(",") List<Integer> res) {
        Assert.assertArrayEquals(prs(res), this.arrayResult);
    }

    @And("^I press 'Sub'$")
    public void iPressSub() {
        this.arrayResult = calc.Sub(operand1, operand2);
    }

    @Then("^The result of Sub should be (.+)$")
    public void theResultOfSubShouldBe(@Delimiter(",") List<Integer> res) {
        Assert.assertArrayEquals(prs(res), this.arrayResult);
    }

    @And("^I press 'MulNum'$")
    public void iPressMulNum()  {
        this.arrayResult = calc.MulNum(operand1, operand2[0][0]);
    }

    @Then("^The result of MulNum should be (.+)$")
    public void theResultOfMulNumShouldBe(@Delimiter(",") List<Integer> res)  {
        Assert.assertArrayEquals(prs(res), this.arrayResult);
    }

    @And("^I press 'Mul'$")
    public void iPressMul() {
        this.arrayResult = calc.Mul(operand1, operand2);
    }

    @Then("^The result of Mul should be (.+)$")
    public void theResultOfMulShouldBe(@Delimiter(",") List<Integer> res) {
        Assert.assertArrayEquals(prs(res), this.arrayResult);
    }
}
