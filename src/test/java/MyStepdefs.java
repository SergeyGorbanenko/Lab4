import cucumber.api.Delimiter;
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
        this.operand2 = prs(arg);
    }

    @When("^I have entered (.+) as second operand$")
    public void iHaveEnteredMatrixAsSecondOperand(@Delimiter(",") List<Integer> arg){
        this.operand1 = prs(arg);
    }

    @When("^I press 'CompareMatrix'$")
    public void iPressCompareMatrix(){
        this.result = calc.CompareMatrix(operand1, operand2);
    }

    @Then("^The result should be \"([^\"]*)\"$")
    public void theResultShouldBe(String expected) {
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

}
