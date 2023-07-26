package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CreditCardPage;
import static io.qameta.allure.Allure.step;


public class TestCreditCardPage extends TestBase {
    CreditCardPage сreditCardPage = new CreditCardPage();
    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница Кредитные карты содержит основные блоки")
    public void homePageBlocksExists() {
        step("Открываем страницу Кредитные карты", () -> {
            сreditCardPage.openPage();
        });

        step("Проверяем, что блок с типами карт присутствует на странице", () -> {
            сreditCardPage.checkСardsTypeBlockExists();
        });

        step("Проверяем, что блок с шагами доставки присутствует на странице", () -> {
            сreditCardPage.checkDeliveryStepsBlockExists();
        });

        step("Проверяем, что блок Настройте свою карту присутствует на странице", () -> {
            сreditCardPage.checkSetCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта ALL Airlines присутствует на странице", () -> {
            сreditCardPage.checkAllAirlinesCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта ALL Airlines Premium присутствует на странице", () -> {
            сreditCardPage.checkAllAirlinesPremiumCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта Tinkoff Drive присутствует на странице", () -> {
            сreditCardPage.checkTinkoffDriveCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта ALL Games присутствует на странице", () -> {
            сreditCardPage.checkAllGamesCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта S7 — Tinkoff присутствует на странице", () -> {
            сreditCardPage.checkCreditTinkoffCardBlockExists();
        });
        step("Проверяем, что блок Кредитная карта S7 — Tinkoff Premium присутствует на странице", () -> {
            сreditCardPage.checkCreditTinkoPremiumffCardBlockExists();
        });
        step("Проверяем, что футер присутствует на странице", () -> {
            сreditCardPage.checkFooterExists();
        });
    }
}