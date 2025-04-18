package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class tc_008Page {

    WebDriver driver;

    private By dashboardData = By.cssSelector("#dashboard .data");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        // Implement login functionality
        // Example: 
        // driver.findElement(By.id("username")).sendKeys(username);
        // driver.findElement(By.id("password")).sendKeys(password);
        // driver.findElement(By.id("login-button")).click();
    }

    public boolean isDashboardDisplayed() {
        // Check if dashboard is displayed
        return driver.findElement(By.id("dashboard")).isDisplayed();
    }

    public boolean isDataDisplayed() {
        // Check if specific data is displayed on dashboard
        List<WebElement> dataElements = driver.findElements(dashboardData);
        return !dataElements.isEmpty();
    }

    public List<String> getDashboardData() {
        // Extract data from the dashboard
        List<WebElement> elements = driver.findElements(dashboardData);
        return elements.stream().map(WebElement::getText).collect(Collectors.toList());
    }
}