package pages;
import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreditCardPage extends TestBase {
    private final SelenideElement
            cardsTypeBlock = $(byText("Все карты")),
            deliverySteps = $(byText("Бесплатно доставим карту уже сегодня")),
            setCard = $(byText("Настройте свою карту")),
            allAirlinesCard = $(byText("Кредитная карта ALL Airlines")),
            allAirlinesPremiumCard = $(byText("Кредитная карта ALL Airlines Premium")),
            tinkoffDriveCard = $(byText("Кредитная карта Tinkoff Drive")),
            allGamesCard = $(byText("Кредитная карта ALL Games")),
            creditTinkoffCard = $(byText("Кредитная карта S7 — Tinkoff")),
            creditTinkoPremiumffCard = $(byText("Кредитная карта S7 — Tinkoff Premium")),
            footer =  $("footer");


    public CreditCardPage openPage() {
        open("cards/credit-cards/");
        return this;
    }

    public CreditCardPage checkСardsTypeBlockExists() {
        cardsTypeBlock.should(exist);
        return this;
    }

    public CreditCardPage checkDeliveryStepsBlockExists() {
        deliverySteps.should(exist);
        return this;
    }

    public CreditCardPage checkSetCardBlockExists() {
        setCard.should(exist);
        return this;
    }

    public CreditCardPage checkAllAirlinesCardBlockExists() {
        allAirlinesCard.should(exist);
        return this;
    }
    public CreditCardPage checkAllAirlinesPremiumCardBlockExists() {
        allAirlinesPremiumCard.should(exist);
        return this;
    }
    public CreditCardPage checkTinkoffDriveCardBlockExists() {
        tinkoffDriveCard.should(exist);
        return this;
    }
    public CreditCardPage checkAllGamesCardBlockExists() {
        allGamesCard.should(exist);
        return this;
    }
    public CreditCardPage checkCreditTinkoffCardBlockExists() {
        creditTinkoffCard.should(exist);
        return this;
    }
    public CreditCardPage checkCreditTinkoPremiumffCardBlockExists() {
        creditTinkoPremiumffCard.should(exist);
        return this;
    }
    public CreditCardPage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
