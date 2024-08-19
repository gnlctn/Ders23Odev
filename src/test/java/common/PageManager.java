package common;
import driver.DriverFactory;
import pages.AddRecordPage;
import pages.ButtonClickPage;

public class PageManager {
    public AddRecordPage addRecord;
    public ButtonClickPage buttonPage;


    public PageManager(){
        DriverFactory.setupDriver();
        buttonPage = PageFactory.buildElementsButtonsPage();
        addRecord = PageFactory.buildAddRecordTest();
    }
}
