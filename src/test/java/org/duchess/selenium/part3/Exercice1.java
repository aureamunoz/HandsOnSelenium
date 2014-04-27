package org.duchess.selenium.part3;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Objectif : Faire passer les tests
 * Ne pas passer plus de 5 min sur le deuxieme test.
 */
public class Exercice1 {

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getPortfolio());

    }

    @Test
    public void when_click_to_next_then_new_datas_with_implicit_wait() throws InterruptedException {
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio")).size()).isEqualTo(1);
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertThat(driver.findElements(By.cssSelector(".audio.hidden")).size()).isEqualTo(1);
    }

    @Test
    //Appelez nous quand vous voyez le probleme
    public void when_click_to_next_then_new_datas_with_implicit_wait_2() throws InterruptedException {
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio")).size()).isEqualTo(1);
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size()).isEqualTo(4);
    }


    @Test //utiliser expectedConditions
    public void when_click_to_next_then_new_datas_with_explicit_wait() throws InterruptedException {
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio")).size()).isEqualTo(1);
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#containment-portfolio li:not(.hidden)")));
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size()).isEqualTo(4);
    }

    @Test //créer votre propre expectedCondition
    public void when_click_to_next_then_new_datas_with_explicit_wait_2() throws InterruptedException {
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio")).size()).isEqualTo(1);
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Object>() {
            @Override
            public Object apply(WebDriver webDriver) {
                return driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size()==4;
            }
        });
        assertThat(driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size()).isEqualTo(4);
    }


    @After
    public void afterTest() {
        driver.quit();
    }

}
