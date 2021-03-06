Feature: As a user I should be able to create a task from activity stream.

Background:
     Given user is on the landing page
     When  user logs in as a "hr"
     And   user clicks "TASK" on the top menu
     And   enters a "task_name"

Scenario:  Verify that user can create new task by clicking on task on activity stream.
     And   user clicks "SEND" button
     Then  verify that task "task_name" listed on activity stream
@try
Scenario:  Verify that user can upload a file and image or link or add checklist regarding to new task.
     And   user clicks Checklist
     Then  verify that Checklist window is displayed
     And   user enters a checklist item
     Then verify that checklist item is added to the CheckList

Scenario:  Verify that user should be able to set up a deadline for new task
     And   user clicks Deadline field and selects a date
     Then  verify that selected date displayed on Deadline field.

