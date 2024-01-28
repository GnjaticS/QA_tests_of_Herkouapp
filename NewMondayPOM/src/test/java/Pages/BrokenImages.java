package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BrokenImages extends BaseTest {
    public BrokenImages () {
        PageFactory.initElements(driver, this);
    }
    @FindBys(
            {@FindBy(css = ".example>img")})
    public List<WebElement> images;
}

