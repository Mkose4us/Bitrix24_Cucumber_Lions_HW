package com.bitrix.pages.activity_stream;

import com.bitrix.utilities.BasePage;
import com.bitrix.utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityStreamPage extends BasePage {

    Pages pages = new Pages();

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement topMenu_Task;

    @FindBy(css = "input[data-bx-id='task-edit-title']")
    public WebElement taskTitleInput;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(css="div[class^='feed-post-block']")
    public List<WebElement> activityStreamList;


    public String getTaskTitle(int index){

        return "No Title";
    }

}
