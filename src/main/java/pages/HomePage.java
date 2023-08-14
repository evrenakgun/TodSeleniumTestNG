package pages;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Description("Giriş yapma ekranına götüren buton.")
    @FindBy(css = "[class='header-login-btn header-top__link ThecodeButton1']")
    public WebElement loginButton;

    @Description("Giriş yapma sayfasına git.")
    public void goToLoginPage() {
        click(loginButton);
    }

}
