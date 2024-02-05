package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class VerifyFooterComponent {
    SelenideElement footer = $("footer");

    public VerifyFooterComponent checkFooterBlockExists() {
        footer.should(exist);
        return this;
    }
}
