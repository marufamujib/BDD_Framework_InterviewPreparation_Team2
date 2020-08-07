$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/features/Homepage.feature");
formatter.feature({
  "name": "Explore Cigna Home Page",
  "description": "  As a customer I want to explore Cigna.com to search different services",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Insurance available in Cigna",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am at Cigna Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.StepDefinition.i_am_at_Cigna_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Individual and Family Plans",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.StepDefinition.i_click_on_Individual_and_Family_Plans()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see All Health Insurance for Individuals and Family",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.StepDefinition.i_should_see_All_Health_Insurance_for_Individuals_and_Family()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});