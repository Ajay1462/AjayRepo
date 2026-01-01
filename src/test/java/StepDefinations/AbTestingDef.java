package StepDefinations;
import PageElements.AbTesting_element;
import PageElements.PageObjectManager;
import Utilities.Textcontextsetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbTestingDef {
    public Textcontextsetup textcontextsetup;
    public AbTesting_element abTestingElement;
    public PageObjectManager pageObjectManager;
    public AbTestingDef(Textcontextsetup textcontextsetup)
    {
        this.textcontextsetup=textcontextsetup;
        this.abTestingElement=textcontextsetup.pageObjectManager.getAbTestingElement();
    }
    @Given("I am on App page")
    public void i_am_on_app_page() {

        System.out.println("new code");
    }
    @When("i click on {string} page link")
    public void i_click_on_page_link(String string) {
        abTestingElement.Click_link();
    }
    @Then("i verify the page text")
    public void i_verify_the_page_text() {
        abTestingElement.Text_verify();
    }

}
