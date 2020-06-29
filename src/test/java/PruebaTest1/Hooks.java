package PruebaTest1;

import Runner.browser_manager.DriverManager;
import Runner.browser_manager.DriverManagerFactory;
import Runner.browser_manager.DriverType;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {

    /*metodo que se ejecuta antes de cada test*/

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before /*la de cucumber*/
    public void setUp(){
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://imalittletester.com/");
    }

    /* metodo que se ejecuta despues de cada test*/

    @After /*la de cucumber*/
    public void tearDown(){

        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }

}
