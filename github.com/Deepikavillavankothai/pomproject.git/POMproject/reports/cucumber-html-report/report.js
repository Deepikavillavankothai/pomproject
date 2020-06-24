$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Orangelogin.feature");
formatter.feature({
  "line": 1,
  "name": "To validate Orangehrem App",
  "description": "",
  "id": "to-validate-orangehrem-app",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To validate login OrangeHrm Application",
  "description": "",
  "id": "to-validate-orangehrem-app;to-validate-login-orangehrm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "to launch the browser and anvigate to url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click loginbutton",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "take screenshot of the loginpage",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHrmlogin_steps.to_launch_the_browser_and_anvigate_to_url()"
});
formatter.result({
  "duration": 27356603900,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHrmlogin_steps.enter_username_and_password()"
});
formatter.result({
  "duration": 2074448800,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHrmlogin_steps.click_loginbutton()"
});
formatter.result({
  "duration": 8961659700,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHrmlogin_steps.take_screenshot_of_the_loginpage()"
});
formatter.result({
  "duration": 1349261200,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHrmlogin_steps.close_the_browser()"
});
formatter.result({
  "duration": 2296970500,
  "status": "passed"
});
});