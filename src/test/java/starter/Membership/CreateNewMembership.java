package starter.Membership;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewMembership {
    protected static String url = " ";
    @Step("user is on the membership POST page endpoint")
    public String userIsOnTheProductPostPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint with post data")
    public void UserMakesArequestWithTheOstMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","New Product");
        requestBody.put("email","launching tomorrow");
        requestBody.put("phone",400);
        requestBody.put("birth_day","2026-03-30");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheProductPostPageEndpoint());
    }
    @Step("the system responds with the status code 200")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
