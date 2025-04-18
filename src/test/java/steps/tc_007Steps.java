package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.tc_007Page;
import org.junit.Assert;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page mobilePage;

    @Given("I access the application from a mobile device")
    public void i_access_the_application_from_a_mobile_device() {
        // Setup mobile emulation
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=375,812"); // iPhone X dimensions
        driver = new ChromeDriver(options);
        driver.get("https://example.com"); // Replace with actual URL
        mobilePage = new tc_007Page(driver);
    }

    @Then("the interface should adapt correctly to the screen size")
    public void the_interface_should_adapt_correctly_to_the_screen_size() {
        Assert.assertTrue(mobilePage.isInterfaceAdapted());
    }

    @When("I perform basic navigation actions")
    public void i_perform_basic_navigation_actions() {
        mobilePage.navigateThroughPage();
    }

    @Then("all elements should display correctly and be interactive")
    public void all_elements_should_display_correctly_and_be_interactive() {
        Assert.assertTrue(mobilePage.areElementsInteractive());
        driver.quit();
    }
}