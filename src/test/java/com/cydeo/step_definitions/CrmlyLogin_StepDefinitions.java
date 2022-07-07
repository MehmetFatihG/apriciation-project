package com.cydeo.step_definitions;

import com.cydeo.pages.CrmlyLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CrmlyLogin_StepDefinitions {

    CrmlyLoginPage crmlyLoginPage = new CrmlyLoginPage();

    @Given("User is on the login page of Crmly app")
    public void user_is_on_the_login_page_of_crmly_app() {
        String url = ConfigurationReader.getProperty("crmlyUrl");
        Driver.getDriver().get(url);
    }

    @When("User enters username and password and click login button")
    public void userEntersUsernameAndPasswordAndClickLoginButton() {
        crmlyLoginPage.login("hr58@cybertekschool.com","UserUser");
    }

    @Then("User see the CRM logo on the main page")
    public void user_see_the_crm_logo_on_the_main_page() {
        Assert.assertTrue(crmlyLoginPage.crmLogo.isDisplayed());
    }



}
