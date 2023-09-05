package pages;

import com.codeborne.selenide.SelenideElement;
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


    public InstallmentPlanPage openPage() {
        open("loans/pos-loans/");
        return this;
    }

    public InstallmentPlanPage checkHeaderBlockExists() {
        headerBlock.should(exist);
        return this;
    }

    public InstallmentPlanPage checkRecomendedProductsBlockExists() {
        recomendedProducts.should(exist);
        return this;
    }

    public InstallmentPlanPage checkpurchaseTermsBlockExists() {
        purchaseTerms.should(exist);
        return this;
    }

    public InstallmentPlanPage checkPOSExists() {
        POS.should(exist);
        return this;
    }
    public InstallmentPlanPage checkFooterExists() {
        footer.should(exist);
        return this;
    }
}
