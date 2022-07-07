package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage {

    public ActivityStreamPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamButton;

    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreModule;

    @FindBy(xpath = "//span[text()='Appreciation']")
    public WebElement appreciationModule;

}
