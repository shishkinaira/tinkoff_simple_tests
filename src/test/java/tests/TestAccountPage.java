package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.AccountPage;
import pages.PaymentsPage;

import static io.qameta.allure.Allure.step;


public class TestAccountPage extends TestBase {
    AccountPage accountPage = new AccountPage();
    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница о Расчетном счете содержит основные блоки")
    public void homePageBlocksExists() {
        step("Открываем главную страницу", () -> {
            accountPage.openPage();
        });

        step("Проверяем, что блок верхнего меню присутствует на странице", () -> {
            accountPage.checkHeaderBlockExists();
        });

        step("Проверяем, что основной блок присутствует на странице", () -> {
            accountPage.checkRecomendedProductsBlockExists();
        });

        step("Проверяем, что футер присутствует на странице", () -> {
            accountPage.checkFooterExists();
        });
    }
}