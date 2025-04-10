package AutomationQA.Automationdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
    protected WebDriver driver;  // Make it accessible to subclasses

    // Constructor to initialize WebDriver
    public base() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver"); // Update the path
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Method to quit the driver
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}