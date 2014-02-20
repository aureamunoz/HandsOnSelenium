package org.duchess.selenium;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 * No refactoring here to show each step.
 */
public class Exercice0

{
    @Test
    public void when_go_to_index_then_index_is_on_screen() throws IOException {
        WebDriver driver = null;
        //init driver

        //go to page
        String pageUrl = Util.getHome();

        assertThat(driver.getTitle()).isEqualTo("Home");

        //Close ff


    }

}
