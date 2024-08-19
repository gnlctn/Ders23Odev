package Steps;
import common.PageManager;
import common.ScenarioContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.AssertJUnit.assertEquals;

public class AllSteps extends BaseTest{
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
    @Given("Open Webtables Field")
    public void open_Webtable_Field(){
        pageManager.addRecord.open();
    }
    @When("Click Add Button")
    public void click_Add_Button(){
        pageManager.addRecord.goToRecordPage();
    }
    @When("Fill in the fields with info {string} and {string} and {string} and {string} and {string} and {string}")
    public void fill_Fields_Info(String Name, String lName, String Mail, String Age, String salaryy, String departmentName){
        pageManager.addRecord.newRecord(Name,lName,Mail,Age,salaryy,departmentName);
    }
    @When("Click Submit Button")
    public void click_Submit(){
        pageManager.addRecord.clickSubmitButton();
    }
    @When("Click Edit Record")
    public void click_Edit_Record(){
        pageManager.addRecord.clickEditRecord();
    }
    @When("Update Record Field")
    public void update_NewRecord_Field(){
        pageManager.addRecord.updateRecordField();
    }
    @When("Control Record Field After Update")
    public void control_After_Update(){
        String expectedMessage = "Duvar";
        String actualMessage = pageManager.addRecord.getlNameText();
        assertEquals(expectedMessage, actualMessage);
    }
}
