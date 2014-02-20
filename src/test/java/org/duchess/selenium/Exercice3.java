package org.duchess.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * HandsOn - Selenium - Duchess
 */
public class Exercice3

{

    private WebDriver driver;

    @Before
    public void beforeTest() {
        driver = new FirefoxDriver();
        driver.get(Util.getFeatures());

    }

    @Test
    public void when_page_feature_then_cookie_luke_is_equal_to_skywalker() {
        String cookieValue = driver.manage().getCookieNamed("luke").getValue();
        assertThat(cookieValue).isEqualTo("skywalker");
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
