import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

public class AppTest {
    private final static String MVIDEO_MARKET = "https://www.citilink.ru";


    @Test
    public void init() throws InterruptedException {
        Configuration.browserSize = "1920x1080";
        MainPage mainPage = new MainPage(MVIDEO_MARKET);
        mainPage.clickOnCatalog();
        mainPage.clickOnSmartPhone();

        SmartPhonePage smartPhonePage = new SmartPhonePage();
        smartPhonePage.smartPhones();

        SmartPhones smartPhones = new SmartPhones();
//        smartPhones.clickOnSmarts();
        smartPhones.clickOnSmartForeach();
    }
}
