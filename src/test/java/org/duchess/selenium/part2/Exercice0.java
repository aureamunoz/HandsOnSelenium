package org.duchess.selenium.part2;

import org.duchess.selenium.Util;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**

 */
public class Exercice0 {

    @Test
    /**
     *    If you have firefox
     */
    public void when_trying_firefox_then_firefox_is_used() throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get(Util.getHome());
        assertThat(driver).isInstanceOf(FirefoxDriver.class);
        assertThat(driver.getTitle()).isEqualTo("Home");
        driver.close();
    }

    @Test
    /**
     *    If you have IE
     */
    public void when_trying_internet_explorer_then_firefox_is_used() throws IOException {
        WebDriver driver = null;
        //driver.close();
    }

    @Test
    public void when_trying_htmldriver_then_html_driver_is_used() throws IOException {
        WebDriver driver = new HtmlUnitDriver();
        driver.get(Util.getHome());

        assertThat(driver).isInstanceOf(HtmlUnitDriver.class);
        assertThat(driver.getTitle()).isEqualTo("Home");


        driver.close();
    }

    @Test
    /**
     *    If you have chrome
     */
    public void when_trying_chromedriver_then_chrome_is_used() throws IOException {

        System.setProperty("webdriver.chrome.driver","/Users/Aurita/Trabajo/Outils/chromedriver");

        WebDriver driver = new ChromeDriver();


        String pageUrl = Util.getHome();

        driver.get(pageUrl);


        assertThat(driver.getTitle()).isEqualTo("Home");
        assertThat(driver).isInstanceOf(ChromeDriver.class);

        //Close the driver
        driver.quit();
    }


}
