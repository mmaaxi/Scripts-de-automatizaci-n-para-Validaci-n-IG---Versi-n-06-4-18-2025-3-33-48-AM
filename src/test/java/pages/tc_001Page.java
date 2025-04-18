import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc_001Page {

    private WebDriver driver;

    @FindBy(id = "username_field_id")
    private WebElement usernameField;

    @FindBy(id = "password_field_id")
    private WebElement passwordField;

    @FindBy(id = "login_button_id")
    private WebElement loginButton;

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
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
}