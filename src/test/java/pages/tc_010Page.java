package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {
    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By errorMessage = By.id("errorMessage");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLogin() {
        driver.get("https://example.com/login");
    }

    public void enterCredentials(String user, String pass) {
        driver.findElement(usernameField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(pass);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateInput() {
        // Logic to ensure SQL injection does not occur
    }

    public void verifyErrorMessage() {
        String expectedError = "Invalid credentials. Please try again.";
        String actualError = driver.findElement(errorMessage).getText();
        if (!actualError.equals(expectedError)) {
            throw new AssertionError("Error message does not match expected.");
        }
    }
}