package Pages;

import Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AddButton extends BaseTest {

    public AddButton() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "button[onclick=\"addElement()\"]")
    public WebElement addButton;

    @FindBys({
            @FindBy(className = "added-manually")
    })
    public List<WebElement> delete;

    public void clickToAdd() {
        addButton.click();
    }
    public void clickDelete(){
        delete.get(0).click();
    }

}

