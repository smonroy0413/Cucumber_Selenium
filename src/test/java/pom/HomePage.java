package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    private String tittleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";

    //llamar elementos con pageFactory
    @FindBy(id = "menu-item-2008")
    private WebElement titleComicsLocator;

    // Forma de llamar los elementos sin pageFactory
    //private By titleComicsLocator = By.id("menu-item-2008");



    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception{
        return this.getTitle().equals(tittleHomePage);
    }

    public void clickOnTitleComics() throws Exception{
        this.click(titleComicsLocator);
    }

}
