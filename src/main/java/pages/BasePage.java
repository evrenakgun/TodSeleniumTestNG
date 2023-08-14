package pages;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageGenerator {
    WebDriverWait wait = new WebDriverWait(this.driver, 10);
    public BasePage(WebDriver driver) {
        super(driver);
    }

    String baseUrl = "https://www.todtv.com.tr/";

    @Description("Ana sayfaya git.")
    public void goToTodTv () {
        driver.get(baseUrl);
    }

    @Description("Web element ile tıklama yapılabilmesi için generic metot.")
    public void click (WebElement elementLocation) {
        elementLocation.click();
    }

    @Description("Web element ile text girilmesi için generic metot.")
    public void writeText (WebElement elementLocation, String text) {
        elementLocation.sendKeys(text);
    }

    @Description("Web element ile text okuması için generic metot.")
    public String readText (WebElement elementLocation) {
        return elementLocation.getText();
    }

    // TODO


}
