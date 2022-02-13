package StepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utility.BrowserFactory;

public class RegistrationSteps {

    WebDriver driver;
    @Given("user is on mercury tourist website")
    public void user_is_on_mercury_tourist_website() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        driver = BrowserFactory.returnDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
    }

    @And("provide contact details")
    public void provide_contact_details() {
        // Write code here that turns the phrase above into concrete actions
        ///throw new io.cucumber.java.PendingException();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideContactDetails();
    }

    @And("provide mailing information")
    public void provide_mailing_information() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideMailingDetails();
    }

    @And("provide user information")
    public void provide_user_information() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.provideUserDetails();
    }

    @Then("click on submit button")
    public void click_on_submit_button() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.ClickSubmit();
    }
  }