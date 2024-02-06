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

public class AccountPage extends TestBase {
    private final VerifyHeaderComponent verifyHeaderComponentAP = new VerifyHeaderComponent();
    private final VerifyFooterComponent verifyFooterComponentAP = new VerifyFooterComponent();
    private final SelenideElement
            recomendedProducts = $(byText("Сервисы для массовых выплат"));

    @Step("Открываем страницу")
    public AccountPage openPage() {
        open("corporate/payout/");
        return this;
    }

    @Step("Проверяем что хедер присутствует на странице")
    public AccountPage checkHeaderBlockExists() {
        verifyHeaderComponentAP.checkHeaderBlockExists();
        return this;
    }

    @Step("Проверяем что блок Продукты присутствует на странице")
    public AccountPage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    @Step("проверяем что футер присутствует на странице")
    public AccountPage checkFooterExists() {
        verifyFooterComponentAP.checkFooterBlockExists();
        return this;
    }
}
