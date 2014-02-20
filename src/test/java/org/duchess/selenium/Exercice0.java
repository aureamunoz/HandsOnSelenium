package org.duchess.selenium;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

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
        WebDriver driver = new HtmlUnitDriver();
        String pageUrl = Util.getHome();
        driver.get(pageUrl);
        assertThat(driver.getTitle()).isEqualTo("Home");
        driver.quit();


    }

}
