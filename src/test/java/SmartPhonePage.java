import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class SmartPhonePage {

    private final SelenideElement smartPhones = $x("//span[text()='Смартфоны']");

    public void smartPhones() {
        smartPhones.click();
    }
}

