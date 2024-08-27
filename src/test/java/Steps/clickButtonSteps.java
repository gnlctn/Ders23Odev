package Steps;
import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.AssertJUnit.assertEquals;

public class clickButtonSteps extends BaseTest{
    PageManager pageManager= new PageManager();
    ScenarioContext scenarioContext= new ScenarioContext();

    @Given("Open the elements page")
    public void open_Elements_Page(){
        pageManager.buttonPage.open();
    }
    @When("Open Buttons Field")
    public void open_Buttons_Field(){
        pageManager.buttonPage.clickButtonsPage();
    }
    @When("Click ClickMe Button")
    public void click_ClickMe_Button(){
        pageManager.buttonPage.clickClickMeButton();
    }
    @Then("Click Me Text Control")
    public void clickMe_Text_Control(){
        String expectedMessage = "You have done a dynamic click";
        String actualMessage = pageManager.buttonPage.getText();
        assertEquals(expectedMessage, actualMessage);
    }
}
