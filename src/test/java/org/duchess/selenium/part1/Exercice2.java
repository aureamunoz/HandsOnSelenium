package org.duchess.selenium.part1;

import org.duchess.selenium.Util;
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
        // ADD CODE HERE
        driver.findElement(By.id("fname")).sendKeys("Aurea");
        driver.findElement(By.id("lname")).sendKeys("Munoz");
        driver.findElement(By.id("email")).sendKeys("aurea.munioz@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("0188776655");
        driver.findElement(By.id("message")).sendKeys("lbkjalñkdjflaskdjflksjd");
        driver.findElement(By.id("submit")).click();


        assertThat(driver.findElement(By.cssSelector(".mess")).getText()).contains("Thanks");


    }

    @Test
    public void when_fill_contact_form_with_no_email_then_field_is_getting_a_blue_border() {
        //Write the full test

        driver.findElement(By.id("fname")).sendKeys("Aurea");
        driver.findElement(By.id("lname")).sendKeys("Munoz");
        driver.findElement(By.id("phone")).sendKeys("0188776655");
        //driver.findElement(By.id("message")).sendKeys("lbkjalñkdjflaskdjflksjd");
        driver.findElement(By.id("submit")).click();

        String rgb[] = driver.findElement(By.name("email")).getCssValue("border-bottom-color").replaceAll("(rgba)|(rgb)|(\\()|(\\s)|(\\))","").split(",");
        String hex = String.format("#%s%s%s", toBrowserHexValue(Integer.parseInt(rgb[0])), toBrowserHexValue(Integer.parseInt(rgb[1])), toBrowserHexValue(Integer.parseInt(rgb[2])));

        assertThat(hex).isEqualTo("#2293A7");

    }

    private static String toBrowserHexValue(int number) {
        StringBuilder builder = new StringBuilder(Integer.toHexString(number & 0xff));
        while (builder.length() < 2) {
            builder.append("0");
        }
        return builder.toString().toUpperCase();
    }

    @After
    public void afterTest() {
        driver.quit();
    }

}
