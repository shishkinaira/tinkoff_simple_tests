package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.VerifyFooterComponent;
import pages.components.VerifyHeaderComponent;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PaymentsPage extends TestBase {
    VerifyHeaderComponent verifyHeaderComponentPMP = new VerifyHeaderComponent();
    VerifyFooterComponent verifyFooterComponentPMP = new VerifyFooterComponent();
    private final SelenideElement
            recomendedProducts = $(byText("Сервисы для массовых выплат"));

    @Step("Открываем страницу")
    public PaymentsPage openPage() {
        open("corporate/payout/");
        return this;
    }
    @Step("Проверяем что хедер присутствует на странице")
    public PaymentsPage checkHeaderBlockExists() {
        verifyHeaderComponentPMP.checkHeaderBlockExists();
        return this;
    }
    @Step("Проверяем что блок рекомендуемых продуктов присутствует на странице")
    public PaymentsPage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }
    @Step("Проверяем что футер присутствует на странице")
    public PaymentsPage checkFooterExists() {
        verifyFooterComponentPMP.checkFooterBlockExists();
        return this;
    }
}
