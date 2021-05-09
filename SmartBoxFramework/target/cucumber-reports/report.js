$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/applicationFeature/AddABoxToChart.feature");
formatter.feature({
  "name": "Smartbox Adding Gift to Chart",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a Customer I want to find a desired box and add it to the chart",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am navigated to Smartbox website",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.HomePageSteps.i_am_navigated_to_Smartbox_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I choose desired box",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.HomePageSteps.i_choose_desired_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Add To Chart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ProductDetailsSteps.i_click_on_Add_To_Chart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I accept Add To Chart pop up",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.ProductDetailsSteps.i_accept_Add_To_Chart_pop_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to place my order",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.ChartPageSteps.i_should_be_able_to_place_my_order()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});