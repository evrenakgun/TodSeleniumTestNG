import com.sun.org.glassfish.gmbal.Description;
import org.testng.annotations.Test;
import pages.*;
import pages.ProfileSelectionPage;

import static util.Constants.*;

public class LoginTests extends BaseTest {

    @Description("Sitede kaydı olmayan bir email adresini kullanarak yanlış şifre ile giriş kontrolü yapılacaktır.")
    @Test (priority = 0, description = "Login doğrulaması yapılmaktadır.")
    public void invalidLoginTest_InvalidEmailInvalidPassword() {
        page.GetInstance(HomePage.class).goToTodTv();
        page.GetInstance(HomePage.class).goToLoginPage();
        page.GetInstance(LoginPage.class).login("deneme@gmail.com", "123123Deneme");
        page.GetInstance(LoginPage.class).verifyErrorMessage(ERROR_TEXT_INVALID_EMAIL);
    }

    @Description("Sitede kaydı olan bir email adresini kullanarak yanlış şifre ile giriş kontrolü yapılacaktır.")
    @Test (priority = 1, description = "Login doğrulaması yapılmaktadır.")
    public void invalidLoginTest_ValidEmailInvalidPassword() {
        page.GetInstance(HomePage.class).goToTodTv();
        page.GetInstance(HomePage.class).goToLoginPage();
        page.GetInstance(LoginPage.class).login("evrenakgun3@gmail.com", "123123Deneme");
        page.GetInstance(LoginPage.class).verifyErrorMessage(ERROR_TEXT_INVALID_PASSWORD);
    }

    @Description("Sitede kaydı olan bir email adresini kullanarak doğru şifre ile giriş kontrolü yapılacaktır.")
    @Test (priority = 2, description = "Login doğrulaması yapılmaktadır.")
    public void successfulLoginTest() {
        page.GetInstance(HomePage.class).goToTodTv();
        page.GetInstance(HomePage.class).goToLoginPage();
        page.GetInstance(LoginPage.class).login(EMAIL, PASSWORD);
        page.GetInstance(ProfileSelectionPage.class).isDisplayedUserCard();
    }
}
