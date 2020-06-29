package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage {

    // Forma normal de llamar un elemnto sin pageFactory
    //private By pageTittleLocator = By.className("page-title");

    // Forma de llamar elementos con pageFactory
    @FindBy(className = "page-title")
    private WebElement titleLocator;

    private String titlePage = "Category: comics";


    public ComicsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception{
        return this.isDysplayed(titleLocator) && this.getText(titleLocator).equals(titlePage);
    }


}
