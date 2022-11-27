$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/login.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Launch \"EDGe\" Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.Launch_Browser(String)"
});
formatter.result({
  "error_message": "java.lang.IllegalStateException: The path to the driver executable The path to the driver executable must be set by the webdriver.edge.driver system property; for more information, see https://docs.microsoft.com/en-us/microsoft-edge/webdriver-chromium/. The latest version can be downloaded from https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/\r\n\tat org.openqa.selenium.internal.Require$StateChecker.nonNull(Require.java:311)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:135)\r\n\tat org.openqa.selenium.edge.EdgeDriverService.access$000(EdgeDriverService.java:40)\r\n\tat org.openqa.selenium.edge.EdgeDriverService$Builder.findDefaultExecutable(EdgeDriverService.java:176)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:437)\r\n\tat org.openqa.selenium.edge.EdgeDriver.\u003cinit\u003e(EdgeDriver.java:46)\r\n\tat org.openqa.selenium.edge.EdgeDriver.\u003cinit\u003e(EdgeDriver.java:42)\r\n\tat StepDefination.LoginSteps.Launch_Browser(LoginSteps.java:26)\r\n\tat ✽.Launch \"EDGe\" Browser(file:Features/login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Open URL \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Open_URL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter UserName as \"Admin\" and Password as \"admin123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.Enter_UserName_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.Click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
});