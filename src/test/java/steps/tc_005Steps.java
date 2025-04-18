package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc_005Page;
import utils.WebDriverManager;

public class tc_005Steps {

    private WebDriver driver;
    private tc_005Page sessionPage;

    public tc_005Steps() {
        driver = WebDriverManager.getDriver();
        sessionPage = new tc_005Page(driver);
    }

    @Given("^the user logs in with correct credentials$")
    public void the_user_logs_in_with_correct_credentials() {
        sessionPage.navigateToLoginPage();
        sessionPage.enterUsername("correctUsername");
        sessionPage.enterPassword("correctPassword");
        sessionPage.clickLoginButton();
        Assert.assertTrue(sessionPage.isDashboardDisplayed());
    }

    @When("^the user remains inactive for (\\d+) minutes$")
    public void the_user_remains_inactive_for_minutes(int minutes) {
        WebDriverWait wait = new WebDriverWait(driver, minutes * 60);
        // Simulate inactivity wait
        sessionPage.waitForInactivity(wait);
    }

    @Then("^the system logs the user out and redirects to the login page$")
    public void the_system_logs_the_user_out_and_redirects_to_the_login_page() {
        Assert.assertTrue(sessionPage.isLoginPageDisplayed());
        WebDriverManager.quitDriver();
    }
}