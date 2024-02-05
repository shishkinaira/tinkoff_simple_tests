package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.VerifyFooterComponent;
import pages.components.VerifyHeaderComponent;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends TestBase {
    VerifyHeaderComponent verifyHeaderComponentHP = new VerifyHeaderComponent();
    VerifyFooterComponent verifyFooterComponentHP = new VerifyFooterComponent();
    private final SelenideElement
            recomendedProducts = $(byText("Рекомендуемые продукты")),
            trustOfClients = $(byText("Нам доверяют более 38 млн клиентов")),
            searchForm = $(byText("Поиск по ответам на вопросы"));

    @Step("Открываем страницу")
    public HomePage openPage() {
        open(baseUrl);
        return this;
    }

    @Step("Проверяем что хедер присутствует на странице")
    public HomePage checkHeaderBlockExists() {
        verifyHeaderComponentHP.checkHeaderBlockExists();
        return this;
    }

    @Step("Проверяем что футер присутствует на странице")
    public HomePage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    @Step("Проверяем что блок доверия клиентв присутствует на странице")
    public HomePage checktrustOfClientsBlockExists() {
        trustOfClients.should(exist);
        return this;
    }

    @Step("Проверяем что строка поиска присутствует на странице")
    public HomePage checkSearchFormExists() {
        searchForm.should(exist);
        return this;
    }

    @Step("Проверяем что футер присутствует на странице")
    public HomePage checkFooterExists() {
        verifyFooterComponentHP.checkFooterBlockExists();
        return this;
    }
}
