package com.cydeo.step_definitions;

import com.cydeo.pages.AppreciationModulePage;
import com.cydeo.pages.ActivityStreamPage;
import com.cydeo.pages.CrmlyLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AppreciationModule_StepDefinitions {

    CrmlyLoginPage crmlyLoginPage = new CrmlyLoginPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    AppreciationModulePage appreciationModulePage = new AppreciationModulePage();

    @Given("user successfully logged into crmly application")
    public void user_successfully_logged_into_crmly_application() {
        String url = ConfigurationReader.getProperty("crmlyUrl");
        Driver.getDriver().get(url);
        crmlyLoginPage.login("hr54@cybertekschool.com", "UserUser");
    }

    @When("user clicked on more dropdown module on the main page")
    public void user_clicked_on_more_dropdown_module_on_the_main_page() {
        activityStreamPage.moreModule.click();
    }

    @When("user clicked on appreciation link under the more module")
    public void user_clicked_on_appreciation_link_under_the_more_module() {
        activityStreamPage.appreciationModule.click();
    }

    @When("user clicked on add mention button")
    public void user_clicked_on_add_mention_button() {
        appreciationModulePage.addMentionButton.click();
    }
    @When("user clicked on employees and departments on the opened page")
    public void user_clicked_on_employees_and_departments_on_the_opened_page() {
        appreciationModulePage.employeesAndDepartmentsButton.click();
        BrowserUtils.sleep(3);
    }
    @Then("user should be able to add mentions about department employees")
    public void user_should_be_able_to_add_mentions_about_department_employees() {
        appreciationModulePage.emailToBeMentioned.click();
        appreciationModulePage.sendButton.click();
        BrowserUtils.sleep(2);
        Assert.assertTrue(appreciationModulePage.writtenMessageIsDisplayed.getText().equalsIgnoreCase("name"));
    }

    @When("user clicked on link button")
    public void userClickedOnLinkButton() {
        appreciationModulePage.linkButton.click();
    }
    @And("user enters {string} on the link text input")
    public void userEntersOnTheLinkTextInput(String string) {
        appreciationModulePage.linkTextInput.sendKeys(string);
    }
    @And("user enters {string} on the link url input")
    public void userEntersOnTheLinkUrlInput(String string) {
        appreciationModulePage.linkUrlInput.sendKeys(string);
    }
    @And("user click on save button")
    public void userClickOnSaveButton() {
        appreciationModulePage.saveTheLinkButton.click();
    }
    @And("user click on message send button")
    public void userClickOnMessageSendButton() {
        appreciationModulePage.sendButton.click();
    }
    @Then("user should be able to attach a link to the specified text")
    public void userShouldBeAbleToAttachALinkToTheSpecifiedText() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(appreciationModulePage.addedLinkIsDisplayed.
                getText().equalsIgnoreCase("google"));
    }

    //insert video - Failed test
    @When("user clicked on insert video button")
    public void userClickedOnInsertVideoButton() {
        appreciationModulePage.insertVideoButton.click();
    }
    @And("user enters {string} and click save button")
    public void userEntersAndClickSaveButton(String string) {
        appreciationModulePage.insertVideoInput.sendKeys(string);
        appreciationModulePage.insertVideoSaveButton.click();
    }
    @And("user enters other {string} and click save button")
    public void userEntersOtherAndClickSaveButton(String string) {
        appreciationModulePage.insertVideoInput.sendKeys(string);
        appreciationModulePage.insertVideoSaveButton.click();
    }
    @Then("user should be able to see the url on the message area")
    public void userShouldBeAbleToSeeTheUrlOnTheMessageArea() {
        Driver.getDriver().switchTo().frame(appreciationModulePage.iframe);
        Assert.assertTrue(appreciationModulePage.messageArea.getText().equalsIgnoreCase("youtube"));
        Driver.getDriver().switchTo().parentFrame();
    }

    @When("user clicked on quote button")
    public void userClickedOnQuoteButton() {
        appreciationModulePage.quoteButton.click();
    }
    @And("user write {string} on the input and click send button")
    public void userWriteOnTheInputAndClickSendButton(String string) {
        Driver.getDriver().switchTo().frame(appreciationModulePage.iframe);
        appreciationModulePage.quoteInput.sendKeys(string);
        Driver.getDriver().switchTo().parentFrame();
        appreciationModulePage.sendButton.click();
    }
    @Then("user should be able to add quotes.")
    public void userShouldBeAbleToAddQuotes() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(appreciationModulePage.quoteMessageIsDisplayed.
                getText().equalsIgnoreCase("quote text"));
    }

    @When("user enters {string} message")
    public void userEntersMessage(String string) {
        Driver.getDriver().switchTo().frame(appreciationModulePage.iframe);
        appreciationModulePage.messageArea.sendKeys(string);
        Driver.getDriver().switchTo().parentFrame();
    }
    @When("user clicked add tag button")
    public void userClickedAddTagButton() {
        appreciationModulePage.addTagButton.click();
    }
    @And("user enters {string} and click add button and send button")
    public void userEntersAndClickAddButtonAndSendButton(String string) {
        appreciationModulePage.addTagInput.sendKeys(string);
        appreciationModulePage.addTagSaveButton.click();
        appreciationModulePage.sendButton.click();
    }
    @Then("user should be able to add tags to messages")
    public void userShouldBeAbleToAddTagsToMessages() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(appreciationModulePage.addedTagIsDisplayed.
                getText().equalsIgnoreCase("message"));
    }


    @And("user enters {string} and click add button")
    public void userEntersAndClickAddButton(String string) {
        appreciationModulePage.addTagInput.sendKeys(string);
        BrowserUtils.sleep(3);
        appreciationModulePage.addTagSaveButton.click();
    }

    @And("user click on remove added tag button")
    public void userClickOnRemoveAddedTagButton() {
        BrowserUtils.sleep(3);
        appreciationModulePage.removeAddedTagButton.click();
    }
    @Then("user should be able to remove tags before sending the message")
    public void userShouldBeAbleToRemoveTagsBeforeSendingTheMessage() {
        Assert.assertTrue(appreciationModulePage.removedAddedTag.
                getAttribute("value").equalsIgnoreCase(","));
    }


}
