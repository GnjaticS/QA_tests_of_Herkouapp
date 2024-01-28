package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class WelcomeToTheInternet {
    public WelcomeToTheInternet(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Add/Remove Elements")
    public WebElement addButton;
    @FindBy(linkText = "Broken Images")
    public WebElement brokenImg;
    @FindBy (linkText = "Disappearing Elements")
    public WebElement disappearing;

    public void clickOnAdd(){
        addButton.click();
    }
    public void clickOnBroken(){
        brokenImg.click();
    }
    public void clickOnDisappearing(){
        disappearing.click();
    }

}
