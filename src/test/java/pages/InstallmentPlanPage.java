package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tests.TestBase;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class InstallmentPlanPage extends TestBase {
    private final SelenideElement
            headerBlock = $("div [role='navigation']"),
            recomendedProducts = $(byText("Покупайте товары у наших партнеров в рассрочку от Тинькофф")),
            purchaseTerms = $(byText("Условия покупки")),
            POS = $(byText("POS-кредит")),
            footer =  $("footer");

    @Step("Открываем страницу")
    public InstallmentPlanPage openPage() {
        open("loans/pos-loans/");
        return this;
    }
    @Step("Проверяем что хедер присутствует на странице")
    public InstallmentPlanPage checkHeaderBlockExists() {
        headerBlock.should(exist);
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
        footer.should(exist);
        return this;
    }
}
