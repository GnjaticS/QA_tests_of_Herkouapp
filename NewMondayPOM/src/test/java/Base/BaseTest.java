package Base;

import Pages.AddButton;
import Pages.BrokenImages;
import Pages.WelcomeToTheInternet;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class BaseTest {
    // Otici na sajt Herkouapp(https://the-internet.herokuapp.com/) i napisati
    // sto vise test case-eva (Vas izbor sta cete testirati) (Domaci od petka), uraditi koristeci POM.
    public static WebDriver driver;
    public WebDriverWait wait;


    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();

    }


}
