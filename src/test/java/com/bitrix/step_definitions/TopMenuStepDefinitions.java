package com.bitrix.step_definitions;

import com.bitrix.utilities.Pages;
import cucumber.api.java.en.Then;

public class TopMenuStepDefinitions {
    Pages pages = new Pages();


    @Then("user navigates to {string}")
    public void user_navigates_to(String module) {
        pages.activityStreamPage().navigateToModule(module);

    }





}
