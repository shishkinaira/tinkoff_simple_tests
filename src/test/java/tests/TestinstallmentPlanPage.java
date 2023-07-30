package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HomePage;
import pages.InstallmentPlanPage;

import static io.qameta.allure.Allure.step;


public class TestinstallmentPlanPage extends TestBase {
    InstallmentPlanPage installmentPlanPage = new InstallmentPlanPage();
    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница о Рассрочках содержит основные блоки")
    public void homePageBlocksExists() {
        step("Открываем главную страницу", () -> {
            installmentPlanPage.openPage();
        });

        step("Проверяем, что блок верхнего меню присутствует на странице", () -> {
            installmentPlanPage.checkHeaderBlockExists();
        });

        step("Проверяем, что основной блок присутствует на странице", () -> {
            installmentPlanPage.checkRecomendedProductsBlockExists();
        });

        step("Проверяем, что блок Нам доверяют присутствует на странице", () -> {
            installmentPlanPage.checkpurchaseTermsBlockExists();
        });

        step("Проверяем, что блок POS код присутствует на странице", () -> {
            installmentPlanPage.checkPOSExists();
        });

        step("Проверяем, что футер присутствует на странице", () -> {
            installmentPlanPage.checkFooterExists();
        });
    }
}