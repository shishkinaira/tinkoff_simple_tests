package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.InsurancePage;

import static io.qameta.allure.Allure.step;


public class TestInsurancePage extends TestBase {
    InsurancePage insurancePage = new InsurancePage();
    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница о Страховых продуктах содержит основные блоки")
    public void homePageBlocksExists() {
        step("Открываем страницу", () -> {
            insurancePage.openPage();
        });

        step("Проверяем, что блок верхнего меню присутствует на странице", () -> {
            insurancePage.checkHeaderBlockExists();
        });

        step("Проверяем, что основной блок присутствует на странице", () -> {
            insurancePage.checkRecomendedProductsBlockExists();
        });

        step("Проверяем, что футер присутствует на странице", () -> {
            insurancePage.checkFooterExists();
        });
    }
}