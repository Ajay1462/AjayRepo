package PageElements;

import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AbTesting_element {
    public WebDriver driver;
    public AbTesting_element(WebDriver driver)
    {
        this.driver=driver;
    }
    By ABLink = By.xpath("//a[normalize-space()='A/B Testing']");
    By Text = By.xpath("//h3");

    public void Click_link()
    {
        driver.findElement(ABLink).click();
    }
    public void Text_verify()
    {
        String Verify =driver.findElement(Text).getText();
        System.out.println(Verify);
    }
}
