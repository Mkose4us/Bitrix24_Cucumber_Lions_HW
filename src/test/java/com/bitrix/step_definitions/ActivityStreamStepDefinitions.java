package com.bitrix.step_definitions;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Pages;
import com.github.javafaker.Faker;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class ActivityStreamStepDefinitions {
    public static String itemName;

    Pages pages = new Pages();

    @When("user clicks {string} on the top menu")
    public void user_clicks_on_the_top_menu(String string) {
        switch (string) {
            case "MESSAGE" :
                break;
            case "TASK":
                BrowserUtils.waitForClickablility(pages.activityStreamPage().topMenu_Task,2000);
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
       // BrowserUtils.waitForVisibility(pages.activityStreamPage().activityStreamTaskList.get(0),10);
        String actualTask=pages.activityStreamPage().activityStreamTaskList.
                get(0).getText().trim();
        System.out.println("Actual Task NAme Added is : " + actualTask);
        Assert.assertEquals(expectedTask,actualTask);

    }

    @When("user clicks Checklist")
    public void user_clicks_Checklist() {
        BrowserUtils.waitForStaleElement(pages.activityStreamPage().openchecklistButton);
        pages.activityStreamPage().openchecklistButton.click();

    }

    @Then("verify that Checklist window is displayed")
    public void verify_that_Checklist_window_is_displayed() {
        BrowserUtils.waitForStaleElement(pages.activityStreamPage().checklistPane);
        Assert.assertTrue(pages.activityStreamPage().checklistPane.isDisplayed());
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


    @Then("user enters a checklist item")
    public void user_enters_a_checklist_item(){
        Faker faker = new Faker();
        itemName = faker.funnyName().name().trim();
        System.out.println("Item Name produced : " + itemName);
        pages.activityStreamPage().checklistInputElement.sendKeys(itemName.trim(), Keys.ENTER);

    }


    @Then("verify that checklist item is added to the CheckList")
    public void verify_that_checklist_item_is_added_to_the_CheckList() {

        Assert.assertEquals(itemName, pages.activityStreamPage().checklistItems.get(pages.activityStreamPage().checklistItems.size()-1).getText().trim());

    }






}
