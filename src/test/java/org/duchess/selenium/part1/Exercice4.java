package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice4
{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getFeatures());

    }

    @Test
    public void when_accepting_alert_then_text_changed() {
        driver.findElement(By.id("bigbutton")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();

        assertThat(driver.findElement(By.id("bigbutton")).getText()).isEqualTo("CHANGED !");
    }

    @Test
    public void when_not_accepting_alert_then_text_not_changed() {
        driver.findElement(By.id("bigbutton")).click();

        //ADD CODE HERE
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

        assertThat(driver.findElement(By.id("bigbutton")).getText()).isEqualTo("NOT CHANGED !");
    }


    @After
    public void afterTest() {
        driver.quit();
    }
}
