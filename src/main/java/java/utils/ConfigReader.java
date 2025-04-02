package java.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties locators = new Properties();

    static {
        try (FileInputStream fileInput = new FileInputStream("C:\\Users\\hasan.sardar\\eclipse-workspace\\Automationdemo\\src\\main\\java\\AutomationQA\\Automationdemo\\locators.properties")) {
            locators.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get locator by key
    public static String getLocator(String key) {
        return locators.getProperty(key);
    }
}
