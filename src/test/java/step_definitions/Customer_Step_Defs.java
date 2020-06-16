package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.mocklab.customerModel.ResponseBody;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.API_Util;
import utilities.Config;

import java.util.concurrent.TimeUnit;

public class Customer_Step_Defs {


    @When("User hits API")
    public void user_hits_API() {

        API_Util.hitGET("/a");
    }

    @Then("User verifies response status codes should be {int}")
    public void user_verifies_response_status_codes_should_be(Integer expectedStatusCode) {

        Response response = RestAssured.get(Config.getProperty("baseURL") + "/a");
        int actualStatusCode = response.statusCode();
        int expectedStatusValue = expectedStatusCode.intValue();

        Assert.assertEquals("Status Code Failed", expectedStatusValue, actualStatusCode);
    }


    @Then("User verifies customer's id is greater than {int}")
    public void user_verifies_customer_s_id_is_greater_than(Integer int1) {

        int actualCustomerId = API_Util.getResponseBody().getId();
        int expectedCustomerId = int1.intValue();

        Assert.assertTrue("Id verification failed", expectedCustomerId < actualCustomerId);
    }

    @Then("User verifies customer's name is less or equal than {int} alpha characters")
    public void user_verifies_customer_s_name_is_less_or_equal_than_alpha_characters(Integer int1) {

        int actualCustomerNameLength = API_Util.getResponseBody().getName().length();
        int expectedCustomerNameLength = int1.intValue();

        Assert.assertTrue("Customer's name length verification failed",
                expectedCustomerNameLength > actualCustomerNameLength);


    }

    @Then("User verifies customer's last is less or equal than {int} alpha characters")
    public void user_verifies_customer_s_last_is_less_or_equal_than_alpha_characters(Integer int1) {

        int actualCustomerLastNameLength = API_Util.getResponseBody().getLast().length();
        int expectedCustomerLastNameLength = int1.intValue();

        Assert.assertTrue("Customer's last name length verification failed",
                expectedCustomerLastNameLength > actualCustomerLastNameLength);

    }

    @Then("User verifies customer's age is between {int} and {int}")
    public void user_verifies_customer_s_age_is_between_and(Integer int1, Integer int2) {

        int actualCustomerAge = API_Util.getResponseBody().getAge();
        int expectedCustomerMinAge = int1.intValue();
        int expectedCustomerMaxAge = int2.intValue();

        Assert.assertTrue("Customer's age verification failed." +
                        "Customer age can not be less than 0 and can not be more than 120",
                expectedCustomerMinAge < actualCustomerAge &&
                        expectedCustomerMaxAge > actualCustomerAge);


    }

    @Then("User verifies customer's gender is either {string} or {string}")
    public void user_verifies_customer_s_gender_is_either_or(String string, String string2) {

        String actualCustomerGender = API_Util.getResponseBody().getGender();
        String expectedCustomerGenderForFemale = string;
        String expectedCustomerGenderForMale = string2;


        Assert.assertTrue("Customer's Gender verification failed",
                expectedCustomerGenderForFemale.equals(actualCustomerGender)
                        || expectedCustomerGenderForMale.equals(actualCustomerGender));


    }

    @Then("User verifies response time is less than {int} ms")
    public void user_verifies_response_time_is_less_than_ms(Integer int1) {

        Response response = RestAssured.get(Config.getProperty("baseURL") + "/a");
        int actualResponseTime = (int) response.getTimeIn(TimeUnit.MILLISECONDS);
        int expectedResponseTime = int1;

        Assert.assertTrue("Response Time Verification Failed",
                expectedResponseTime > actualResponseTime);


    }


}
