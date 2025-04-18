package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;
    
    By firstNameField = By.id("firstName");
    By lastNameField = By.id("lastName");
    By emailField = By.id("email");
    By submitButton = By.id("submit");
    By confirmationMessage = By.id("confirmationMessage");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void fillForm(String firstName, String lastName, String email) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void verifyConfirmationMessage() {
        String message = driver.findElement(confirmationMessage).getText();
        if (!message.contains("processed successfully")) {
            throw new AssertionError("Confirmation message not displayed correctly");
        }
    }
}