$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/activitystream/activitystream.feature");
formatter.feature({
  "name": "As a user I should be able to create a task from activity stream.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"TASK\" on the top menu",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_on_the_top_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a \"task_name\"",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.enters_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can create new task by clicking on task on activity stream.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks \"SEND\" button",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that task \"task_name\" listed on activity stream",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.verify_that_task_listed_on_activity_stream(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"TASK\" on the top menu",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_on_the_top_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a \"task_name\"",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.enters_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user can upload a file and image or link or add checklist regarding to new task.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks Checklist",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_Checklist()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.bitrix.step_definitions.ActivityStreamStepDefinitions.user_clicks_Checklist(ActivityStreamStepDefinitions.java:58)\n\tat ✽.user clicks Checklist(src/test/resources/features/activitystream/activitystream.feature:14)\n",
  "status": "pending"
});
formatter.step({
  "name": "verify that Checklist window is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.verify_that_Checklist_window_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_the_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in as a \"hr\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_as_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"TASK\" on the top menu",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_on_the_top_menu(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters a \"task_name\"",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.enters_a(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that user should be able to set up a deadline for new task",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user clicks Deadline field and selects a date",
  "keyword": "And "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.user_clicks_Deadline_field_and_selects_a_date()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat com.bitrix.step_definitions.ActivityStreamStepDefinitions.user_clicks_Deadline_field_and_selects_a_date(ActivityStreamStepDefinitions.java:70)\n\tat ✽.user clicks Deadline field and selects a date(src/test/resources/features/activitystream/activitystream.feature:18)\n",
  "status": "pending"
});
formatter.step({
  "name": "verify that selected date displayed on Deadline field.",
  "keyword": "Then "
});
formatter.match({
  "location": "ActivityStreamStepDefinitions.verify_that_selected_date_displayed_on_Deadline_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});