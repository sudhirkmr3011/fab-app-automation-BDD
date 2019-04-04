$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/fab/onboarding/feature/FAB_ONBOARDING_BDD.feature");
formatter.feature({
  "line": 2,
  "name": "Appium",
  "description": "",
  "id": "appium",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginProfile"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Background: lalala"
    },
    {
      "line": 5,
      "value": "#Given login we will do common"
    }
  ],
  "line": 9,
  "name": "Personal details",
  "description": "",
  "id": "appium;personal-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I click on checkbox",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "i click on fullname",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "i click on next button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef_personaldetails.i_click_on_checkbox()"
});
formatter.result({
  "duration": 11754437116,
  "status": "passed"
});
formatter.match({
  "location": "stepdef_personaldetails.i_click_on_fullname()"
});
formatter.result({
  "duration": 10842106147,
  "status": "passed"
});
formatter.match({
  "location": "stepdef_personaldetails.i_click_on_next_button()"
});
formatter.result({
  "duration": 966931516,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Contact details",
  "description": "",
  "id": "appium;contact-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "i click city",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef_contactdetails.i_click_city()"
});
formatter.result({
  "duration": 18444142200,
  "status": "passed"
});
});