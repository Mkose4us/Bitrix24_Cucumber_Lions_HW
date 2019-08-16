Feature: As a user I should be able to create a task from activity stream.

Background:
     When  user clicks "TASK" on the top menu
     And   enters a task name

Scenario:  Verify that user can create new task by clicking on task on activity stream.
     And   user clicks "SEND" button
     Then  verify that the new task listed on activity stream

Scenario:  Verify that user can upload a file and image or link or add checklist regarding to new task.
     And   user clicks Checklist
     Then  verify that Checklist window is displayed

Scenario:  Verify that user should be able to set up a deadline for new task
     And   user clicks Deadline field and selects a date
     Then  verify that selected date displayed on Deadline field.