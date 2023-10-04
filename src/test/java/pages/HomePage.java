package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends TestBase {
    private final SelenideElement
            headerBlock = $("div [role='navigation']"),
            recomendedProducts = $(byText("Рекомендуемые продукты")),
            trustOfClients = $(byText("Нам доверяют более 36 млн клиентов")),
            qrCode = $(byTitle("qrCode")),
            footer =  $("footer");

    @Step("Открываем страницу")
    public HomePage openPage() {
        open(baseUrl);
        return this;
    }
    @Step("Проверяем что хедер присутствует на странице")
    public HomePage checkHeaderBlockExists() {
        headerBlock.should(exist);
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
    @Step("Проверяем что QR код присутствует на странице")
    public HomePage checkQrCodeExists() {
        qrCode.should(exist);
        return this;
    }
    @Step("Проверяем что футер присутствует на странице")
    public HomePage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
