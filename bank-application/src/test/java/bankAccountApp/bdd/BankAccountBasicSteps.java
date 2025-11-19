package test.java.bankAccountApp.bdd;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import bankAccountApp.BankAccount;

public class BankAccountBasicSteps {
    private BankAccount account;
    private double observedBalance;

    @Given("I have a new bank account")
    public void i_have_a_new_bank_account() {
        // TODO: create a new bank account with initial balance 0
        account = new BankAccount();
    }

    @When("I check its balance")
    public void i_check_its_balance() {
        // TODO: read the balance from the account and store it in observedBalance
        observedBalance = account.getBalance();
    }

    @Then("the balance should be {double}")
    public void the_balance_should_be(Double expected) {
        // TODO: assert that observedBalance equals expected
        // Example: assertEquals(expected.intValue(), observedBalance);
        assertEquals(expected.doubleValue(), observedBalance, 0.00001);
    }
}
