$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/API_Automation_features.feature");
formatter.feature({
  "name": "Customer Data Validation",
  "description": "  Acceptance Criteria  From Requirements\n\n  1.id [int] greater than zero\n  2.name [String] can\u0027t be longer than 10 alpha characters\n  3.last [String] can\u0027t be longer than 10 alpha characters\n  4.age [int] must be integer and 0 \u003e age \u003c 120\n  5.gender [String] must only be F or M\n  6.response time must be less than 500ms",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Testing Customer Information",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User hits API",
  "keyword": "When "
});
formatter.match({
  "location": "Customer_Step_Defs.user_hits_API()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies response status codes should be 200",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_response_status_codes_should_be(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies customer\u0027s id is greater than 0",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_customer_s_id_is_greater_than(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies customer\u0027s name is less or equal than 10 alpha characters",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_customer_s_name_is_less_or_equal_than_alpha_characters(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies customer\u0027s last is less or equal than 10 alpha characters",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_customer_s_last_is_less_or_equal_than_alpha_characters(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies customer\u0027s age is between 0 and 120",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_customer_s_age_is_between_and(Integer,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies customer\u0027s gender is either \"F\" or \"M\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_customer_s_gender_is_either_or(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verifies response time is less than 500 ms",
  "keyword": "Then "
});
formatter.match({
  "location": "Customer_Step_Defs.user_verifies_response_time_is_less_than_ms(Integer)"
});
formatter.result({
  "status": "passed"
});
});