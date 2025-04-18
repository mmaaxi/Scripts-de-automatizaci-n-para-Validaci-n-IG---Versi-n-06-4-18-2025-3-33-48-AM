package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {

    WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify the interface adapts to mobile view
    public boolean isInterfaceAdapted() {
        WebElement logo = driver.findElement(By.id("logo"));
        return logo.isDisplayed() && logo.getSize().width <= 375;
    }

    // Method to perform basic navigation actions
    public void navigateThroughPage() {
        WebElement menuButton = driver.findElement(By.id("menu-btn"));
        menuButton.click();
        WebElement homeLink = driver.findElement(By.xpath("//a[@href='/home']"));
        homeLink.click();
    }

    // Method to verify elements are interactive
    public boolean areElementsInteractive() {
        WebElement button = driver.findElement(By.id("submit-btn"));
        return button.isEnabled();
    }
}