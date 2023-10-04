package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.TestBase;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GetCardFormPage extends TestBase {
    private final SelenideElement
            headerBlock = $("div [role='navigation']"),
            fio =  $("data-qa-type='uikit/inputFio.value.text'"),
            phone_mobile = $("input[type='tel'][name='phone_mobile']"),
            email = $("input[type='text'][name='email']"),
            birthdate = $("input[type='tel'][name='birthdate']"),
            submit= $(byText("Оформить")),
            footer =  $("div[data-module-type='productFooter']"),
            formSend = $(byText("Подтвердите мобильный телефон")),
            formIsEmptyAlert = $(byText("Укажите фамилию, имя и отчество через пробел"));

    @Step("Открываем страницу")
    public GetCardFormPage openPage() {
        open("/cards/debit-cards/tinkoff-black/?internal_source=home_main_block_button#form");
        return this;
    }
    @Step("Проверяем что хедер присутствует на странице")
    public GetCardFormPage checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }
    @Step("Проверяем что футер присутствует на странице")
    public GetCardFormPage checkFooterExists() {
        footer.should(exist);
        return this;
    }
    @Step("Заполняем форму с рандомным значением ФИО")
    public GetCardFormPage setFIO(String randomFullName) {
        fio.click();
        fio.setValue(randomFullName);
        return this;
    }
    @Step("Заполняем форму с рандомным значением номера телефона")
    public GetCardFormPage setMobilePhone(String randomMobilePhone) {
        phone_mobile.click();
        phone_mobile.setValue(randomMobilePhone);
        return this;
    }
    @Step("Заполняем форму с рандомным значением даты рождения")
    public GetCardFormPage setBirthDay(String randomDay, String randomMonth, String randomYear) {
        birthdate.click();
        birthdate.selectOption(randomDay,randomMonth,randomYear);
        return this;
    }
    @Step("Заполняем форму с рандомным значением имейла")
    public GetCardFormPage setRandomEmail(String randomEmail) {
        email.click();
        email.setValue(randomEmail);
        return this;
    }
    @Step("Отправляем форму")
    public GetCardFormPage submitClick() {
        submit.click();
        return this;
    }
    @Step("Проверяем что форма отправлена")
    public GetCardFormPage checkFormSend() {
        formSend.should(exist);
        return this;
    }
    @Step("Проверяем ответ после отправления пустой формы")
    public GetCardFormPage checkFormWasEmpty() {
        formIsEmptyAlert.should(exist);
        return this;
    }

}
