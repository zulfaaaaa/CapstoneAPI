package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Login.*;
import starter.Membership.*;
public class UserSteps {
    @Steps
    Login login;
    @Steps
    CreateNewMembership createNewMembership;


    //================================ Login ========================================
    @Given("user is on Login page endpoint")
    public void userIsOnLoginPageEndpoint() {
        login.userOnLoginEndpoint();}
    @When("user requests the Login endpoint")
    public void userRequestsTheLoginEndpoint() {
        login.userRequestTheLoginEndpoint();}
    @Then("user success Login status code response 200 ok")
    public void userSuccessLoginStatusCodeResponseOk() {
        login.TheSystemresponsWithTheStatusCode200();}

    // ============================ Create New Membership ================================
    @Given("user is on the membership POST page endpoint")
    public void userIsOnTheProductPOSTPageEndpoint() {
        createNewMembership.userIsOnTheProductPostPageEndpoint();
    }
    @When("a user makes a request with the POST method on the endpoint with post data")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointWithPostData() {
        createNewMembership.UserMakesArequestWithTheOstMethode(); }
    @And("the post add new membership that was just created")
    public void thePostAddNewProdoctThatWasJustCreated() {
    }
    @Then("the system responds with the status code 201")
    public void theSystemRespondsWithTheStatusCode() {
        createNewMembership.TheSystemresponsWithTheStatusCode200();
    }



  }