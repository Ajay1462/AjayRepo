package Utilities;

import org.apache.poi.xwpf.usermodel.BreakType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DriverManager {
    public WebDriver driver;
    public WebDriver Driveropen() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        String URL = properties.getProperty("URL");
        String browser = properties.getProperty("browser");
        if (browser != null && browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        } else if (browser != null && browser.equalsIgnoreCase("firefox")) {
            System.out.println("⚠ Firefox setup not implemented yet.");
        } else {
            throw new RuntimeException("❌ Browser is not defined correctly in global.properties");
        }

        // ✅ Safe check for URL
        if (URL != null && !URL.isEmpty()) {
            System.out.println("🌐 Launching URL: " + URL);
            driver.get(URL);
        } else {
            throw new RuntimeException("❌ URL is missing or empty in global.properties");
        }
        return driver;
    }

}
