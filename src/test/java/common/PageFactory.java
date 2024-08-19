package common;
import pages.AddRecordPage;
import pages.ButtonClickPage;

public class PageFactory {
    public static AddRecordPage buildAddRecordTest() {
        return new AddRecordPage("/webtables");
    }

    public static ButtonClickPage buildElementsButtonsPage() {
        return new ButtonClickPage("/elements");
    }
}
