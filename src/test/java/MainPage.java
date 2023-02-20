import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement catalogButton = $x("//span[text()='Каталог товаров']");
    private final SelenideElement clickOnSmartPhone = $x("//div[@class='PopupScrollContainer']//span[text()='Смартфоны и гаджеты']");

    public MainPage(String url) {
        Selenide.open(url);
    }

    public void clickOnCatalog() {
        catalogButton.click();
    }
    public void clickOnSmartPhone() {
        clickOnSmartPhone.click();
    }


}


