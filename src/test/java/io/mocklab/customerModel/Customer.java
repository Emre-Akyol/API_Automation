package io.mocklab.customerModel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@JsonIgnoreProperties(ignoreUnknown = true)   // to be able to accept responses that have non matching fields.
@JsonInclude(JsonInclude.Include.NON_DEFAULT) // with this annotation we exclude properties with default values
@Data // library that generates getters and setters with this annotation. It helps us to keep the code clean.

public class Customer {

    private int id;
    private String name;
    private String last;
    private int age;
    private String gender;

}
