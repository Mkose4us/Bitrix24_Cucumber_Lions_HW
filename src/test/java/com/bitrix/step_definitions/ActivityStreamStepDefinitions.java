package com.bitrix.step_definitions;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivityStreamStepDefinitions {

    Pages pages = new Pages();

    @When("user clicks {string} on the top menu")
    public void user_clicks_on_the_top_menu(String string) {
        switch (string) {
            case "MESSAGE" :
                break;
            case "TASK":
                pages.activityStreamPage().topMenu_Task.click();
                BrowserUtils.waitForStaleElement(pages.activityStreamPage().taskTitleInput);
                break;
            case "EVENT" :

            case "POLL" :

            case "MORE" :

        }
    }

    @When("enters a task name")
    public void enters_a_task_name() {
        pages.activityStreamPage().taskTitleInput.sendKeys("Sample Task Title");
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        switch (string){
            case "SEND":
                pages.activityStreamPage().sendButton.click();
        }
    }

    @Then("verify that the new task listed on activity stream")
    public void verify_that_the_new_task_listed_on_activity_stream() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user clicks Checklist")
    public void user_clicks_Checklist() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("verify that Checklist window is displayed")
    public void verify_that_Checklist_window_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user clicks Deadline field and selects a date")
    public void user_clicks_Deadline_field_and_selects_a_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("verify that selected date displayed on Deadline field.")
    public void verify_that_selected_date_displayed_on_Deadline_field() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }




}
