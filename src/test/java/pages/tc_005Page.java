package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");
    private By dashboardHeader = By.id("dashboardHeader");
    private By loginPageSign = By.id("loginPageSign");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("https://example.com/login");
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isDashboardDisplayed() {
        return driver.findElement(dashboardHeader).isDisplayed();
    }

    public void waitForInactivity(WebDriverWait wait) {
        // Specific waiting mechanism or handling for inactivity period
        wait.until(driver -> isLoginPageDisplayed());
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginPageSign).isDisplayed();
    }
}