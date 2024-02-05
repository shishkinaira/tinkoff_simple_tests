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

public class InsurancePage extends TestBase {
    VerifyHeaderComponent verifyHeaderComponentIP = new VerifyHeaderComponent();
    VerifyFooterComponent verifyFooterComponentIP = new VerifyFooterComponent();
    private final SelenideElement
            recomendedProducts = $(byText("Страховые продукты Тинькофф"));

    @Step("Открываем страницу")
    public InsurancePage openPage() {
        open("insurance/");
        return this;
    }

    @Step("Проверяем что хедер присутствует на странице")
    public InsurancePage checkHeaderBlockExists() {
        verifyHeaderComponentIP.checkHeaderBlockExists();
        return this;
    }

    @Step("Проверяем что блок рекомендаций присутствует на странице")
    public InsurancePage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    @Step("Проверяем что футер присутствует на странице")
    public InsurancePage checkFooterExists() {
        verifyFooterComponentIP.checkFooterBlockExists();
        return this;
    }
}
