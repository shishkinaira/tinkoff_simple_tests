package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class VerifyHeaderComponent {
    SelenideElement headerBlock = $("div [role='navigation']");
    public VerifyHeaderComponent checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }
}
