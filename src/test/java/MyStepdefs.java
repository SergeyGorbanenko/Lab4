import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    private MatrixCalc calc;
    private int[][] operand1;
    private int[][] operand2;
    private boolean result;

    @Given("^I have my matrix calculator$")
    public void i_have_my_matrix_calculator(){

        this.calc = new MatrixCalc();

    }

    @When("^I have entered matrix(\\d+) as first operand$")
    public void i_have_entered_matrix_as_first_operand(int[][] arg1){

        this.operand1 = arg1;

    }

    @When("^I have entered matrix(\\d+) as second operand$")
    public void i_have_entered_matrix_as_second_operand(int[][] arg1){

        this.operand2 = arg1;

    }

    @When("^I press 'CompareMatrix'$")
    public void i_press_CompareMatrix(){
        this.result = calc.CompareMatrix(operand1, operand2);
    }

    @Then("^The result should be true$")
    public void the_result_should_be_true() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
