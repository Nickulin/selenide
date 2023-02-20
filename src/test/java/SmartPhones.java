import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class SmartPhones {
    private final SelenideElement clickOnSmarts = $x("//input[@data-meta-name='FilterPriceGroup__input-max'][1]");
    static ElementsCollection clickOnSmartForeachs = $$("//div[@data-meta-value='Бренд']//div[@data-meta-name]//label");

    public void clickOnSmarts() {
        clickOnSmarts.setValue("20000");
    }

    public void clickOnSmartForeach() {
        for (int i = 0; i <= 6; i++) {
            clickOnSmartForeachs.get(i).click();
        }
    }
}
