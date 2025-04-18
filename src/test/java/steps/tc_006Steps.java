package steps;

import io.cucumber.java.en.*;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_006Page;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page loginPage = PageFactory.initElements(driver, tc_006Page.class);

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("the user attempts to login with incorrect password {string}")
    public void the_user_attempts_to_login_with_incorrect_password(String password) {
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }

    @Then("the system should lock the account due to multiple failed login attempts")
    public void the_system_should_lock_the_account_due_to_multiple_failed_login_attempts() {
        assertTrue(loginPage.isAccountLockedDueToFailedAttempts());
    }

    @Given("the account is locked due to multiple failed login attempts")
    public void the_account_is_locked_due_to_multiple_failed_login_attempts() {
        // This step can just be a placeholder acknowledging the precondition
    }

    @When("the user attempts to login")
    public void the_user_attempts_to_login() {
        loginPage.enterUsername("validUsername");
        loginPage.enterPassword("anyPassword");
        loginPage.clickLoginButton();
    }

    @Then("the system should show an account locked error message")
    public void the_system_should_show_an_account_locked_error_message() {
        assertTrue(loginPage.isAccountLockedMessageDisplayed());
    }
}