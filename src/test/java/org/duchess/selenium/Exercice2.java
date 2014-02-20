package org.duchess.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice2

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getContact());

    }

    @Test
    public void when_fill_contact_form_then_form_submit() throws IOException {
        driver.findElement(By.name("fname")).sendKeys("Mathilde");
        driver.findElement(By.name("lname")).sendKeys("Leme");
        driver.findElement(By.name("phone")).sendKeys("01");
        driver.findElement(By.name("email")).sendKeys("test@test.com");
        driver.findElement(By.name("message")).sendKeys("tems");

        driver.findElement(By.id("form")).submit();

        assertThat(driver.findElement(By.cssSelector(".mess")).getText()).contains("Thanks");


    }

    @Test
    public void when_fill_contact_form_with_no_email_then_field_is_getting_a_blue_border() {
        //Write the full test

    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
