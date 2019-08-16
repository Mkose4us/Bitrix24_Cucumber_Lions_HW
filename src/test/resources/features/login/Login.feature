Feature: As user I want to login under different roles

 @hr
 Scenario: Login as a hr
    Given user is on the landing page
    Then user logs in as a "hr"
    And user verifies that "Activity Stream" page name is displayed


# @negative
# Scenario: Verify warning message for invalid credentials
#    Given user is on the landing page
#    Then user logs in with "wrong" username and "wrong" password
#    And user verifies that "Invalid user name or password." warning message is displayed
#
# @driver
# Scenario: Login as a driver
#   Given user is on the landing page
#   Then user logs in as a driver
#   And user verifies that "Quick Launchpad" page name is displayed
