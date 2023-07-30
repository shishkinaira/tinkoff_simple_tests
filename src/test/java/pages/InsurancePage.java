package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InsurancePage extends TestBase {
    private final SelenideElement
            headerBlock = $(".aboCbR8Wx"),
            recomendedProducts = $(byText("Страховые продукты Тинькофф")),
            footer =  $("footer");


    public InsurancePage openPage() {
        open("insurance/");
        return this;
    }

    public InsurancePage checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }

    public InsurancePage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    public InsurancePage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
