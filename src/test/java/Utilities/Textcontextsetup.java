package Utilities;

import PageElements.PageObjectManager;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Textcontextsetup {
    public DriverManager driverManager;
    public PageObjectManager pageObjectManager;
    public Textcontextsetup () throws IOException {
        driverManager=new DriverManager();
        WebDriver driver = driverManager.Driveropen();
        pageObjectManager = new PageObjectManager(driver);
    }
}
