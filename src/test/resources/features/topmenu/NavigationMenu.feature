@navigation
Feature: Navigation menu options
  As user I want to use left menu for navigation

  Background:
    Given user is on the landing page



  Scenario: Login as hr and navigate to the Calendar
    When user logs in as a "hr"
    Then user navigates to "Calendar"
    And user verifies that "Calendar" page name is displayed


  Scenario: Login as hr and navigate to the Calendar
    When user logs in as a "hr"
    Then user navigates to "Tasks"
    And user verifies that "My tasks" page name is displayed

  Scenario: Login as hr and navigate to the Activity Stream
    When user logs in as a "hr"
    Then user navigates to "Activity Stream"
    And user verifies that "Activity Stream" page name is displayed








#  Scenario: Login as driver and navigate to the Vehicle Odometer
#    Then user navigates to "Fleet" and "Vehicle Odometer"
#    And user verifies that "Vehicles Odometers" page name is displayed


