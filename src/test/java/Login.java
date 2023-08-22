import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class Login {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Before
    public void setupBrowser() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VKhachatryan\\Downloads\\chromedriver-win64\\chromedriver.exe");

    }

    @Test
    public void fillFormTest() {

        open("https://vladimir-test.softrust.ru/cc_dev/to_work/?login=yes");
        $("#USER_LOGIN").setValue("ccg");
        $("#USER_PASSWORD").setValue("ccg123");

        /*$("#output #USER_LOGIN").shouldHave(text("ccg"));
        $("#output #USER_PASSWORD").shouldHave(text("ccg123"));*/

        $(".bx-auth-table button").click();
        $(".text-center").shouldBe(visible);
    }

}