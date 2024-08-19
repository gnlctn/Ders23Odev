package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import utils.PropertyManager;

public class BasePage {
    protected String pageUrl;
    PropertyManager propertyManager = new PropertyManager();

    public BasePage(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public void open() {
        String url = propertyManager.getProperty("APP_URL") ;
        String fullUrl = url + pageUrl;
        Selenide.open(fullUrl);
    }

    public String getUrl() throws InterruptedException{
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

}
