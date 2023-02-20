import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasePage {

    @Before
    public void xyz() {
        //Configuration.remote="192.168.1.1:4444";
        Configuration.remote = "http://192.168.56.1:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        //Включить поддержку отображения экрана браузера во время выполнения теста
        capabilities.setCapability("enableVNC", true);
        //Включение записи видео в процессе выполнения тестов
        capabilities.setCapability("enableVideo", true);

        //Переопределяем Browser capabilities
        Configuration.browserCapabilities = capabilities;

    }
}
