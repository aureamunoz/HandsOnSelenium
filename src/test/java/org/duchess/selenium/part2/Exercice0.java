package org.duchess.selenium.part2;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**

 */
public class Exercice0 {

    @Test
    /**
     *    If you have firefox
     */
    public void when_trying_firefox_then_firefox_is_used() throws IOException {
        WebDriver driver = null;
        driver.close();
    }

    @Test
    /**
     *    If you have IE
     */
    public void when_trying_internet_explorer_then_firefox_is_used() throws IOException {
        WebDriver driver = null;
        driver.close();
    }

    @Test
    /**
     *    If you have chrome
     */
    public void when_trying_chromedriver_then_chrome_is_used() throws IOException {
        WebDriver driver = null;
        driver.close();
    }

    @Test
    public void when_trying_htmldriver_then_html_driver_is_used() throws IOException {
        WebDriver driver = null;
        driver.close();
    }


}
