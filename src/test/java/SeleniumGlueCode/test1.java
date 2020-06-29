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
import pom.HomePage;

import static java.lang.Thread.sleep;

public class test1 extends TestBase {


    @Given("^El usuario se encuentra en la pagina Home de imalittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {

        Assert.assertTrue(homePage.homePageIsDisplayed());

    }

    @When("^Hace click sobre el boton the little tester comics$")
    public void hace_click_sobre_el_boton_the_little_tester_comics() throws Throwable {

        homePage.clickOnTitleComics();
        //sleep(2000);
    }

    @Then("^Se debe redirigir a la pantalla Comics$")
    public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {

        Assert.assertTrue("No se redirecciono correctamente a la pagina comics",comicsPage.isTitleComicsDisplayed());
    }

}
