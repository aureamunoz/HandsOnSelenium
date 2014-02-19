package org.duchess.selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 * No refactoring here to show each step.
 */
public class Exercice1

{
    @Test
    public void when_clicking_to_link_about_then_page_is_about() throws IOException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get(Util.getPath() + "index.html");
        driver.findElement(By.id("about")).click();
        assertThat(driver.getTitle()).isEqualTo("About");
        driver.quit();
    }

    @Test
    public void when_clicking_to_link_blog_then_page_blog() throws IOException {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get(Util.getPath() + "index.html");
        driver.findElement(By.linkText("Blog")).click();
        assertThat(driver.getTitle()).isEqualTo("About");
        driver.quit();
    }
}