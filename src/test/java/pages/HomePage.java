package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage extends TestBase {
    private final SelenideElement
            headerBlock = $(".aboCbR8Wx"),
            recomendedProducts = $(byText("Рекомендуемые продукты")),
            trustOfClients = $(byText("Нам доверяют более 30 млн клиентов")),
            qrCode = $(byTitle("qrCode")),
            footer =  $("footer");


    public HomePage openPage() {
        open(baseUrl);
        return this;
    }

    public HomePage checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }

    public HomePage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    public HomePage checktrustOfClientsBlockExists() {
        trustOfClients.should(exist);
        return this;
    }

    public HomePage checkQrCodeExists() {
        qrCode.should(exist);
        return this;
    }
    public HomePage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
