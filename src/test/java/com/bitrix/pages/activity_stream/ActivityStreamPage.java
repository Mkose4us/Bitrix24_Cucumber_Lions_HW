package com.bitrix.pages.activity_stream;

import com.bitrix.step_definitions.ActivityStreamStepDefinitions;
import com.bitrix.utilities.BasePage;
import com.bitrix.utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ActivityStreamPage extends BasePage {

    Pages pages = new Pages();

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement topMenu_Task;

    @FindBy(css = "input[data-bx-id='task-edit-title']")
    public WebElement taskTitleInput;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    //@FindBy(css="div[id^='feed-post-contentview'] div[class='feed-task-info-text'] div:nth-child(1) a")
    @FindBy(xpath="//div[@class='feed-task-info-text']//div[1]//span//a")
    //public WebElement activityStreamTaskList;
    public List<WebElement> activityStreamTaskList;

    @FindBy(css="[data-bx-id='task-edit-toggler'][data-target='checklist']")
    public WebElement openchecklistButton;

    @FindBy(css="[data-bx-id='task-edit-checklist']")
    public WebElement checklistPane;

    //@FindBy(className="js-id-checklist-is-form-title task-checklist-field-add")
    @FindBy(xpath="//input[@type='text'][@class='js-id-checklist-is-form-title task-checklist-field-add']")
    public WebElement checklistInputElement;

    @FindBy(xpath="(//span[@class='js-id-checklist-is-i-title '])")
    public List <WebElement> checklistItems;

    @FindBy(xpath="(//input[@class='task-options-inp'][@type='text'])[1]")
    public WebElement deadLineInput;

    @FindBy(xpath="(//input[@class='task-options-inp'][@type='text'])[1]")
    public WebElement dayElement;

    @FindBy(xpath="//div[@class='bx-calendar-range']//a[@class='bx-calendar-cell' or @class='bx-calendar-cell bx-calendar-weekend']")
    public List <WebElement> dayElements;


    @FindBy(xpath="(//span[@class='bx-calendar-button-text'])[1]")
    public WebElement selectElement;


    //div[@class='bx-calendar-range']//a[.='9']

    public void selectRandomDayAndClick(){
        Random random = new Random();
        ActivityStreamStepDefinitions.selectedRandomDay = random.nextInt(30);
        dayElements.get(ActivityStreamStepDefinitions.selectedRandomDay).click();
    }

}
