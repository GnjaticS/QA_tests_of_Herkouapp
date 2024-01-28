package Tests;

import Base.BaseTest;
import Pages.AddButton;
import Pages.BrokenImages;
import Pages.WelcomeToTheInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin extends BaseTest {
    public WelcomeToTheInternet welcomeToTheInternet;
    public AddButton addButton;
    public BrokenImages brokenImages;
    @BeforeMethod
    public void pageSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/");
        addButton = new AddButton();
        welcomeToTheInternet = new WelcomeToTheInternet(driver);
        brokenImages = new BrokenImages();
    }
    @Test(priority = 10)
    public void AddElement() throws InterruptedException {

        Thread.sleep(1000);
        welcomeToTheInternet.clickOnAdd();
        addButton.clickToAdd();
        //delete button is displayed
        Assert.assertTrue(addButton.delete.get(0).isDisplayed());
        addButton.clickDelete();
        Assert.assertTrue(addButton.delete.isEmpty());
    }
    @Test(priority = 20)
    public void brokenImages() throws InterruptedException, Exception {
        Thread.sleep(1000);
        welcomeToTheInternet.clickOnBroken();
        int cntBroken = 0;
        for (var img: brokenImages.images){
            if (img.getAttribute("naturalWidth").equalsIgnoreCase("0")){
                cntBroken ++;
            }
        }
        Assert.assertTrue(cntBroken == 2);
    }

    @Test (priority = 30)
    public void disappearingElements() throws InterruptedException, Exception{
        Thread.sleep(1000);
        welcomeToTheInternet.clickOnDisappearing();
        driver.navigate().refresh();

        try {
            driver.findElement(By.linkText("Gallery"));
            throw new Exception("The element is there");
        } catch (NoSuchElementException e){

        }
    }
}
