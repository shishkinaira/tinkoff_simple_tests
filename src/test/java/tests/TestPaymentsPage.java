package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.PaymentsPage;

import static io.qameta.allure.Allure.step;


public class TestPaymentsPage extends TestBase {
    final PaymentsPage paymentsPage = new PaymentsPage();

    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница о Выплатах содержит основные блоки")
    public void paymentsPageBlocksExists() {
        step("Открываем страницу", () -> {
            paymentsPage.openPage();
        });

        step("Проверяем, что блок верхнего меню присутствует на странице", () -> {
            paymentsPage.checkHeaderBlockExists();
        });

        step("Проверяем, что основной блок присутствует на странице", () -> {
            paymentsPage.checkRecomendedProductsBlockExists();
        });

        step("Проверяем, что футер присутствует на странице", () -> {
            paymentsPage.checkFooterExists();
        });
    }
}