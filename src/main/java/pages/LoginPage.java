package pages;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "bc-input-username")
    private WebElement emailTextField;
    @FindBy(id = "bc-input-password")
    private WebElement passwordTextField;
    @FindBy(id = "bc-btn-login-submit")
    private WebElement loginButton;
    @FindBy(css = "[class='bc-alert bc-alert-danger bc-text-s']")
    private WebElement errorMessageText;

    @Description("Mail adresi ve şifre girilir, login butonuna tıklanır.")
    public void login(String email, String password) {
        writeText(emailTextField, email);
        writeText(passwordTextField, password);
        click(loginButton);
    }

    @Description("Hata mesajının doğruluğu kontrol edilir.")
    public void verifyErrorMessage(String expectedText) {
        Assert.assertEquals(readText(errorMessageText), expectedText);
    }

}
