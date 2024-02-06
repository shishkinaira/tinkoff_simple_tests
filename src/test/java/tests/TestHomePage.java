package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import static io.qameta.allure.Allure.step;


public class TestHomePage extends TestBase {
    final HomePage homePage = new HomePage();

    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что главная страница содержит основные блоки")
    public void homePageBlocksExists() {
        step("Открываем главную страницу", () -> {
            homePage.openPage();
        });

        step("Проверяем, что блок верхнего меню присутствует на странице", () -> {
            homePage.checkHeaderBlockExists();
        });

        step("Проверяем, что блок Рекомендуемые продукты присутствует на странице", () -> {
            homePage.checkRecomendedProductsBlockExists();
        });

        step("Проверяем, что блок Нам доверяют присутствует на странице", () -> {
            homePage.checktrustOfClientsBlockExists();
        });

        step("Проверяем, что строка поиска присутствует на странице", () -> {
            homePage.checkSearchFormExists();
        });

        step("Проверяем, что футер присутствует на странице", () -> {
            homePage.checkFooterExists();
        });
    }
}