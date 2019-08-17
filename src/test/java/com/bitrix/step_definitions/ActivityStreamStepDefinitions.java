package com.bitrix.step_definitions;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Pages;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ActivityStreamStepDefinitions {

    Pages pages = new Pages();

    @When("user clicks {string} on the top menu")
    public void user_clicks_on_the_top_menu(String string) {
        switch (string) {
            case "MESSAGE" :
                break;
            case "TASK":
                pages.activityStreamPage().topMenu_Task.click();
                break;
            case "EVENT" :

            case "POLL" :

            case "MORE" :

        }
    }


    @When("enters a {string}")
    public void enters_a(String task_name) {
 //       BrowserUtils.waitForStaleElement(pages.activityStreamPage().taskTitleInput);
        pages.activityStreamPage().taskTitleInput.sendKeys(task_name);
    }

    @When("user clicks {string} button")
    public void user_clicks_button(String string) {
        switch (string){
            case "SEND":
                pages.activityStreamPage().sendButton.click();
        }
    }

    @Then("verify that task {string} listed on activity stream")
    public void verify_that_task_listed_on_activity_stream(String expectedTask){
        BrowserUtils.waitForStaleElement(pages.activityStreamPage().activityStreamTaskList.get(0));
        String actualTask=pages.activityStreamPage().activityStreamTaskList.
                get(0).getText().trim();
        System.out.println(actualTask);
        Assert.assertEquals(expectedTask,actualTask);

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
