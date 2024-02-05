package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.VerifyFooterComponent;
import pages.components.VerifyHeaderComponent;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GetCardFormPage extends TestBase {
    VerifyHeaderComponent verifyHeaderComponentGCFP = new VerifyHeaderComponent();
    VerifyFooterComponent verifyFooterComponentGCFP = new VerifyFooterComponent();

    private final SelenideElement
            fio = $("input[type='text'][name='fio']"),
            phone_mobile = $("input[type='tel'][name='phone_mobile']"),
            email = $("input[type='text'][name='email']"),
            birthdate = $("input[type='tel'][name='birthdate']"),
            submit = $(byText("Оформить")),
            formSend = $(byText("Подтвердите мобильный телефон"));

    @Step("Открываем страницу")
    public GetCardFormPage openPage() {
        open("/cards/debit-cards/tinkoff-black/?internal_source=home_main_block_button#form");
        return this;
    }

    @Step("Проверяем что хедер присутствует на странице")
    public GetCardFormPage checkHeaderBlockExists() {
        verifyHeaderComponentGCFP.checkHeaderBlockExists();
        return this;
    }

    @Step("Проверяем что футер присутствует на странице")
    public GetCardFormPage checkFooterExists() {
        verifyFooterComponentGCFP.checkFooterBlockExists();
        return this;
    }

    @Step("Проверяем ответ после отправления пустой формы")
    public GetCardFormPage checkFormWasEmpty() {
        submit.should(exist);
        return this;
    }

    @Step("Заполняем форму с рандомным значением ФИО")
    public GetCardFormPage setFIO(String randomFullName) throws InterruptedException {
        fio.sendKeys(randomFullName);
        return this;
    }

    @Step("Заполняем форму с рандомным значением номера телефона")
    public GetCardFormPage setMobilePhone(String randomMobilePhone) {
        phone_mobile.sendKeys(randomMobilePhone);
        return this;
    }

    @Step("Заполняем форму с рандомным значением даты рождения")
    public GetCardFormPage setBirthDay(String randomDay, String randomMonth, String randomYear) {
        birthdate.sendKeys(randomDay, randomMonth, randomYear);
        return this;
    }

    @Step("Заполняем форму с рандомным значением имейла")
    public GetCardFormPage setRandomEmail(String randomEmail) {
        email.sendKeys(randomEmail);
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


}
