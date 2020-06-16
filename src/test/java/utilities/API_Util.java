package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.mocklab.customerModel.ResponseBody;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class API_Util {


    private static ResponseBody responseBody;

    // In this method we provide end point as resource it will return us the response as POJO utilizing
    // from Jackson library object mapper class
    public static void hitGET(String resource) {

        String uri = Config.getProperty("baseURL") + resource;
        Response response = RestAssured.get(uri);



        ObjectMapper objectMapper = new ObjectMapper();

        try {
            responseBody = objectMapper.readValue(response.asString(), ResponseBody.class);
        } catch (Exception j) {
            j.printStackTrace();
        }
    }

    public static ResponseBody getResponseBody() {
        return responseBody;
    }


}
