package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import com.github.javafaker.App;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationModulePage {

    public AppreciationModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='bx-b-mention-blogPostForm']")
    public WebElement addMentionButton;

    @FindBy(xpath = "//a[contains(@id, 'destDepartmentTab_mention')]")
    public WebElement employeesAndDepartmentsButton;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public WebElement emailToBeMentioned;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement linkButton;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement linkTextInput;

    @FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkUrlInput;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement saveTheLinkButton;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    //@FindBy(xpath = "//a[.='google']")
    public WebElement ifLinkButtonClickable;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-video']")
    public WebElement insertVideoButton;

    @FindBy(xpath = "//input[@id='video_idPostFormLHE_blogPostForm-source']")
    public WebElement insertVideoInput;

    @FindBy(xpath = "//input[@id='undefined']")
    public WebElement insertVideoSaveButton;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteButton;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement quoteInput;

    @FindBy(xpath = "//span[@title='Add tag']")
    public WebElement addTagButton;

    @FindBy(xpath = "//input[@name='TAGS_blogPostForm']")
    public WebElement addTagInput;

    @FindBy(xpath = "//span[@class='popup-window-button']")
    public WebElement addTagSaveButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageArea;

    @FindBy(xpath = "(//div[@class=\"feed-item-wrap\"]//td[.='quote text'])[1]")
    public WebElement quoteMessageIsDisplayed;

    @FindBy(xpath = "//a[@class='blog-p-user-name']")
    public WebElement writtenMessageIsDisplayed;

    @FindBy(xpath = "//div[@class='feed-item-wrap']//a[.='google']")
    public WebElement addedLinkIsDisplayed;

    @FindBy(xpath = " //div[@class='feed-item-wrap']//a[.='message']")
    public WebElement addedTagIsDisplayed;

    @FindBy(xpath = "//*[@id=\"post-tags-container-blogPostForm\"]/span[1]/span")
    public WebElement removeAddedTagButton;

    @FindBy(xpath = "//input[@value=',']")
    public WebElement removedAddedTag;





}
