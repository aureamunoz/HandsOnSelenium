package org.duchess.selenium.part1;


import org.duchess.selenium.Util;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

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
        //WebDriver driver = null;
        //init driver

        System.setProperty("webdriver.chrome.driver","/Users/Aurita/Trabajo/Outils/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        String pageUrl = Util.getHome();

        driver.get(pageUrl);
        //go to page -   Util.getHome() return the url path for this handson


        assertThat(driver.getTitle()).isEqualTo("Home");

        //Close the driver
        driver.quit();



    }

}
