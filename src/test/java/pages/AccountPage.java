package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AccountPage extends TestBase {
    private final SelenideElement
            headerBlock = $(".aboCbR8Wx"),
            recomendedProducts = $(byText("Расчетный счет на ваших условиях")),
            footer =  $("footer");


    public AccountPage openPage() {
        open("corporate/payout/");
        return this;
    }

    public AccountPage checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }

    public AccountPage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    public AccountPage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
