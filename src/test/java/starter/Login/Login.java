package starter.Login;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Login {
    protected static String url = "128.199.206.32:8000/api/v1/admin/login";
    @Step("user is on Login page endpoint")
    public String userOnLoginEndpoint(){
        return url;
    }
    @Step("user requests the Login endpoint")
    public void userRequestTheLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("username","admin");
        requestBody.put("password","admin");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnLoginEndpoint());
    }
    @Step("user success Login status code response 200 ok")
    public void TheSystemresponsWithTheStatusCode200(){

        restAssuredThat(response -> response.statusCode(200));

    }
}

