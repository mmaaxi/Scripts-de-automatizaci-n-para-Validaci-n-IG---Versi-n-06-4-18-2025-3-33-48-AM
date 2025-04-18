import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_003Page {
  
    WebDriver driver;

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "usernameError")
    private WebElement usernameErrorMessage;

    @FindBy(id = "passwordError")
    private WebElement passwordErrorMessage;

    public void clearUsernameField() {
        usernameField.clear();
    }

    public void clearPasswordField() {
        passwordField.clear();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getUsernameErrorMessage() {
        return usernameErrorMessage.getText();
    }

    public String getPasswordErrorMessage() {
        return passwordErrorMessage.getText();
    }
}