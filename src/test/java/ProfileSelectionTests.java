import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfileSelectionPage;

import static util.Constants.*;

public class ProfileSelectionTests extends BaseTest {

    @Test
    public void goToProfile() {
        page.GetInstance(HomePage.class).goToTodTv();
        page.GetInstance(HomePage.class).goToLoginPage();
        page.GetInstance(LoginPage.class).login(EMAIL, PASSWORD);
        page.GetInstance(ProfileSelectionPage.class).isDisplayedUserCard();
        page.GetInstance(ProfileSelectionPage.class).clickMainProfile();
    }
}
