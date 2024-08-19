package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class ButtonClickPage extends BasePage {
    public SelenideElement buttonsOption = $("#item-4");
    public SelenideElement clickMeButton = $x("//button[text()='Click Me']");
    public SelenideElement clickMessage = $("#dynamicClickMessage");

    public ButtonClickPage(String pageUrl) {
        super(pageUrl);
    }
    public void clickButtonsPage() {
        buttonsOption.shouldBe(Condition.visible).click();
    }
    public void clickClickMeButton() {
        clickMeButton.shouldBe(Condition.visible).click();
    }
    public String getText (){
        return clickMessage.getText();
    }
}