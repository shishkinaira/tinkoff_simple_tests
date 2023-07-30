package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PaymentsPage extends TestBase {
    private final SelenideElement
            headerBlock = $(".aboCbR8Wx"),
            recomendedProducts = $(byText("Сервисы для массовых выплат")),
            footer =  $("footer");


    public PaymentsPage openPage() {
        open("corporate/payout/");
        return this;
    }

    public PaymentsPage checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }

    public PaymentsPage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    public PaymentsPage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
