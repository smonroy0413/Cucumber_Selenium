package Runner.browser_manager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManager {

    //variable la cual solo la pueden ver la calse principal (esta) y las clases hijas.
    protected WebDriver driver;

    protected abstract void createDriver();

    public void quitDriver(){

        if (driver != null){

            driver.quit();
            driver = null;
        }
    }

    public WebDriver getDriver(){

        if (driver == null){

            createDriver();
        }
        return driver;
    }
}
