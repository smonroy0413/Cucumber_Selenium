package SeleniumGlueCode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//import java.util.function.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Test {

    private WebDriver driver = Hooks.getDriver();


    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {

        String tittleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(tittleHomePage,driver.getTitle());

    }

    @When("^Hace click sobre el boton the little tester comics$")
    public void hace_click_sobre_el_boton_the_little_tester_comics() throws Throwable {

        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();
        //sleep(2000);
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {

        WebElement pageTittleLocator = driver.findElement(By.className("page-title"));
        WebDriverWait myWait = new WebDriverWait(driver,5);
        //myWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("page-title")));
        myWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("page-header")));

        Assert.assertTrue("No se redirecciono correctamente",pageTittleLocator.isDisplayed());
        Assert.assertEquals("Category: comics",pageTittleLocator.getText());
    }

}
