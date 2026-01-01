package PageElements;

import io.cucumber.java.bs.A;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public AbTesting_element abTestingElement;
    public WebDriver driver;
    public PageObjectManager(WebDriver driver)
    {
        this.driver=driver;
    }
    public AbTesting_element getAbTestingElement()
    {
        abTestingElement=new AbTesting_element(driver);
        return abTestingElement;
    }
}
