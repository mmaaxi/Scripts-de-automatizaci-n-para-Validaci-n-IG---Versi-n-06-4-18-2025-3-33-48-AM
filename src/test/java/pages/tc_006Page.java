package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_006Page {

    WebDriver driver;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "username")
    WebElement usernameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "loginButton")
    WebElement loginButton;

    @FindBy(id = "accountLockedMessage")
    WebElement accountLockedMessage;

    public void navigateToLoginPage() {
        driver.get("https://example.com/login");
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public boolean isAccountLockedDueToFailedAttempts() {
        // logic to verify if the account is locked
        // assuming it could be verified by some UI element or state change
        return accountLockedMessage.isDisplayed();
    }

    public boolean isAccountLockedMessageDisplayed() {
        return accountLockedMessage.isDisplayed();
    }
}