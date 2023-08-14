package pages;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProfileSelectionPage extends BasePage {
    public ProfileSelectionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[class='profile mainprofil']")
    private WebElement mainProfileCard;

    @Description("Giriş yaptıktan sonra öncesinde açılmış profilin ismi gözüküyor mu diye kontrol edilir.")
    public boolean isDisplayedUserCard() {
        return wait.until(ExpectedConditions.visibilityOf(mainProfileCard)).isDisplayed();
    }

    public void clickMainProfile() {
        click(mainProfileCard);
    }

}
