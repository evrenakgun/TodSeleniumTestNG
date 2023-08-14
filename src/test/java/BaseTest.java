import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pages.PageGenerator;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    PageGenerator page;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(this.driver, 10);
        driver.manage().window().maximize();

        page = new PageGenerator(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
