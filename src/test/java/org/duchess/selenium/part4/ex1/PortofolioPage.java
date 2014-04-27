package org.duchess.selenium.part4.ex1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PortofolioPage {
    private final WebDriver driver;


    public PortofolioPage(WebDriver driver){
        this.driver=driver;
        String title ="ONIX Responsive Business &amp; Portfolio Template";
        if(title.equals(driver.getTitle())){
            throw new IllegalArgumentException("not right page");
        }
    }

    public PortofolioPage goToWebTab(){
        driver.findElement(By.ByLinkText.linkText("WEB")).click();
        return this;
    }

    public PortofolioPage waitForElements (){
        (new WebDriverWait(this.driver, 10))
                .until(new ExpectedCondition<Boolean>() {
                    @Override
                    public Boolean apply(WebDriver driver) {
                        return driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)")).size() == 4;
                    }
                });
        return this;
    }

    public int getNumberOfImagesShown (){
        List<WebElement> images = driver.findElements(By.cssSelector("#containment-portfolio li:not(.hidden)"));
        return images.size();
    }

    public int getNumberOfPortfolioContainers (){
        List<WebElement> container = driver.findElements(By.cssSelector("#containment-portfolio"));
        return container.size();
    }


}
