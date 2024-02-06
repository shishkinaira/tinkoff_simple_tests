package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.GetCardFormPage;

import static helpers.RandomUtils.*;
import static io.qameta.allure.Allure.step;


public class TestGetCardFormPage extends TestBase {
    final GetCardFormPage getCardFormPage = new GetCardFormPage();

    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка на отправку пустой формы и проверка что страница о Дебетовых карта содержит основные блоки")
    public void setEmptyCardFormWorks() {

        step("Открываем страницу", () -> {
            getCardFormPage.openPage();
        });

        step("Проверяем, что блок верхнего меню присутствует на странице", () -> {
            getCardFormPage.checkHeaderBlockExists();
        });
        step("Отправляем пуcтую форму", () -> {
            getCardFormPage.submitClick();
        });

        step("Проверяем что после отправки пустой формы появляется алерт об отсутствии данных в форме", () -> {
            getCardFormPage.checkFormWasEmpty();
        });
        step("Проверяем, что футер присутствует на странице", () -> {
            getCardFormPage.checkFooterExists();
        });
    }

    @Tag("tinkoff_simple_test")
    @Test
    @DisplayName("Проверка, что страница принимает валидные данные формыи")
    public void setFullFillCardFormWorks() {

        step("Открываем страницу", () -> {
            getCardFormPage.openPage();
        });

        step("Заполняем форму ФИО, телефон, имеил, дата рождения", () -> {
            String randomFullName = getFullName(),
                    randomMobilePhone = getMobilePhone(),
                    randomDay = getRandomDay(),
                    randomMonth = getRandomMonth(),
                    randomYear = getRandomYear(),
                    randomEmail = getRandomEmail();
            getCardFormPage.openPage()
                    .setFIO(randomFullName)
                    .setMobilePhone(randomMobilePhone)
                    .setBirthDay(randomDay, randomMonth, randomYear)
                    .setRandomEmail(randomEmail);
        });

        step("Отправляем форму", () -> {
            getCardFormPage.submitClick();
        });
        step("Проверяем что форма отправлена", () -> {
            getCardFormPage.checkFormSend();
        });

    }
}