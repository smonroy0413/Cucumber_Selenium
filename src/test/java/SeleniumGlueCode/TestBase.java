package SeleniumGlueCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.ComicsPage;
import pom.HomePage;

public class TestBase {
    private PageFactory pageFactory;
    protected WebDriver driver = Hooks.getDriver();
    //  Paginas con POM
    //protected HomePage homePage = new HomePage(driver);
    //protected ComicsPage comicsPage = new ComicsPage(driver);


    // Paginas con Page objet factory
    protected HomePage homePage = pageFactory.initElements(driver, HomePage.class);
    protected ComicsPage comicsPage = pageFactory.initElements(driver, ComicsPage.class);
}
