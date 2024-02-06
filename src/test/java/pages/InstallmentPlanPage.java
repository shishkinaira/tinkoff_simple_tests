package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.VerifyFooterComponent;
import pages.components.VerifyHeaderComponent;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InstallmentPlanPage extends TestBase {
    private final VerifyHeaderComponent verifyHeaderComponentIPP = new VerifyHeaderComponent();
    private final VerifyFooterComponent verifyFooterComponentIPP = new VerifyFooterComponent();
    private final SelenideElement
            recomendedProducts = $(byText("Покупайте товары у наших партнеров в рассрочку от Тинькофф")),
            purchaseTerms = $(byText("Условия покупки")),
            POS = $(byText("Пос-кредит"));

    @Step("Открываем страницу")
    public InstallmentPlanPage openPage() {
        open("loans/pos-loans/");
        return this;
    }

    @Step("Проверяем что хедер присутствует на странице")
    public InstallmentPlanPage checkHeaderBlockExists() {
        verifyHeaderComponentIPP.checkHeaderBlockExists();
        return this;
    }

    @Step("Проверяем что футер присутствует на странице")
    public InstallmentPlanPage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    @Step("Проверяем что блок условий покупки присутствует на странице")
    public InstallmentPlanPage checkpurchaseTermsBlockExists() {
        purchaseTerms.should(exist);
        return this;
    }

    @Step("Проверяем что POS-блок присутствует на странице")
    public InstallmentPlanPage checkPOSExists() {
        POS.should(exist);
        return this;
    }

    @Step("Проверяем что футер присутствует на странице")
    public InstallmentPlanPage checkFooterExists() {
        verifyFooterComponentIPP.checkFooterBlockExists();
        return this;
    }
}
