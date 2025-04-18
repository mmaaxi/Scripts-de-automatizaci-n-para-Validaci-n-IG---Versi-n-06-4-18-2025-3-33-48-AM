package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {
    WebDriver driver;

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");
    private By errorMessage = By.id("errorMessage");

    public void navigateToLoginPage() {
        driver.get("http://tusitioweb.com/login");
    }

    public void enterUsername(String username) {
        WebElement userElement = driver.findElement(usernameField);
        userElement.clear();
        userElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.clear();
        passwordElement.sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }
}