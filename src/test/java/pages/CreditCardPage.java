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

public class CreditCardPage extends TestBase {
    VerifyHeaderComponent verifyHeaderComponentCCP = new VerifyHeaderComponent();
    VerifyFooterComponent verifyFooterComponentCCP = new VerifyFooterComponent();
    private final SelenideElement
            deliverySteps = $(byText("Бесплатно доставим карту уже сегодня")),
            setCard = $(byText("Настройте свою карту")),
            allAirlinesCard = $(byText("Кредитная карта ALL Airlines")),
            allAirlinesPremiumCard = $(byText("Кредитная карта ALL Airlines Premium")),
            tinkoffDriveCard = $(byText("Кредитная карта Tinkoff Drive")),
            allGamesCard = $(byText("Кредитная карта ALL Games")),
            creditTinkoffCard = $(byText("Кредитная карта S7 — Tinkoff")),
            creditTinkoPremiumffCard = $(byText("Кредитная карта S7 — Tinkoff Premium"));

    @Step("Открываем страницу")
    public CreditCardPage openPage() {
        open("cards/credit-cards/");
        return this;
    }
    @Step("Проверяем что хедер присутствует на странице")
    public CreditCardPage checkСardsTypeBlockExists() {
        verifyHeaderComponentCCP.checkHeaderBlockExists();
        return this;
    }
    @Step("Проверяем что блок Доставки присутствует на странице")
    public CreditCardPage checkDeliveryStepsBlockExists() {
        deliverySteps.should(exist);
        return this;
    }
    @Step("Проверяем что блок Кредитных карт присутствует на странице")
    public CreditCardPage checkSetCardBlockExists() {
        setCard.should(exist);
        return this;
    }
    @Step("Проверяем что блок  карт AllAirlines присутствует на странице")
    public CreditCardPage checkAllAirlinesCardBlockExists() {
        allAirlinesCard.should(exist);
        return this;
    }
    @Step("Проверяем что блок  карт AllAirlines Premium присутствует на странице")
    public CreditCardPage checkAllAirlinesPremiumCardBlockExists() {
        allAirlinesPremiumCard.should(exist);
        return this;
    }
    @Step("Проверяем что блок  карт Drive присутствует на странице")
    public CreditCardPage checkTinkoffDriveCardBlockExists() {
        tinkoffDriveCard.should(exist);
        return this;
    }
    @Step("Проверяем что блок  карт AllGames присутствует на странице")
    public CreditCardPage checkAllGamesCardBlockExists() {
        allGamesCard.should(exist);
        return this;
    }
    @Step("Проверяем что блок Credit Tinkoff карт присутствует на странице")
    public CreditCardPage checkCreditTinkoffCardBlockExists() {
        creditTinkoffCard.should(exist);
        return this;
    }
    @Step("Проверяем что блок Credit Tinkoff карт присутствует на странице")
    public CreditCardPage checkCreditTinkoffPremiumCardBlockExists() {
        creditTinkoPremiumffCard.should(exist);
        return this;
    }
    @Step("Проверяем что футер присутствует на странице")
    public CreditCardPage checkFooterExists() {
        verifyFooterComponentCCP.checkFooterBlockExists();
        return this;
    }
}
