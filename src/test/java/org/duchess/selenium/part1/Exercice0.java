package org.duchess.selenium.part1;


import org.duchess.selenium.Util;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

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

         String pageUrl = Util.getHome();
        //go to page -   Util.getHome() return the url path for this handson


        assertThat(driver.getTitle()).isEqualTo("Home");

        //Close the driver


    }

}
