package com.bitrix.utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    //we don't want to access these variables outside
    private static final Logger logger = LogManager.getLogger();


//    @FindBy(css = "div[class='loader-mask shown']")
//    @CacheLookup
//    protected WebElement loaderMask;

    @FindBy(id = "pagetitle")
    protected WebElement pageSubTitle;


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String getPageSubTitle() {
        //ant time we are verifying page name, or page subtitle, loader mask appears
        //waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForStaleElement(pageSubTitle);
        return pageSubTitle.getText();
    }

    public void navigateToModule(String module) {
        //String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
        String moduleLocator = "//ul//li//a[@title='" + module + "']";

        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
            BrowserUtils.scrollToElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
            logger.error("Failed to click on :: "+module);
            logger.error(e);
            BrowserUtils.waitForStaleElement(Driver.getDriver().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.getDriver().findElement(By.xpath(moduleLocator)),  Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
        }
    }



    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
//    public void waitUntilLoaderScreenDisappear() {
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Integer.valueOf(ConfigurationReader.getProperty("SHORT_WAIT")));
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
//        } catch (Exception e) {
//            logger.error("Loader mask doesn't present.");
//            System.out.println("Loader mask doesn't present.");
//        }
//    }




}
