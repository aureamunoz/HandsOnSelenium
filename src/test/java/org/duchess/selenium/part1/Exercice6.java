package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice6

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getFeatures());

    }

    @Test
    public void when_setting_text_of_bigbutton_to_totot_using_javascript_then_text_is_changed() {
    //ADD CODE HERE
        WebElement element = (WebElement) ((JavascriptExecutor)driver).executeScript("var bigbutton = document.getElementById('bigbutton');\nbigbutton.innerHTML = 'toto';\n");
        //System.out.println(driver.findElement(By.id("bigbutton")).getText());
        assertThat(driver.findElement(By.id("bigbutton")).getText()).isEqualTo("TOTO");
    }


    @After
    public void afterTest() {
        driver.quit();
    }
}
