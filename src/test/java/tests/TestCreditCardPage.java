package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CreditCardPage;

import static io.qameta.allure.Allure.step;


public class TestCreditCardPage extends TestBase {
    final CreditCardPage creditCardPage = new CreditCardPage();

    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница Кредитные карты содержит основные блоки")
    public void creditCardPageBlocksExists() {
        step("Открываем страницу Кредитные карты", () -> {
            creditCardPage.openPage();
        });

        step("Проверяем, что блок с типами карт присутствует на странице", () -> {
            creditCardPage.checkCardsTypeBlockExists();
        });

        step("Проверяем, что блок с шагами доставки присутствует на странице", () -> {
            creditCardPage.checkDeliveryStepsBlockExists();
        });

        step("Проверяем, что блок Настройте свою карту присутствует на странице", () -> {
            creditCardPage.checkSetCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта ALL Airlines присутствует на странице", () -> {
            creditCardPage.checkAllAirlinesCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта ALL Airlines Premium присутствует на странице", () -> {
            creditCardPage.checkAllAirlinesPremiumCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта ALL Games присутствует на странице", () -> {
            creditCardPage.checkAllGamesCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта S7 — Tinkoff присутствует на странице", () -> {
            creditCardPage.checkCreditTinkoffCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта S7 — Tinkoff Premium присутствует на странице", () -> {
            creditCardPage.checkCreditTinkoffPremiumCardBlockExists();
        });
        step("Проверяем, что футер присутствует на странице", () -> {
            creditCardPage.checkFooterExists();
        });
    }
}
